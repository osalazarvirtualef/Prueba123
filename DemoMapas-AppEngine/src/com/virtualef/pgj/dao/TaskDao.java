package com.virtualef.pgj.dao;

import com.demomapas.EMF;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.appengine.api.datastore.Cursor;
import com.virtualef.pgj.dto.TaskDto;

import java.util.List;

import javax.annotation.Nullable;
import javax.inject.Named;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@Api(name = "taskdtoendpoint", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.dao"))
public class TaskDao {

	/**
	 * This method lists all the entities inserted in datastore.
	 * It uses HTTP GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 * persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listTaskDto")
	public CollectionResponse<TaskDto> listTaskDto(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("limit") Integer limit) {

		EntityManager mgr = null;
		Cursor cursor = null;
		List<TaskDto> listTask = null;
		com.virtualef.pgj.dao.AgentDao agentDao = new com.virtualef.pgj.dao.AgentDao();
		com.virtualef.pgj.dao.RequireDao requireDao = new com.virtualef.pgj.dao.RequireDao();

		try {
			mgr = getEntityManager();
			Query queryTask = mgr.createQuery("select from TaskDto as TaskDto");
			
			listTask = (List<TaskDto>) queryTask.getResultList();
			
			for (TaskDto task : listTask) {
				task.setUserAgent(agentDao.getAgentDto(task.getIdAgent()));
				task.setUserRequire(requireDao.getRequireDto(task.getIdRequire()));
			}
			
		} finally {
			mgr.close();
		}

		return CollectionResponse.<TaskDto> builder().setItems(listTask)
				.setNextPageToken(cursorString).build();
	}

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET method.
	 *
	 * @param id the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getTaskDto")
	public TaskDto getTaskDto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		TaskDto taskdto = null;
		try {
			taskdto = mgr.find(TaskDto.class, id);
		} finally {
			mgr.close();
		}
		return taskdto;
	}
	
	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param taskdto the entity to getTaskDtoByAgentId.
	 * @return The inserted entity.
	 */
	@SuppressWarnings({ "unchecked" })
	@ApiMethod(name = "getTaskDtoByAgentId")
	public CollectionResponse<TaskDto> getTaskDtoByAgentId(@Named("id") Long id) {
		EntityManager mgr = null;
		List<TaskDto> listTaskdto = null;
		try {			
			mgr = getEntityManager();
			Query queryTask = mgr.createQuery("select from TaskDto as TaskDto where TaskDto.idAgent ==" + id);			
			listTaskdto = (List<TaskDto>) queryTask.getResultList();		
		} finally {
			mgr.close();
		}
		return CollectionResponse.<TaskDto> builder().setItems(listTaskdto).build();
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity already
	 * exists in the datastore, an exception is thrown.
	 * It uses HTTP POST method.
	 *
	 * @param taskdto the entity to be inserted.
	 * @return The inserted entity.
	 */
	@ApiMethod(name = "insertTaskDto")
	public TaskDto insertTaskDto(TaskDto taskdto) {
		EntityManager mgr = getEntityManager();
		try {
			taskdto.setId(com.virtualef.pgj.dao.ApiDaoSynchronize.getInstance().getNextId(TaskDto.class.getName(), mgr));
			if (containsTaskDto(taskdto)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(taskdto);
		} finally {
			mgr.close();
		}
		return taskdto;
	}

	/**
	 * This method is used for updating an existing entity. If the entity does not
	 * exist in the datastore, an exception is thrown.
	 * It uses HTTP PUT method.
	 *
	 * @param taskdto the entity to be updated.
	 * @return The updated entity.
	 */
	@ApiMethod(name = "updateTaskDto")
	public TaskDto updateTaskDto(TaskDto taskdto) {
		EntityManager mgr = getEntityManager();
		try {
			if (!containsTaskDto(taskdto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(taskdto);
		} finally {
			mgr.close();
		}
		return taskdto;
	}

	/**
	 * This method removes the entity with primary key id.
	 * It uses HTTP DELETE method.
	 *
	 * @param id the primary key of the entity to be deleted.
	 */
	@ApiMethod(name = "removeTaskDto")
	public void removeTaskDto(@Named("id") Long id) {
		EntityManager mgr = getEntityManager();
		try {
			TaskDto taskdto = mgr.find(TaskDto.class, id);
			mgr.remove(taskdto);
		} finally {
			mgr.close();
		}
	}

	private boolean containsTaskDto(TaskDto taskdto) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			TaskDto item = mgr.find(TaskDto.class, taskdto.getId());
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
