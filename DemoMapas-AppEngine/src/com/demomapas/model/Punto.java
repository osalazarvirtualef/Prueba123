package com.demomapas.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Punto {
	 @Id
	  private Long Id;
	  private Long latidude;
	  private Long longitude;
	  
	  
	  
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getLatidude() {
		return latidude;
	}
	public void setLatidude(Long latidude) {
		this.latidude = latidude;
	}
	public Long getLongitude() {
		return longitude;
	}
	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}
	  

}
