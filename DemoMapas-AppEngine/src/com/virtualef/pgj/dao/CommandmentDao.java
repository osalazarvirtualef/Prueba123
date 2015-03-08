package com.virtualef.pgj.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

import com.demomapas.EMF;
import com.google.api.server.spi.response.CollectionResponse;
import com.virtualef.pgj.dto.CommandmentDto;

public class CommandmentDao implements CommandmentDaoInterface {

	@Override
	@SuppressWarnings({ "unchecked" })
	public CollectionResponse<CommandmentDto> listObject() {
		EntityManager mgr = null;
		List<com.virtualef.pgj.dto.CommandmentDto> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from CommandmentDto as CommandmentDto");

			execute = (List<com.virtualef.pgj.dto.CommandmentDto>) query.getResultList();
		} catch (Exception e) {

		} finally {
			mgr.close();
		}
		return CollectionResponse
				.<com.virtualef.pgj.dto.CommandmentDto> builder()
				.setItems(execute).build();
	}

	@Override
	public CommandmentDto getObject(Long id) {
		EntityManager mgr = getEntityManager();
		com.virtualef.pgj.dto.CommandmentDto commandmentDto = null;

		try {
			commandmentDto = mgr.find(
					com.virtualef.pgj.dto.CommandmentDto.class, id);
		} finally {
			mgr.close();
		}
		return commandmentDto;
	}

	@Override
	public CommandmentDto insertObject(CommandmentDto commandmentDto) {
		EntityManager mgr = getEntityManager();

		try {
			if (containsCommandmentByAttributes(commandmentDto)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(commandmentDto);
		} finally {
			mgr.close();
		}
		return commandmentDto;
	}

	@Override
	public CommandmentDto updateObject(CommandmentDto commandmentDto) {
		EntityManager mgr = getEntityManager();

		try {
			if (!containsCommandmentDto(commandmentDto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(commandmentDto);
		} finally {
			mgr.close();
		}
		return commandmentDto;
	}

	@Override
	public void removeObject(Long id) {
		EntityManager mgr = getEntityManager();

		try {
			com.virtualef.pgj.dto.CommandmentDto commandmentDto = mgr.find(com.virtualef.pgj.dto.CommandmentDto.class, id);
			mgr.remove(commandmentDto);
		} finally {
			mgr.close();
		}
	}

	private boolean containsCommandmentDto(
			com.virtualef.pgj.dto.CommandmentDto commandmentDto) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;

		try {
			com.virtualef.pgj.dto.CommandmentDto item = mgr.find(
					com.virtualef.pgj.dto.CommandmentDto.class,
					commandmentDto.getId());
			if (item == null) {
				contains = false;
			}
		} finally {
			mgr.close();
		}
		return contains;
	}

	private boolean containsCommandmentByAttributes(com.virtualef.pgj.dto.CommandmentDto commandmentDto) {
		EntityManager mgr = getEntityManager();
		boolean exist = false;

		// try {
		// Query query = mgr
		// .createQuery("select from AgentDto as AgentDto where AgentDto.tuition = :"
		// + agentDto.getTuition()
		// + " and AgentDto.alias = :"
		// + agentDto.getAlias());
		// query.getSingleResult();
		// } catch (Exception e) {
		// exist = false;
		// } finally {
		//
		// }
		return exist;
	}

	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}
}
