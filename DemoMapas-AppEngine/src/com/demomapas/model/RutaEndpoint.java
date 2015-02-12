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

@Api(name = "rutaendpoint", namespace = @ApiNamespace(ownerDomain = "demomapas.com", ownerName = "demomapas.com", packagePath = "model"))
public class RutaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listRuta")
	public CollectionResponse<Ruta> listRuta(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Ruta> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Ruta as Ruta");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Ruta>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Ruta obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Ruta> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getRuta")
	public Ruta getRuta(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Ruta ruta = null;
		try {
			ruta = mgr.find(Ruta.class, id);
		} finally {
			mgr.close();
		}
		return ruta;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param ruta the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertRuta")
	public Ruta insertRuta(Ruta ruta) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsRuta(ruta)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(ruta);
		} finally {
			mgr.close();
		}
		return ruta;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param ruta the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateRuta")
	public Ruta updateRuta(Ruta ruta) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsRuta(ruta)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(ruta);
		} finally {
			mgr.close();
		}
		return ruta;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeRuta")
	public void removeRuta(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Ruta ruta = mgr.find(Ruta.class, id);
			mgr.remove(ruta);
		} finally {
			mgr.close();
		}
	}

	private boolean containsRuta(Ruta ruta) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Ruta item = mgr.find(Ruta.class, ruta.getId());
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
