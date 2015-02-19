package com.demomapas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Punto {
	 @Id
	  private Long Id;
	  private String latidude;
	  private String longitude;
	  private String fecha;
	  private Long idAgente;
	  
	  
	  
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getLatidude() {
		return latidude;
	}
	public void setLatidude(String latidude) {
		this.latidude = latidude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public Long getIdAgente() {
		return idAgente;
	}
	public void setIdAgente(Long idAgente) {
		this.idAgente = idAgente;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


}
