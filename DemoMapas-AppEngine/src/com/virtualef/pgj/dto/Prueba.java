package com.virtualef.pgj.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

@Entity
public class Prueba {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Key key;
	private String pruebas;
	
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getPruebas() {
		return pruebas;
	}
	public void setPruebas(String pruebas) {
		this.pruebas = pruebas;
	}
	@Override
	public String toString() {
		return "Prueba [key=" + key + ", pruebas=" + pruebas + "]";
	}
}
