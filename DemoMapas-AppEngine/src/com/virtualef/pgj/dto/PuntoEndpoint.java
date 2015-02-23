package com.virtualef.pgj.dto;

import com.demomapas.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JPACursorHelper;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "puntoendpoint", namespace = @ApiNamespace(ownerDomain = "demomapas.com", ownerName = "demomapas.com", packagePath = ""))
public class PuntoEndpoint {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listPunto")
	public CollectionResponse<Punto> listPunto(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Punto> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Punto as Punto");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Punto>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (Punto obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Punto> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getPunto")
	public Punto getPunto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		Punto punto = null;
		try {
			punto = mgr.find(Punto.class, id);
		} finally {
			mgr.close();
		}
		return punto;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param punto the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertPunto")
	public Punto insertPunto(Punto punto) {
		EntityManager mgr = getEntityManager();
		try {
			if (containsPunto(punto)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(punto);
		} finally {
			mgr.close();
		}
		return punto;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param punto the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updatePunto")
	public Punto updatePunto(Punto punto) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsPunto(punto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(punto);
		} finally {
			mgr.close();
		}
		return punto;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removePunto")
	public void removePunto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			Punto punto = mgr.find(Punto.class, id);
			mgr.remove(punto);
		} finally {
			mgr.close();
		}
	}

	private boolean containsPunto(Punto punto) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			Punto item = mgr.find(Punto.class, punto.getId());
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
	@ApiMethod(name = "getLast")
	public CollectionResponse<Punto> getLast(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<Punto> execute = null;
		List<Punto> execute2 = new ArrayList();

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from Punto as Punto  ORDER BY Punto.Id DESC");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<Punto>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			if(execute != null && execute.size()!=0){
				execute2.add(execute.get(0));
			}
			for (Punto obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<Punto> builder().setItems(execute2)
				.setNextPageToken(cursorString).build();
	}

}
