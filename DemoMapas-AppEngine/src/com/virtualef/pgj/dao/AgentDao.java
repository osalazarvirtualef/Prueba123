package com.virtualef.pgj.dao;

import com.demomapas.EMF;
import com.google.api.server.spi.response.CollectionResponse;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

public class AgentDao implements AgentDaoInterface {

	@Override
	@SuppressWarnings({ "unchecked" })
	public CollectionResponse<com.virtualef.pgj.dto.AgentDto> listObject() {
		EntityManager mgr = null;
		List<com.virtualef.pgj.dto.AgentDto> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from AgentDto as AgentDto");

			execute = (List<com.virtualef.pgj.dto.AgentDto>) query.getResultList();
		} catch (Exception e) {
			
		} finally {
			mgr.close();
		}
		return CollectionResponse.<com.virtualef.pgj.dto.AgentDto> builder().setItems(execute).build();
	}

	@Override
	public com.virtualef.pgj.dto.AgentDto getObject(Long id) {
		EntityManager mgr = getEntityManager();
		com.virtualef.pgj.dto.AgentDto agentdto = null;
		
		try {
			agentdto = mgr.find(com.virtualef.pgj.dto.AgentDto.class, id);
		} finally {
			mgr.close();
		}
		return agentdto;
	}

	@Override
	public com.virtualef.pgj.dto.AgentDto insertObject(com.virtualef.pgj.dto.AgentDto agentDto) {
		EntityManager mgr = getEntityManager();
		
		try {
			if (containsAgentByAttributes(agentDto) && containsPersonByAttributes(agentDto.getPerson())) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(agentDto);
		} finally {
			mgr.close();
		}
		return agentDto;
	}

	@Override
	public com.virtualef.pgj.dto.AgentDto updateObject(com.virtualef.pgj.dto.AgentDto agentDto) {
		EntityManager mgr = getEntityManager();
		
		try {
			if (!containsAgentDto(agentDto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(agentDto);
		} finally {
			mgr.close();
		}
		return agentDto;
	}

	@Override
	public void removeObject(Long id) {
		EntityManager mgr = getEntityManager();
		
		try {
			com.virtualef.pgj.dto.AgentDto agentdto = mgr.find(com.virtualef.pgj.dto.AgentDto.class, id);
			mgr.remove(agentdto);
		} finally {
			mgr.close();
		}
	}
	
	private boolean containsAgentDto(com.virtualef.pgj.dto.AgentDto agentDto) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		
		try {
			com.virtualef.pgj.dto.AgentDto item = mgr.find(com.virtualef.pgj.dto.AgentDto.class, agentDto.getKey());
			if (item == null) {
				contains = false;
			}
		} finally {
			mgr.close();
		}
		return contains;
	}
	
	private boolean containsAgentByAttributes(com.virtualef.pgj.dto.AgentDto agentDto) {
		EntityManager mgr = getEntityManager();
		boolean exist = true;

		try {
			Query query = mgr
					.createQuery("select from AgentDto as AgentDto where AgentDto.tuition = :"
							+ agentDto.getTuition() + " and AgentDto.alias = :" + agentDto.getAlias());
			query.getSingleResult();
		} catch (Exception e) {
			exist = false;
		} finally {

		}
		return exist;
	}

	private boolean containsPersonByAttributes(com.virtualef.pgj.dto.PersonDto person) {
		EntityManager mgr = getEntityManager();
		boolean exist = true;		

		try {
			Query query = mgr
					.createQuery("select from PersonDto as PersonDto where PersonDto.name = :"
							+ person.getName()
							+ " and PersonDto.firstName = :"
							+ person.getFirstName()
							+ " and PersonDto.lastName = :"
							+ person.getLastName()
							+ " and PersonDto.sex = :"
							+ person.getSex()
							+ " and PersonDto.age = :"
							+ person.getAge());
			query.getSingleResult();
		} catch (Exception e) {
			exist = false;
		} finally {

		}
		return exist;
	}
	
	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}
}
