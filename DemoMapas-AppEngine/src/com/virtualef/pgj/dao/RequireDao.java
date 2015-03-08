package com.virtualef.pgj.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

import com.demomapas.EMF;
import com.google.api.server.spi.response.CollectionResponse;

public class RequireDao implements com.virtualef.pgj.dao.RequireDaoInterface {

	@Override	
	@SuppressWarnings({ "unchecked" })
	public CollectionResponse<com.virtualef.pgj.dto.RequireDto> listObject() {
		EntityManager mgr = null;
		List<com.virtualef.pgj.dto.RequireDto> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from RequireDto as RequireDto");
			execute = (List<com.virtualef.pgj.dto.RequireDto>) query.getResultList();
		} catch (Exception e) {

		} finally {
			mgr.close();
		}
		return CollectionResponse.<com.virtualef.pgj.dto.RequireDto> builder().setItems(execute).build();
	}

	@Override
	public com.virtualef.pgj.dto.RequireDto getObject(Long id) {
		EntityManager mgr = getEntityManager();
		com.virtualef.pgj.dto.RequireDto requireDto = null;

		try {
			requireDto = mgr.find(com.virtualef.pgj.dto.RequireDto.class, id);
		} finally {
			mgr.close();
		}
		return requireDto;
	}

	@Override
	public com.virtualef.pgj.dto.RequireDto insertObject(com.virtualef.pgj.dto.RequireDto requireDto) {
		EntityManager mgr = getEntityManager();
		
		try {
			if (containsPersonByAttributes(requireDto.getPerson())) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(requireDto);
		} finally {
			mgr.close();
		}
		return requireDto;
	}

	@Override
	public com.virtualef.pgj.dto.RequireDto updateObject(com.virtualef.pgj.dto.RequireDto requireDto) {
		EntityManager mgr = getEntityManager();
		
		try {
			if (!containsRequireDto(requireDto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(requireDto);
		} finally {
			mgr.close();
		}
		return requireDto;
	}

	@Override
	public void removeObject(Long id) {
		EntityManager mgr = getEntityManager();
		
		try {
			com.virtualef.pgj.dto.RequireDto requireDto = mgr.find(com.virtualef.pgj.dto.RequireDto.class, id);
			mgr.remove(requireDto);
		} finally {
			mgr.close();
		}
	}

	private boolean containsRequireDto(com.virtualef.pgj.dto.RequireDto requiredto) {
		EntityManager mgr = getEntityManager();
		boolean contains = true;
		try {
			com.virtualef.pgj.dto.RequireDto item = mgr.find(com.virtualef.pgj.dto.RequireDto.class, requiredto.getKey());
			if (item == null) {
				contains = false;
			}
		} finally {
			mgr.close();
		}
		return contains;
	}

	private boolean containsPersonByAttributes(
			com.virtualef.pgj.dto.PersonDto person) {
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
