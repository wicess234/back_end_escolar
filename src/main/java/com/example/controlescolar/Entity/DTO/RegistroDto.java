package com.example.controlescolar.Entity.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;

public class RegistroDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private int spridenMatricula;
	private Date spridenActivityDate;
	@NotBlank(message="El campo apellido Paterno es obligatorio")
	private String spridenAp;
	private String spridenApm;
	@NotBlank(message="El Nombre es obligatorio")
	private String spridenNombre;
	@NotBlank(message="El campo CURP es obligatorio")
	private String spridenCurp;
	private String spridenFlag;
	private int sridenUser;
	private int usuarioId;
	@NotBlank(message="La carrera es obligatoria")
	private String carrera;
	private String turno;
	private String termino;
	private String prepaId;
	private int teleId;
	private int addressId;
	private int personales;
	
	public String getSpridenAp() {
		return spridenAp;
	}
	public void setSpridenAp(String spridenAp) {
		this.spridenAp = spridenAp;
	}
	public int getSpridenMatricula() {
		return spridenMatricula;
	}
	public void setSpridenMatricula(int spridenMatricula) {
		this.spridenMatricula = spridenMatricula;
	}
	public Date getSpridenActivityDate() {
		return spridenActivityDate;
	}
	public void setSpridenActivityDate(Date spridenActivityDate) {
		this.spridenActivityDate = spridenActivityDate;
	}
	public String getSpridenApm() {
		return spridenApm;
	}
	public void setSpridenApm(String spridenApm) {
		this.spridenApm = spridenApm;
	}
	public String getSpridenNombre() {
		return spridenNombre;
	}
	public void setSpridenNombre(String spridenNombre) {
		this.spridenNombre = spridenNombre;
	}
	public String getSpridenCurp() {
		return spridenCurp;
	}
	public void setSpridenCurp(String spridenCurp) {
		this.spridenCurp = spridenCurp;
	}
	public String getSpridenFlag() {
		return spridenFlag;
	}
	public void setSpridenFlag(String spridenFlag) {
		this.spridenFlag = spridenFlag;
	}
	public int getSridenUser() {
		return sridenUser;
	}
	public void setSridenUser(int sridenUser) {
		this.sridenUser = sridenUser;
	}
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getTermino() {
		return termino;
	}
	public void setTermino(String termino) {
		this.termino = termino;
	}
	public String getPrepaId() {
		return prepaId;
	}
	public void setPrepaId(String prepaId) {
		this.prepaId = prepaId;
	}
	public int getTeleId() {
		return teleId;
	}
	public void setTeleId(int teleId) {
		this.teleId = teleId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getPersonales() {
		return personales;
	}
	public void setPersonales(int personales) {
		this.personales = personales;
	}



}
