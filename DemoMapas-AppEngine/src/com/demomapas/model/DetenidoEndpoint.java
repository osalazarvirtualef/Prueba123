package com.demomapas.model;

import com.demomapas.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JPACursorHelper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "detenidoendpoint", namespace = @ApiNamespace(ownerDomain = "demomapas.com", ownerName = "demomapas.com", packagePath = "model"))
public class DetenidoEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listDetenido")
	public CollectionResponse<Detenido> listDetenido(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Detenido> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Detenido as Detenido");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Detenido>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Detenido obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Detenido> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getDetenido")
	public Detenido getDetenido(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Detenido detenido = null;
		try {
			detenido = mgr.find(Detenido.class, id);
		} finally {
			mgr.close();
		}
		return detenido;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param detenido the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertDetenido")
	public Detenido insertDetenido(Detenido detenido) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsDetenido(detenido)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(detenido);
		} finally {
			mgr.close();
		}
		return detenido;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param detenido the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateDetenido")
	public Detenido updateDetenido(Detenido detenido) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsDetenido(detenido)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(detenido);
		} finally {
			mgr.close();
		}
		return detenido;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeDetenido")
	public void removeDetenido(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Detenido detenido = mgr.find(Detenido.class, id);
			mgr.remove(detenido);
		} finally {
			mgr.close();
		}
	}

	@ApiMethod(name = "getLast")
	public CollectionResponse<Detenido> getLast(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Detenido> execute = null;
		ArrayList<Detenido> execute2 = new ArrayList();

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Detenido as Detenido  ORDER BY Detenido.id DESC");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Detenido>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			if(execute != null && execute.size()!=0){
				execute2.add(execute.get(0));
			}
			for (Detenido obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Detenido> builder().setItems(execute2)
				.setNextPageToken(cursorString).build();
	}
	private boolean containsDetenido(Detenido detenido) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Detenido item = mgr.find(Detenido.class, detenido.getId());
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
