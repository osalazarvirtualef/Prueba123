package com.demomapas.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Tarea {

	@Id
	private Long id;
	private Long idAgente;
	private Long idDetenido;
	private String fecha;
	private boolean estado;
	private Long idZona;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(Long idAgente) {
		this.idAgente = idAgente;
	}
	public Long getIdDetenido() {
		return idDetenido;
	}
	public void setIdDetenido(Long idDetenido) {
		this.idDetenido = idDetenido;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Long getIdZona() {
		return idZona;
	}
	public void setIdZona(Long idZona) {
		this.idZona = idZona;
	}
	
	
	
	
	
}
