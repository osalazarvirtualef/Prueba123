package com.demomapas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ruta {

	@Id
	private Long id;
	private Long idAgente;
	private long[] tareasIds;
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
	public long[] getTareasId() {
		return tareasIds;
	}
	public void setTareasId(long[] tareasId) {
		this.tareasIds = tareasId;
	}
	
	
	
	
}
