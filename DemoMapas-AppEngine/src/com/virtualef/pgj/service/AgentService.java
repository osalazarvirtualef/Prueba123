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

	@ApiMethod(name = "getAgents", path="agentdto")
	public CollectionResponse<com.virtualef.pgj.dto.AgentDto> getAgents() {
		return agentDao.getAgents();
	}

	@ApiMethod(name = "getAgent", path="agentdto/{id}")
	public com.virtualef.pgj.dto.AgentDto getAgent(@Named("id") Long id) {
		return agentDao.getAgent(id);
	}
	
	@ApiMethod(name = "getAgentByAlias", path="agentdto/{alias}/{aliasP}")
	public com.virtualef.pgj.dto.AgentDto getAgentByAlias(@Named("alias") String alias, @Named("aliasP") String aliasP) {
		return agentDao.getAgentByAlias(alias, aliasP);
	}

	@ApiMethod(name = "insertAgent", path="agentdto")
	public com.virtualef.pgj.dto.AgentDto insertAgent(com.virtualef.pgj.dto.AgentDto objectDto) {
		return agentDao.insertAgent(objectDto);
	}

	@ApiMethod(name = "updatedAgent", path="agentdto")
	public com.virtualef.pgj.dto.AgentDto updateAgent(com.virtualef.pgj.dto.AgentDto objectDto) {
		return agentDao.updateAgent(objectDto);
	}

	@ApiMethod(name = "removeAgent", path="agentdto/{id}")
	public void removeAgent(@Named("id") Long id) {
		agentDao.removeAgent(id);
	}
}