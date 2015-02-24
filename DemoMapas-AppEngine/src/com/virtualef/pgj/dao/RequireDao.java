package com.virtualef.pgj.dao;

import java.util.List;

import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

import com.demomapas.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.virtualef.pgj.dto.RequireDto;

@Api(name = "requiredtoendpoint", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.dao"))
public class RequireDao {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked"})
	@ApiMethod(name = "listRequireDto")
	public CollectionResponse<RequireDto> listRequireDto() {

		EntityManager mgr = null;
		List<RequireDto> listRequire = null;
		List<com.virtualef.pgj.dto.UserDto> listUser = null;

		try {
			mgr = getEntityManager();
			Query queryRequire = mgr.createQuery("select from RequireDto as RequireDto");
			Query queryUser = mgr.createQuery("select from UserDto as UserDto");

			listRequire = (List<RequireDto>) queryRequire.getResultList();
			listUser = (List<com.virtualef.pgj.dto.UserDto>) queryUser.getResultList();
			
			for (RequireDto require : listRequire) {
				for (com.virtualef.pgj.dto.UserDto user : listUser) {
					if (user.getId() == require.getIdUser()) {
						require.setUser(user);
					}
				}
			}
			
		} finally {
			mgr.close();
		}

		return CollectionResponse.<RequireDto> builder().setItems(listRequire).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getRequireDto")
	public RequireDto getRequireDto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		RequireDto requiredto = null;
		com.virtualef.pgj.dto.UserDto userdto = null;
		try {
			requiredto = mgr.find(RequireDto.class, id);
			userdto = mgr.find(com.virtualef.pgj.dto.UserDto.class, requiredto.getIdUser());
			requiredto.setUser(userdto);
		} finally {
			mgr.close();
		}
		return requiredto;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param requiredto the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertRequireDto")
	public RequireDto insertRequireDto(RequireDto requiredto) {
		EntityManager mgr = getEntityManager();
		System.out.println("Prueba");
		try {
			requiredto.setId(com.virtualef.pgj.dao.ApiDaoSynchronize.getInstance().getNextId(RequireDto.class.getName(), mgr));
			if (containsRequireDto(requiredto)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(requiredto);
		} finally {
			mgr.close();
		}
		return requiredto;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param requiredto the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateRequireDto")
	public RequireDto updateRequireDto(RequireDto requiredto) {
		EntityManager mgr = getEntityManager();
		System.out.println("Prueba");
		try {
			if (!containsRequireDto(requiredto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(requiredto);
		} finally {
			mgr.close();
		}
		return requiredto;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeRequireDto")
	public void removeRequireDto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			RequireDto requiredto = mgr.find(RequireDto.class, id);
			mgr.remove(requiredto);
		} finally {
			mgr.close();
		}
	}

	private boolean containsRequireDto(RequireDto requiredto) {
		EntityManager mgr = getEntityManager();
		System.out.println("Prueba");
		boolean contains = true;
		try {
			RequireDto item = mgr.find(RequireDto.class, requiredto.getId());
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
