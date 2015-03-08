package com.virtualef.pgj.dao;

public interface AgentDaoInterface extends DaoInterface {
	
	public com.google.api.server.spi.response.CollectionResponse<com.virtualef.pgj.dto.AgentDto> listObject();
	public com.virtualef.pgj.dto.AgentDto getObject(Long id);
	public com.virtualef.pgj.dto.AgentDto insertObject(com.virtualef.pgj.dto.AgentDto agentDto);
	public com.virtualef.pgj.dto.AgentDto updateObject(com.virtualef.pgj.dto.AgentDto agentDto);
	public void removeObject(Long id);
}
