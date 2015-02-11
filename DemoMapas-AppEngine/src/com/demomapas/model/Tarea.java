package com.demomapas.model;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Tarea extends Zona {

	private Agente agente;
	private Detenido detenido;
	private Date fecha;
	private Boolean estado;
	
	
	
}
