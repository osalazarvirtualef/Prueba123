package com.demomapas.model;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Tarea extends Zona {

	
	private Agente agente;
	private Detenido detenido;
	private Date fecha;
	private boolean estado;
	
	public Agente getAgente() {
		return agente;
	}
	public void setAgente(Agente agente) {
		this.agente = agente;
	}
	public Detenido getDetenido() {
		return detenido;
	}
	public void setDetenido(Detenido detenido) {
		this.detenido = detenido;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	
	
	
}
