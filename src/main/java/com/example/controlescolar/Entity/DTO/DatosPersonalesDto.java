package com.example.controlescolar.Entity.DTO;

import java.util.Date;

import javax.validation.constraints.NotBlank;

public class DatosPersonalesDto {
	
	private int spbpersNumseq;
	@NotBlank(message="El campo fallecido es obligatorio")
	private String spbpersFallecido;
	private Date spbpersFechNac;
	@NotBlank(message="El campo Sexo es ogligatorio ")
	private String spbpersSex;
	private String spbpersUser;
	@NotBlank(message="El campo Estado Civil es ogligatorio ")
	private String spbpesrCivil;
	private Date spridenActivityDate;
	
	
	
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
	public Date getSpridenActivityDate() {
		return spridenActivityDate;
	}
	public void setSpridenActivityDate(Date spridenActivityDate) {
		this.spridenActivityDate = spridenActivityDate;
	}
	public DatosPersonalesDto(int spbpersNumseq,
			@NotBlank(message = "El campo fallecido es obligatorio") String spbpersFallecido, Date spbpersFechNac,
			@NotBlank(message = "El campo Sexo es ogligatorio ") String spbpersSex, String spbpersUser,
			@NotBlank(message = "El campo Estado Civil es ogligatorio ") String spbpesrCivil,
			Date spridenActivityDate) {
		super();
		this.spbpersNumseq = spbpersNumseq;
		this.spbpersFallecido = spbpersFallecido;
		this.spbpersFechNac = spbpersFechNac;
		this.spbpersSex = spbpersSex;
		this.spbpersUser = spbpersUser;
		this.spbpesrCivil = spbpesrCivil;
		this.spridenActivityDate = spridenActivityDate;
	}
	
	
}
