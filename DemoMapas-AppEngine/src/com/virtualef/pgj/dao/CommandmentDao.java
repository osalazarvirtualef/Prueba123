package com.virtualef.pgj.dao;

import java.util.List;

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
		List<com.virtualef.pgj.dto.CommandmentDto> commandmentsDto = null;
		List<com.virtualef.pgj.dto.AgentDto> agentsDto = null;
		List<com.virtualef.pgj.dto.RequireDto> requiresDto = null;

		try {
			mgr = getEntityManager();
			Query query1 = mgr.createQuery("select from CommandmentDto as CommandmentDto");
			Query query2 = mgr.createQuery("select from AgentDto as AgentDto");
			Query query3 = mgr.createQuery("select from RequireDto as RequireDto");

			commandmentsDto = (List<com.virtualef.pgj.dto.CommandmentDto>) query1.getResultList();
			agentsDto = (List<com.virtualef.pgj.dto.AgentDto>) query2.getResultList();
			requiresDto = (List<com.virtualef.pgj.dto.RequireDto>) query3.getResultList();
			
			for (com.virtualef.pgj.dto.CommandmentDto commandment : commandmentsDto) {
				for (com.virtualef.pgj.dto.AgentDto agent : agentsDto) {
					if (commandment.getIdAgent() == agent.getKey().getId()) {
						commandment.setAgent(agent);
					}
				}
				for (com.virtualef.pgj.dto.RequireDto require : requiresDto) {
					if (commandment.getIdRequire() == require.getKey().getId()) {
						commandment.setRequire(require);
					}
				}
			}
		} catch (Exception e) {

		} finally {
			mgr.close();
		}
		return CollectionResponse
				.<com.virtualef.pgj.dto.CommandmentDto> builder()
				.setItems(commandmentsDto).build();
	}

	@Override
	public CollectionResponse<CommandmentDto> getObjectByAgentId(Long id) {
		EntityManager mgr = null;
		List<com.virtualef.pgj.dto.CommandmentDto> commandmentsDto = null;
		List<com.virtualef.pgj.dto.AgentDto> agentsDto = null;
		List<com.virtualef.pgj.dto.RequireDto> requiresDto = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from CommandmentDto as CommandmentDto where CommandmentDto.idAgent = " + id);
			Query query2 = mgr.createQuery("select from AgentDto as AgentDto");
			Query query3 = mgr.createQuery("select from RequireDto as RequireDto");
			
			commandmentsDto = (List<com.virtualef.pgj.dto.CommandmentDto>) query.getResultList();
			agentsDto = (List<com.virtualef.pgj.dto.AgentDto>) query2.getResultList();
			requiresDto = (List<com.virtualef.pgj.dto.RequireDto>) query3.getResultList();
			for (com.virtualef.pgj.dto.CommandmentDto commandment : commandmentsDto) {
				for (com.virtualef.pgj.dto.AgentDto agent : agentsDto) {
					if (commandment.getIdAgent() == agent.getKey().getId()) {
						commandment.setAgent(agent);
					}
				}
				for (com.virtualef.pgj.dto.RequireDto require : requiresDto) {
					if (commandment.getIdRequire() == require.getKey().getId()) {
						commandment.setRequire(require);
					}
				}
			}
		} catch (Exception e) {

		} finally {
			mgr.close();
		}
		return CollectionResponse
				.<com.virtualef.pgj.dto.CommandmentDto> builder()
				.setItems(commandmentsDto).build();
	}	

	@Override
	public CommandmentDto insertObject(CommandmentDto commandmentDto) {
		EntityManager mgr = getEntityManager();
		
		try {
			mgr.persist(commandmentDto);
		} finally {
			mgr.close();
		}
		return commandmentDto;
	}

	@Override
	public CommandmentDto updateObject(CommandmentDto commandmentDto) {
		EntityManager mgr = getEntityManager();
		com.virtualef.pgj.dto.CommandmentDto commandment, commandmentPersist;
		
		try {
			commandment = mgr.find(com.virtualef.pgj.dto.CommandmentDto.class, commandmentDto.getId());
			if (commandment == null) {
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

	private boolean containsPersonByAttributes(com.virtualef.pgj.dto.PersonDto person) {
		EntityManager mgr = getEntityManager();
		boolean exist = false;
		
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
			exist = true;
		} finally {
		}
		return exist;
	}

	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}
}
