package com.virtualef.pgj.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

final class ApiDaoSynchronize {	
	private final static ApiDaoSynchronize INSTANCE = new ApiDaoSynchronize();
	
	private ApiDaoSynchronize() {
		System.out.println("Prueba");
	}
	
	public synchronized static ApiDaoSynchronize getInstance() {
		return INSTANCE;
	}
	
	public long getNextId(String table, EntityManager mgr) {
		Query query = mgr.createQuery("SELECT COUNT(id) FROM " + table + " id");
		return (long) query.getSingleResult() + 1;
	}
}
