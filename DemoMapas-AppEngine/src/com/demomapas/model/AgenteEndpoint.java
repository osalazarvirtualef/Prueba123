package com.demomapas.model;

import com.demomapas.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JPACursorHelper;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import sun.management.resources.agent;

@Api(name = "agenteendpoint", namespace = @ApiNamespace(ownerDomain = "demomapas.com", ownerName = "demomapas.com", packagePath = "model"))
public class AgenteEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listAgente")
	public CollectionResponse<Agente> listAgente(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Agente> execute = null;
		Query query;

		try {
			mgr = getEntityManager();
			
		    query = mgr.createQuery("select from Agente as Agente");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Agente>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Agente obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Agente> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getAgente")
	public Agente getAgente(@Named("id") Long id,@Named("usuario")String usuario,@Named("password")String password) {
		EntityManager mgr = getEntityManager();
		Agente agente = null;
		Long id2 = 0l;
		if(id==0){
			CollectionResponse<Agente> agentes = new AgenteEndpoint().listAgente(null, null);
			for (Agente elementos : agentes.getItems()) {
				if(elementos.getUsuario().equalsIgnoreCase(usuario)&&elementos.getPassword().equalsIgnoreCase(password)){
					
					id2 = elementos.getId();
				}
				try {
					agente = mgr.find(Agente.class, id2);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		else
		try {
			agente = mgr.find(Agente.class, id);
		} finally {
			mgr.close();
		}
		return agente;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param agente the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertAgente")
	public Agente insertAgente(Agente agente) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsAgente(agente)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(agente);
		} finally {
			mgr.close();
		}
		return agente;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param agente the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateAgente")
	public Agente updateAgente(Agente agente) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsAgente(agente)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(agente);
		} finally {
			mgr.close();
		}
		return agente;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeAgente")
	public void removeAgente(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Agente agente = mgr.find(Agente.class, id);
			mgr.remove(agente);
		} finally {
			mgr.close();
		}
	}

	private boolean containsAgente(Agente agente) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Agente item = mgr.find(Agente.class, agente.getId());
			if (item == null) {
				contains = false;
			}
		} finally {
			mgr.close();
		}
		return contains;
	}

	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}

}
