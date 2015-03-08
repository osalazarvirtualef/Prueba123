package com.virtualef.pgj.dao;

public interface RequireDaoInterface extends DaoInterface {
	
	public com.google.api.server.spi.response.CollectionResponse<com.virtualef.pgj.dto.RequireDto> listObject();
	public com.virtualef.pgj.dto.RequireDto getObject(Long id);
	public com.virtualef.pgj.dto.RequireDto insertObject(com.virtualef.pgj.dto.RequireDto requireDto);
	public com.virtualef.pgj.dto.RequireDto updateObject(com.virtualef.pgj.dto.RequireDto requireDto);
	public void removeObject(Long id);
}
