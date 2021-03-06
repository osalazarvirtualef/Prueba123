package com.virtualef.pgj.dto;

import com.demomapas.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.datanucleus.query.JPACursorHelper;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "pruebaendpoint", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.dto"))
public class PruebaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listPrueba")
	public CollectionResponse<Prueba> listPrueba(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Prueba> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Prueba as Prueba");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Prueba>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Prueba obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Prueba> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getPrueba")
	public Prueba getPrueba(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Prueba prueba = null;
		try {
			prueba = mgr.find(Prueba.class, id);
		} finally {
			mgr.close();
		}
		return prueba;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param prueba the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertPrueba")
	public Prueba insertPrueba(Prueba prueba) {
		EntityManager mgr = getEntityManager();
		try {
			mgr.persist(prueba);
		} finally {
			mgr.close();
		}
		return prueba;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param prueba the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updatePrueba")
	public Prueba updatePrueba(Prueba prueba) {
		EntityManager mgr = getEntityManager();
		try {
			Prueba item = mgr.find(Prueba.class, prueba.getKey().getId());
			if (item != null) {
				Key parentKey = item.getKey();
				item = prueba;
				item.setKey(parentKey);
				mgr.persist(item);
			} else {
				throw new EntityNotFoundException("Object does not exist");
			}
		} finally {
			mgr.close();
		}
		return prueba;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removePrueba")
	public void removePrueba(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Prueba prueba = mgr.find(Prueba.class, id);
			mgr.remove(prueba);
		} finally {
			mgr.close();
		}
	}

	private boolean containsPrueba(Prueba prueba) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Prueba item = mgr.find(Prueba.class, prueba.getKey().getId());
			System.out.println("item diff null");
			System.out.println(item == null);
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

