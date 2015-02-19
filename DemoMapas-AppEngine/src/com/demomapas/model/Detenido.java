package com.demomapas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Detenido {
	
	@Id
	private Long id;
	private String cargo;
	private String delito;
	private Long idUsuario;
	private String evidencia;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getEvidencia() {
		return evidencia;
	}
	public void setEvidencia(String evidencia) {
		this.evidencia = evidencia;
	}
	
	
	
}
