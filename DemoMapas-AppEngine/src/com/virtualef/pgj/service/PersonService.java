package com.virtualef.pgj.service;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.response.CollectionResponse;
import com.virtualef.pgj.dto.PersonDto;

@Api(name = "personService", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.service"))
public class PersonService implements com.virtualef.pgj.dao.PersonDaoInterface {
	
	private static com.virtualef.pgj.dao.PersonDao personDao;
	
	static {
		personDao = (com.virtualef.pgj.dao.PersonDao) com.virtualef.pgj.dao.DaoFactory.getDao(com.virtualef.pgj.dao.PersonDao.class);
	}

	@ApiMethod(name = "getPersons")
	public CollectionResponse<PersonDto> listObject() {
		return personDao.listObject();
	}

	@ApiMethod(name = "getPerson")
	public PersonDto getObject(@Named("id") Long id) {
		return personDao.getObject(id);
	}

	@ApiMethod(name = "insertPerson")
	public PersonDto insertObject(PersonDto personDto) {
		return personDao.insertObject(personDto);
	}

	@ApiMethod(name = "updatePerson")
	public PersonDto updateObject(PersonDto personDto) {
		return personDao.insertObject(personDto);
	}

	@ApiMethod(name = "removePerson")
	public void removeObject(@Named("id") Long id) {
		personDao.removeObject(id);
	}
}
