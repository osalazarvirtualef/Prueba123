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

@Api(name = "tareaendpoint", namespace = @ApiNamespace(ownerDomain = "demomapas.com", ownerName = "demomapas.com", packagePath = "model"))
public class TareaEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listTarea")
	public CollectionResponse<Tarea> listTarea(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Tarea> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Tarea as Tarea");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Tarea>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Tarea obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Tarea> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getTarea")
	public Tarea getTarea(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Tarea tarea = null;
		try {
			tarea = mgr.find(Tarea.class, id);
		} finally {
			mgr.close();
		}
		return tarea;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param tarea the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertTarea")
	public Tarea insertTarea(Tarea tarea) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsTarea(tarea)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(tarea);
		} finally {
			mgr.close();
		}
		return tarea;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param tarea the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateTarea")
	public Tarea updateTarea(Tarea tarea) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsTarea(tarea)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(tarea);
		} finally {
			mgr.close();
		}
		return tarea;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeTarea")
	public void removeTarea(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Tarea tarea = mgr.find(Tarea.class, id);
			mgr.remove(tarea);
		} finally {
			mgr.close();
		}
	}

	private boolean containsTarea(Tarea tarea) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Tarea item = mgr.find(Tarea.class, tarea.getId());
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
