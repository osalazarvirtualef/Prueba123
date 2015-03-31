package com.virtualef.pgj.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

import com.demomapas.EMF;
import com.google.api.server.spi.response.CollectionResponse;
import com.virtualef.pgj.dto.AgentDto;

public class AgentDao implements AgentDaoInterface {

	@Override
	@SuppressWarnings({ "unchecked" })
	public CollectionResponse<com.virtualef.pgj.dto.AgentDto> getAgents() {
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
	public AgentDto getAgentByAlias(String alias, String aliasP) {
		EntityManager mgr = null;
		com.virtualef.pgj.dto.AgentDto agent = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from AgentDto as AgentDto where AgentDto.alias = '" + alias + "' and AgentDto.aliasP = '" + aliasP + "'");
			
			agent = (com.virtualef.pgj.dto.AgentDto) query.getSingleResult();
		} catch (Exception e) {
			
		} finally {
			mgr.close();
		}
		return agent;
	}

	@Override
	public com.virtualef.pgj.dto.AgentDto getAgent(Long id) {
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
	public com.virtualef.pgj.dto.AgentDto insertAgent(com.virtualef.pgj.dto.AgentDto agentDto) {
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
	public com.virtualef.pgj.dto.AgentDto updateAgent(com.virtualef.pgj.dto.AgentDto agentDto) {
		EntityManager mgr = getEntityManager();
		com.virtualef.pgj.dto.AgentDto agent, agentPersist;
		
		try {
			agent = mgr.find(com.virtualef.pgj.dto.AgentDto.class, agentDto.getKey().getId());
			if (agent == null) {
				throw new EntityNotFoundException("Object does not exist");
			}
			agentPersist = agentDto;
			agentPersist.setKey(agent.getKey());
			agentPersist.getPerson().setKey(agent.getPerson().getKey());
			mgr.persist(agentPersist);
		} finally {
			mgr.close();
		}
		return agentDto;
	}

	@Override
	public void removeAgent(Long id) {
		EntityManager mgr = getEntityManager();
		
		try {
			com.virtualef.pgj.dto.AgentDto agentdto = mgr.find(com.virtualef.pgj.dto.AgentDto.class, id);
			mgr.remove(agentdto);
		} finally {
			mgr.close();
		}
	}
	
	private boolean containsAgentByAttributes(com.virtualef.pgj.dto.AgentDto agentDto) {
		EntityManager mgr = getEntityManager();
		boolean exist = true;

		try {
			Query query = mgr
					.createQuery("SELECT FROM AgentDto as AgentDto WHERE AgentDto.tuition = :"
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
					.createQuery("SELECT p from PersonDto p WHERE p.name = '"
							+ person.getName()
							+ "' AND p.firstName = '"
							+ person.getFirstName()
							+ "' AND p.lastName = '"
							+ person.getLastName()
							+ "' AND p.sex = '"
							+ person.getSex()
							+ "' AND age = "
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
