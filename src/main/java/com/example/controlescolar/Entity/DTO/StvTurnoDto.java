package com.example.controlescolar.Entity.DTO;

public class StvTurnoDto {
		
	private String stvturnId;
	private String stvturnDesc;
	public StvTurnoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StvTurnoDto(String stvturnId, String stvturnDesc) {
		super();
		this.stvturnId = stvturnId;
		this.stvturnDesc = stvturnDesc;
	}
	public String getStvturnId() {
		return stvturnId;
	}
	public void setStvturnId(String stvturnId) {
		this.stvturnId = stvturnId;
	}
	public String getStvturnDesc() {
		return stvturnDesc;
	}
	public void setStvturnDesc(String stvturnDesc) {
		this.stvturnDesc = stvturnDesc;
	}
	
	
	
}
