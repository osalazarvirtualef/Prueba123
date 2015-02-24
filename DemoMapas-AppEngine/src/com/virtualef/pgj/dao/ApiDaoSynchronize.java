package com.virtualef.pgj.dao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.virtualef.pgj.dto.TaskDto;

final class ApiDaoSynchronize {
	private final static ApiDaoSynchronize INSTANCE = new ApiDaoSynchronize();

	private ApiDaoSynchronize() {
		System.out.println("Prueba");
	}

	public synchronized static ApiDaoSynchronize getInstance() {
		return INSTANCE;
	}

	public long getNextId(String table, EntityManager mgr) {		
		List<TaskDto> listObject = null;
		
		Query query = mgr.createQuery("SELECT FROM " + table + " AS " + table);
		Comparator<TaskDto> comparador = Collections.reverseOrder();
		Collections.sort(listObject, comparador);		
		return listObject.get(0).getId() + 1;
	}
}
