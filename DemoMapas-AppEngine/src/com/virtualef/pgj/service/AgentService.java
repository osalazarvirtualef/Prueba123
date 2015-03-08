package com.virtualef.pgj.service;

import javax.inject.Named;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.CollectionResponse;

@Api(name = "agentService", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.service"))
public class AgentService implements com.virtualef.pgj.dao.AgentDaoInterface {

	private static com.virtualef.pgj.dao.AgentDao agentDao;
	
	static {
		agentDao = (com.virtualef.pgj.dao.AgentDao) com.virtualef.pgj.dao.DaoFactory.getDao(com.virtualef.pgj.dao.AgentDao.class);
	}

	@ApiMethod(name = "getAgents")
	public CollectionResponse<com.virtualef.pgj.dto.AgentDto> listObject() {
		return agentDao.listObject();
	}

	@ApiMethod(name = "getAgent")
	public com.virtualef.pgj.dto.AgentDto getObject(@Named("id") Long id) {
		return agentDao.getObject(id);
	}

	@ApiMethod(name = "insertAgent")
	public com.virtualef.pgj.dto.AgentDto insertObject(com.virtualef.pgj.dto.AgentDto objectDto) {
		return agentDao.insertObject(objectDto);
	}

	@ApiMethod(name = "updatedAgent")
	public com.virtualef.pgj.dto.AgentDto updateObject(com.virtualef.pgj.dto.AgentDto objectDto) {
		return agentDao.updateObject(objectDto);
	}

	@ApiMethod(name = "removeAgent")
	public void removeObject(@Named("id") Long id) {
		agentDao.removeObject(id);
	}
}