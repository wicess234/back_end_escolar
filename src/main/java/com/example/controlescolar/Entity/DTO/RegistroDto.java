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
	
	private int spbpersNumseq;
	@NotBlank(message="El campo fallecido es obligatorio")
	private String spbpersFallecido;
	private Date spbpersFechNac;
	@NotBlank(message="El campo Sexo es ogligatorio ")
	private String spbpersSex;
	private String spbpersUser;
	@NotBlank(message="El campo Estado Civil es ogligatorio ")
	private String spbpesrCivil;

	//DATOS DE LOS TELEFONOS QUE REGISTRE EL USUARIO
	private int sprteleNumseq;
	private int sprteleFlag;
	private int sprteleNumber;
	private String stvteleCode;	
	
	//Los siguientes campos son para registrar la direccion
	private int spraddrNumseq;
	private String praddrCalle;
	private String praddrCp;
	private String praddrMunODel;
	private String praddrNum;
	private String praddrPais;
	private String spraddrCiudad;
	private String spraddrColonia;
	private String spraddrEstado;
	private String stvatypTipo;
	
	
	
	public int getSpraddrNumseq() {
		return spraddrNumseq;
	}
	public void setSpraddrNumseq(int spraddrNumseq) {
		this.spraddrNumseq = spraddrNumseq;
	}
	public String getPraddrCalle() {
		return praddrCalle;
	}
	public void setPraddrCalle(String praddrCalle) {
		this.praddrCalle = praddrCalle;
	}
	public String getPraddrCp() {
		return praddrCp;
	}
	public void setPraddrCp(String praddrCp) {
		this.praddrCp = praddrCp;
	}
	public String getPraddrMunODel() {
		return praddrMunODel;
	}
	public void setPraddrMunODel(String praddrMunODel) {
		this.praddrMunODel = praddrMunODel;
	}
	public String getPraddrNum() {
		return praddrNum;
	}
	public void setPraddrNum(String praddrNum) {
		this.praddrNum = praddrNum;
	}
	public String getPraddrPais() {
		return praddrPais;
	}
	public void setPraddrPais(String praddrPais) {
		this.praddrPais = praddrPais;
	}
	public String getSpraddrCiudad() {
		return spraddrCiudad;
	}
	public void setSpraddrCiudad(String spraddrCiudad) {
		this.spraddrCiudad = spraddrCiudad;
	}
	public String getSpraddrColonia() {
		return spraddrColonia;
	}
	public void setSpraddrColonia(String spraddrColonia) {
		this.spraddrColonia = spraddrColonia;
	}
	public String getSpraddrEstado() {
		return spraddrEstado;
	}
	public void setSpraddrEstado(String spraddrEstado) {
		this.spraddrEstado = spraddrEstado;
	}
	public String getStvatypTipo() {
		return stvatypTipo;
	}
	public void setStvatypTipo(String stvatypTipo) {
		this.stvatypTipo = stvatypTipo;
	}
	public int getSpbpersNumseq() {
		return spbpersNumseq;
	}
	public void setSpbpersNumseq(int spbpersNumseq) {
		this.spbpersNumseq = spbpersNumseq;
	}
	public String getSpbpersFallecido() {
		return spbpersFallecido;
	}
	public void setSpbpersFallecido(String spbpersFallecido) {
		this.spbpersFallecido = spbpersFallecido;
	}
	public Date getSpbpersFechNac() {
		return spbpersFechNac;
	}
	public void setSpbpersFechNac(Date spbpersFechNac) {
		this.spbpersFechNac = spbpersFechNac;
	}
	public String getSpbpersSex() {
		return spbpersSex;
	}
	public void setSpbpersSex(String spbpersSex) {
		this.spbpersSex = spbpersSex;
	}
	public String getSpbpersUser() {
		return spbpersUser;
	}
	public void setSpbpersUser(String spbpersUser) {
		this.spbpersUser = spbpersUser;
	}
	public String getSpbpesrCivil() {
		return spbpesrCivil;
	}
	public void setSpbpesrCivil(String spbpesrCivil) {
		this.spbpesrCivil = spbpesrCivil;
	}
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
	public int getSprteleNumseq() {
		return sprteleNumseq;
	}
	public void setSprteleNumseq(int sprteleNumseq) {
		this.sprteleNumseq = sprteleNumseq;
	}
	public int getSprteleFlag() {
		return sprteleFlag;
	}
	public void setSprteleFlag(int sprteleFlag) {
		this.sprteleFlag = sprteleFlag;
	}
	public int getSprteleNumber() {
		return sprteleNumber;
	}
	public void setSprteleNumber(int sprteleNumber) {
		this.sprteleNumber = sprteleNumber;
	}
	public String getStvteleCode() {
		return stvteleCode;
	}
	public void setStvteleCode(String stvteleCode) {
		this.stvteleCode = stvteleCode;
	}



}
