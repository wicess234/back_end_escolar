package com.example.controlescolar.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.controlescolar.Entity.Stvcarr;
import com.example.controlescolar.Entity.Stvturn;
import com.example.controlescolar.Entity.DTO.StvCarrDto;
import com.example.controlescolar.Entity.DTO.StvTurnoDto;
import com.example.controlescolar.Repository.IstvTurnRepository;
import com.example.controlescolar.Repository.StvcarrRepository;

@Service
public class CatalogosService {
	
	@Autowired
	private StvcarrRepository stvcarrRepository;
	@Autowired
	private IstvTurnRepository stvTurnRepository;
	
	@Transactional
	public List<StvCarrDto> finAll(){
		
		
				
		List<StvCarrDto> nuevo=new ArrayList<StvCarrDto>();
		List<Stvcarr> lista=stvcarrRepository.findAll();
			for (Stvcarr stvcarr : lista) {
					nuevo.add(new StvCarrDto(stvcarr.getStvcarrId(),stvcarr.getStvcarrDes()));
				
					System.out.print(new StvCarrDto(stvcarr.getStvcarrId(),stvcarr.getStvcarrDes()));
			}
				
			for (StvCarrDto dto : nuevo) {
				System.out.print(dto.getStvcarrId());
				System.out.print(dto.getStvcarrDes());
			}
			return nuevo;
		
	       
	}
	
	@Transactional
	public List<StvTurnoDto> finAllCarreras(){
		
		
		
		List<StvTurnoDto> turno=new ArrayList<StvTurnoDto>();
		List<Stvturn> listaturnos=stvTurnRepository.findAll();
			for (Stvturn stvturn : listaturnos) {
					turno.add(new StvTurnoDto(stvturn.getStvturnId(),stvturn.getStvturnDesc()));
			}
			return turno;
	}
	
	
}
