package com.virtualef.pgj.dao;

public interface CommandmentDaoInterface extends DaoInterface {
	
	public com.google.api.server.spi.response.CollectionResponse<com.virtualef.pgj.dto.CommandmentDto> listObject();
	public com.virtualef.pgj.dto.CommandmentDto getObject(Long id);
	public com.virtualef.pgj.dto.CommandmentDto insertObject(com.virtualef.pgj.dto.CommandmentDto commandmentDto);
	public com.virtualef.pgj.dto.CommandmentDto updateObject(com.virtualef.pgj.dto.CommandmentDto commandmentDto);
	public void removeObject(Long id);
}
