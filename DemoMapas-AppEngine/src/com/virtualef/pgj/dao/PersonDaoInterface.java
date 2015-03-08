package com.virtualef.pgj.dao;

public interface PersonDaoInterface extends DaoInterface {
	
	public com.google.api.server.spi.response.CollectionResponse<com.virtualef.pgj.dto.PersonDto> listObject();
	public com.virtualef.pgj.dto.PersonDto getObject(Long id);
	public com.virtualef.pgj.dto.PersonDto insertObject(com.virtualef.pgj.dto.PersonDto personDto);
	public com.virtualef.pgj.dto.PersonDto updateObject(com.virtualef.pgj.dto.PersonDto personDto);
	public void removeObject(Long id);
}
