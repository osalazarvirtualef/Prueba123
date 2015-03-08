package com.virtualef.pgj.service;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.response.CollectionResponse;
import com.virtualef.pgj.dto.CommandmentDto;

@Api(name = "commandmentService", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.service"))
public class CommandmentService implements com.virtualef.pgj.dao.CommandmentDaoInterface {

	private static com.virtualef.pgj.dao.CommandmentDao commandmentDao;
	
	static {
		commandmentDao = (com.virtualef.pgj.dao.CommandmentDao) com.virtualef.pgj.dao.DaoFactory.getDao(com.virtualef.pgj.dao.CommandmentDao.class);
	}
	
	@ApiMethod(name = "getCommandments")
	public CollectionResponse<CommandmentDto> listObject() {
		return commandmentDao.listObject();
	}

	@ApiMethod(name = "getCommandment")
	public CommandmentDto getObject(@Named("id") Long id) {
		return commandmentDao.getObject(id);
	}

	@ApiMethod(name = "insertCommandment")
	public CommandmentDto insertObject(CommandmentDto commandmentDto) {
		return commandmentDao.insertObject(commandmentDto);
	}

	@ApiMethod(name = "updateCommandments")
	public CommandmentDto updateObject(CommandmentDto commandmentDto) {
		return commandmentDao.updateObject(commandmentDto);
	}

	@ApiMethod(name = "removeCommandments")
	public void removeObject(@Named("id") Long id) {		
		commandmentDao.removeObject(id);
	}
}
