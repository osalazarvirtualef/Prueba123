package com.virtualef.pgj.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Query;

import com.demomapas.EMF;
import com.google.api.server.spi.response.CollectionResponse;
import com.virtualef.pgj.dto.PersonDto;

public class PersonDao implements com.virtualef.pgj.dao.PersonDaoInterface {

	@Override
	@SuppressWarnings({ "unchecked" })
	public CollectionResponse<PersonDto> listObject() {
		EntityManager mgr = null;
		List<PersonDto> execute = null;

		try {
			mgr = getEntityManager();
			Query query = mgr.createQuery("select from PersonDto as PersonDto");

			execute = (List<PersonDto>) query.getResultList();
		} catch (Exception e) {
			
		} finally {
			mgr.close();
		}
		return CollectionResponse.<PersonDto> builder().setItems(execute)
				.build();
	}

	@Override
	public PersonDto getObject(Long id) {
		EntityManager mgr = getEntityManager();
		PersonDto persondto = null;

		try {
			persondto = mgr.find(PersonDto.class, id);
		} finally {
			mgr.close();
		}
		return persondto;
	}

	@Override
	public PersonDto insertObject(PersonDto personDto) {
		EntityManager mgr = getEntityManager();

		try {
			if (containsPersonByAttributes(personDto)) {
				throw new EntityExistsException("Object already exists");
			}
			mgr.persist(personDto);
		} finally {
			mgr.close();
		}
		return personDto;
	}

	@Override
	public PersonDto updateObject(PersonDto personDto) {
		EntityManager mgr = getEntityManager();
		
		try {
			if (!containsPersonDto(personDto)) {
				throw new EntityNotFoundException("Object does not exist");
			}
			mgr.persist(personDto);
		} finally {
			mgr.close();
		}
		return personDto;
	}

	@Override
	public void removeObject(Long id) {
		EntityManager mgr = getEntityManager();
		
		try {
			PersonDto persondto = mgr.find(PersonDto.class, id);
			mgr.remove(persondto);
		} finally {
			mgr.close();
		}
	}
	
	private boolean containsPersonDto(PersonDto persondto) {
		return false;
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
			System.out.println("Entra en catch");
			exist = false;
		} finally {

		}
		return exist;
	}
	
	private static EntityManager getEntityManager() {
		return EMF.get().createEntityManager();
	}
}
