/**
 * 
 */
package com.demomapas.pjgviewpager;

import com.turbomanage.storm.api.Entity;
import com.turbomanage.storm.api.Id;

/**
 * @author Usuario
 *
 */
@Entity
public class Referencia {
	
	@Id
	private long idReferencia;
	private String contenedor;
	private String nombre;
	private int noReferencia;
	private String fecha_arribo;
	private String ejecutivo;
	private String clasificador;
	private String plaza;
	private String sello_arribo;
	private String sello_asignado;
	private String noOperacion;
	private String titulo;
	private String cliente;
	private String rfc;
	private String fecha_fin_previo;
	private int idRazonCierre;
	private String comentariosCierre;
	private int idEstatus;
	private long facturas_IdFactura;
	
	
	public long getIdReferencia() {
		return idReferencia;
	}
	public void setIdReferencia(long idReferencia) {
		this.idReferencia = idReferencia;
	}
	public String getContenedor() {
		return contenedor;
	}
	public void setContenedor(String contenedor) {
		this.contenedor = contenedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNoReferencia() {
		return noReferencia;
	}
	public void setNoReferencia(int noReferencia) {
		this.noReferencia = noReferencia;
	}
	public String getFecha_arribo() {
		return fecha_arribo;
	}
	public void setFecha_arribo(String fecha_arribo) {
		this.fecha_arribo = fecha_arribo;
	}
	public String getEjecutivo() {
		return ejecutivo;
	}
	public void setEjecutivo(String ejecutivo) {
		this.ejecutivo = ejecutivo;
	}
	public String getClasificador() {
		return clasificador;
	}
	public void setClasificador(String clasificador) {
		this.clasificador = clasificador;
	}
	public String getPlaza() {
		return plaza;
	}
	public void setPlaza(String plaza) {
		this.plaza = plaza;
	}
	public String getSello_arribo() {
		return sello_arribo;
	}
	public void setSello_arribo(String sello_arribo) {
		this.sello_arribo = sello_arribo;
	}
	public String getSello_asignado() {
		return sello_asignado;
	}
	public void setSello_asignado(String sello_asignado) {
		this.sello_asignado = sello_asignado;
	}
	public String getNoOperacion() {
		return noOperacion;
	}
	public void setNoOperacion(String noOperacion) {
		this.noOperacion = noOperacion;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getFecha_fin_previo() {
		return fecha_fin_previo;
	}
	public void setFecha_fin_previo(String fecha_fin_previo) {
		this.fecha_fin_previo = fecha_fin_previo;
	}
	public int getIdRazonCierre() {
		return idRazonCierre;
	}
	public void setIdRazonCierre(int idRazonCierre) {
		this.idRazonCierre = idRazonCierre;
	}
	public String getComentariosCierre() {
		return comentariosCierre;
	}
	public void setComentariosCierre(String comentariosCierre) {
		this.comentariosCierre = comentariosCierre;
	}
	public int getIdEstatus() {
		return idEstatus;
	}
	public void setIdEstatus(int idEstatus) {
		this.idEstatus = idEstatus;
	}
	public long getFacturas_IdFactura() {
		return facturas_IdFactura;
	}
	public void setFacturas_IdFactura(long facturas_IdFactura) {
		this.facturas_IdFactura = facturas_IdFactura;
	}

}
