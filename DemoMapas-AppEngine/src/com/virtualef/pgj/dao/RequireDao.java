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
				throw new EntityNotFoundException("Object does not exist");
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
		com.virtualef.pgj.dto.RequireDto require, requirePersist;
		
		try {
			require = mgr.find(com.virtualef.pgj.dto.RequireDto.class, requireDto.getKey().getId());
			if (require == null) {
				throw new EntityNotFoundException("Object does not exist");
			}
			requirePersist = requireDto;
			requirePersist.setKey(require.getKey());
			requirePersist.getPerson().setKey(require.getPerson().getKey());
			mgr.persist(requirePersist);
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
