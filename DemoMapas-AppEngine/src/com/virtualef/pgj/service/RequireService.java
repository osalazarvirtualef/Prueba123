package com.virtualef.pgj.service;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.response.CollectionResponse;

@Api(name = "requireService", namespace = @ApiNamespace(ownerDomain = "virtualef.com", ownerName = "virtualef.com", packagePath = "pgj.service"))
public class RequireService implements com.virtualef.pgj.dao.RequireDaoInterface {

	private static com.virtualef.pgj.dao.RequireDao requireDao;
	
	static {
		requireDao = (com.virtualef.pgj.dao.RequireDao) com.virtualef.pgj.dao.DaoFactory.getDao(com.virtualef.pgj.dao.RequireDao.class);
	}
	
	@ApiMethod(name = "getRequires")
	public CollectionResponse<com.virtualef.pgj.dto.RequireDto> listObject() {
		return requireDao.listObject();
	}

	@ApiMethod(name = "getRequire")
	public com.virtualef.pgj.dto.RequireDto getObject(@Named("id") Long id) {
		return requireDao.getObject(id);
	}

	@ApiMethod(name = "insertRequire")
	public com.virtualef.pgj.dto.RequireDto insertObject(com.virtualef.pgj.dto.RequireDto requireDto) {
		return requireDao.insertObject(requireDto);
	}

	@ApiMethod(name = "updateRequire")
	public com.virtualef.pgj.dto.RequireDto updateObject(com.virtualef.pgj.dto.RequireDto requireDto) {
		return requireDao.updateObject(requireDto);
	}

	@ApiMethod(name = "removeRequire")
	public void removeObject(@Named("id") Long id) {
		requireDao.removeObject(id);
	}
}
