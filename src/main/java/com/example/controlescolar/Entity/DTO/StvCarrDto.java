package com.example.controlescolar.Entity.DTO;

public class StvCarrDto {
	
	
	
	private String stvcarrId;
	private String stvcarrDes;
	public String getStvcarrId() {
		return stvcarrId;
	}
	public void setStvcarrId(String stvcarrId) {
		this.stvcarrId = stvcarrId;
	}
	public String getStvcarrDes() {
		return stvcarrDes;
	}
	public void setStvcarrDes(String stvcarrDes) {
		this.stvcarrDes = stvcarrDes;
	}
	public StvCarrDto(String stvcarrId, String stvcarrDes) {
		super();
		this.stvcarrId = stvcarrId;
		this.stvcarrDes = stvcarrDes;
	}
	public StvCarrDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stvcarrDes == null) ? 0 : stvcarrDes.hashCode());
		result = prime * result + ((stvcarrId == null) ? 0 : stvcarrId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StvCarrDto other = (StvCarrDto) obj;
		if (stvcarrDes == null) {
			if (other.stvcarrDes != null)
				return false;
		} else if (!stvcarrDes.equals(other.stvcarrDes))
			return false;
		if (stvcarrId == null) {
			if (other.stvcarrId != null)
				return false;
		} else if (!stvcarrId.equals(other.stvcarrId))
			return false;
		return true;
	}
	
	
	
		
}
