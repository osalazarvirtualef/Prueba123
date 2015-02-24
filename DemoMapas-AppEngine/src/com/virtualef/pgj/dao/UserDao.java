package com.virtualef.pgj.dao;

import com.demomapas.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.datanucleus.query.JPACursorHelper;
import com.virtualef.pgj.dto.UserDto;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "userdtoendpoint", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.dao"))
public class UserDao {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listUserDto")
	public CollectionResponse<UserDto> listUserDto(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<UserDto> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from UserDto as UserDto");
			if (cursorString != null && cursorString != "") {
				cursor = Cursor.fromWebSafeString(cursorString);
				query.setHint(JPACursorHelper.CURSOR_HINT, cursor);
			}

			if (limit != null) {
				query.setFirstResult(0);
				query.setMaxResults(limit);
			}

			execute = (List<UserDto>) query.getResultList();
			cursor = JPACursorHelper.getCursor(execute);
			if (cursor != null)
				cursorString = cursor.toWebSafeString();

			// Tight loop for fetching all entities from datastore and accomodate
			// for lazy fetch.
			for (UserDto obj : execute)
				;
		} finally {
			mgr.close();
		}

		return CollectionResponse.<UserDto> builder().setItems(execute)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getUserDto")
	public UserDto getUserDto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		UserDto userdto = null;
		try {
			userdto = mgr.find(UserDto.class, id);
		} finally {
			mgr.close();
		}
		return userdto;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param userdto the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertUserDto")
	public UserDto insertUserDto(UserDto userdto) {
		EntityManager mgr = getEntityManager();
		try {
			userdto.setId(com.virtualef.pgj.dao.ApiDaoSynchronize.getInstance().getNextId(UserDto.class.getName(), mgr));
			if (containsUserDto(userdto)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(userdto);
		} finally {
			mgr.close();
		}
		return userdto;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param userdto the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateUserDto")
	public UserDto updateUserDto(UserDto userdto) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsUserDto(userdto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(userdto);
		} finally {
			mgr.close();
		}
		return userdto;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeUserDto")
	public void removeUserDto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			UserDto userdto = mgr.find(UserDto.class, id);
			mgr.remove(userdto);
		} finally {
			mgr.close();
		}
	}

	private boolean containsUserDto(UserDto userdto) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			UserDto item = mgr.find(UserDto.class, userdto.getId());
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
