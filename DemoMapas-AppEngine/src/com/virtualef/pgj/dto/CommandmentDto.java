package com.virtualef.pgj.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CommandmentDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private Long id;
	private Long record;
	private Long order;
	private String departure;
	private java.util.Date date;
	private String observations;
	private String inquest;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private AgentDto agent;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private RequireDto require;
	private Long area;
	private Long crime;
	private Long court;
	private Long commandmentType;
	private String street;
	private String colony;
	private String number;
	private String town;
	private String city;
	private String state;
	private String country;
	private Long latitude;
	private Long longitude;

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

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public java.util.Date getDate() {
		return date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}
}
