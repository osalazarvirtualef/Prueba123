package com.virtualef.pgj.dao;

public final class DaoFactory {

	public static DaoInterface getDao(Class<? extends DaoInterface> className) {
		Class<? extends DaoInterface> daoClass = className;
		DaoInterface dao = null;

		try {
			dao = (DaoInterface) daoClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return dao;
	}
}
