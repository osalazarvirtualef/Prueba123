package com.demomapas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ruta {

	@Id
	private Long id;
	private Long idAgente;
	private List<Tarea> ruta;
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
	public List<Tarea> getRuta() {
		return ruta;
	}
	public void setRuta(List<Tarea> ruta) {
		this.ruta = ruta;
	}
	
	
}
