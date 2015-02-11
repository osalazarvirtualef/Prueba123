package com.demomapas.model;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agente extends Usuario {


	private String matricula;
	private String usuario;
	private String password;
	

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	}
