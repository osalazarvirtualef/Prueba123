package com.virtualef.pgj.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class CommandmentDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private Long record;
	private Long order;
	private String department;
	private String date;
	private String observations;
	private String inquest;
	@Transient
	private AgentDto agent;
	@Transient
	private RequireDto require;
	private Long idAgent;
	private Long idRequire;
	private Long area;
	private Long crime;
	private Long court;
	private Long commandmentType;
	private boolean status;
	private String street;
	private String colony;
	private String number;
	private String town;
	private String state;
	private String country;
	private float latitude;
	private float longitude;
	private String[] evidence;
	private String[] audio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRecord() {
		return record;
	}

	public void setRecord(Long record) {
		this.record = record;
	}

	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public String getInquest() {
		return inquest;
	}

	public void setInquest(String inquest) {
		this.inquest = inquest;
	}

	public AgentDto getAgent() {
		return agent;
	}

	public void setAgent(AgentDto agent) {
		this.agent = agent;
	}

	public RequireDto getRequire() {
		return require;
	}

	public void setRequire(RequireDto require) {
		this.require = require;
	}

	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}

	public Long getCrime() {
		return crime;
	}

	public void setCrime(Long crime) {
		this.crime = crime;
	}

	public Long getCourt() {
		return court;
	}

	public void setCourt(Long court) {
		this.court = court;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Long getCommandmentType() {
		return commandmentType;
	}

	public void setCommandmentType(Long commandmentType) {
		this.commandmentType = commandmentType;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String[] getEvidence() {
		return evidence;
	}

	public void setEvidence(String[] evidence) {
		this.evidence = evidence;
	}

	public String[] getAudio() {
		return audio;
	}

	public void setAudio(String[] audio) {
		this.audio = audio;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Long getIdAgent() {
		return idAgent;
	}

	public void setIdAgent(Long idAgent) {
		this.idAgent = idAgent;
	}

	public Long getIdRequire() {
		return idRequire;
	}

	public void setIdRequire(Long idRequire) {
		this.idRequire = idRequire;
	}
}
