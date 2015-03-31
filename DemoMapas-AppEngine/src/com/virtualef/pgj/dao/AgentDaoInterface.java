package com.virtualef.pgj.dao;

public interface AgentDaoInterface extends DaoInterface {
	
	public com.google.api.server.spi.response.CollectionResponse<com.virtualef.pgj.dto.AgentDto> getAgents();
	public com.virtualef.pgj.dto.AgentDto getAgent(Long id);
	public com.virtualef.pgj.dto.AgentDto getAgentByAlias(String alias, String aliasP);
	public com.virtualef.pgj.dto.AgentDto insertAgent(com.virtualef.pgj.dto.AgentDto agentDto);
	public com.virtualef.pgj.dto.AgentDto updateAgent(com.virtualef.pgj.dto.AgentDto agentDto);
	public void removeAgent(Long id);
}
