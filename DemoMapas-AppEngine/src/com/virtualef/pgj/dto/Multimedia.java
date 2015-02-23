package com.virtualef.pgj.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Multimedia {
	@Id
	Long id;
	private String path;
	private Long idTarea;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Long getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(Long idTarea) {
		this.idTarea = idTarea;
	}
	
	

}
