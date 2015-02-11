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

@Api(name = "zonaendpoint", namespace = @ApiNamespace(ownerDomain = "demomapas.com", ownerName = "demomapas.com", packagePath = "model"))
public class ZonaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listZona")
	public CollectionResponse<Zona> listZona(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Zona> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Zona as Zona");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Zona>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Zona obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Zona> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getZona")
	public Zona getZona(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Zona zona = null;
		try {
			zona = mgr.find(Zona.class, id);
		} finally {
			mgr.close();
		}
		return zona;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param zona the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertZona")
	public Zona insertZona(Zona zona) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsZona(zona)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(zona);
		} finally {
			mgr.close();
		}
		return zona;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param zona the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateZona")
	public Zona updateZona(Zona zona) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsZona(zona)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(zona);
		} finally {
			mgr.close();
		}
		return zona;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeZona")
	public void removeZona(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Zona zona = mgr.find(Zona.class, id);
			mgr.remove(zona);
		} finally {
			mgr.close();
		}
	}

	private boolean containsZona(Zona zona) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Zona item = mgr.find(Zona.class, zona.getId());
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
