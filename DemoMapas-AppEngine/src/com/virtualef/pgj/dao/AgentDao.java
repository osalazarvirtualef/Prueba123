package com.virtualef.pgj.dao;

import com.demomapas.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.virtualef.pgj.dto.AgentDto;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "agentdtoendpoint", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.dao"))
public class AgentDao {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listAgentDto")
	public CollectionResponse<AgentDto> listAgentDto(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<AgentDto> listAgent = null;
		List<com.virtualef.pgj.dto.UserDto> listUser = null;
		

		try {
			mgr = getEntityManager();
			Query queryAgent = mgr.createQuery("select from AgentDto as AgentDto");
			Query queryUser = mgr.createQuery("select from UserDto as UserDto");
			
			listAgent = (List<AgentDto>) queryAgent.getResultList();
			listUser = (List<com.virtualef.pgj.dto.UserDto>) queryUser.getResultList();
			
			for (AgentDto agent : listAgent) {
				for (com.virtualef.pgj.dto.UserDto user : listUser) {
					if (agent.getIdUser() == user.getId()) {
						agent.setUser(user);
					}
				}
			}
			
		} finally {
			mgr.close();
		}

		return CollectionResponse.<AgentDto> builder().setItems(listAgent).setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getAgentDto")
	public AgentDto getAgentDto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		AgentDto agentdto = null;
		com.virtualef.pgj.dto.UserDto userdto = null;
		try {
			agentdto = mgr.find(AgentDto.class, id);
			userdto = mgr.find(com.virtualef.pgj.dto.UserDto.class, agentdto.getIdUser());
			agentdto.setUser(userdto);
		} finally {
			mgr.close();
		}
		return agentdto;
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param agentdto the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertAgentDto")
	public AgentDto insertAgentDto(AgentDto agentdto) {
		EntityManager mgr = getEntityManager();
		try {
			agentdto.setId(com.virtualef.pgj.dao.ApiDaoSynchronize.getInstance().getNextId(AgentDto.class.getName(), mgr));
			if (containsAgentDto(agentdto)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(agentdto);
		} finally {
			mgr.close();
		}
		return agentdto;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param agentdto the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateAgentDto")
	public AgentDto updateAgentDto(AgentDto agentdto) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsAgentDto(agentdto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(agentdto);
		} finally {
			mgr.close();
		}
		return agentdto;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeAgentDto")
	public void removeAgentDto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			AgentDto agentdto = mgr.find(AgentDto.class, id);
			mgr.remove(agentdto);
		} finally {
			mgr.close();
		}
	}

	private boolean containsAgentDto(AgentDto agentdto) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			AgentDto item = mgr.find(AgentDto.class, agentdto.getId());
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
