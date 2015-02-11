package com.demomapas.model;

import javax.persistence.Entity;

@Entity
public class Detenido extends Usuario {

	private String cargo;
	private String delito;
	
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDelito() {
		return delito;
	}
	public void setDelito(String delito) {
		this.delito = delito;
	}
	
	
}
