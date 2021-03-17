package com.example.controlescolar.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.controlescolar.Entity.Stvcarr;
import com.example.controlescolar.Entity.DTO.StvCarrDto;
import com.example.controlescolar.Entity.DTO.StvTurnoDto;
import com.example.controlescolar.Repository.StvcarrRepository;
import com.example.controlescolar.service.CatalogosService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST para generar catalogos")
@CrossOrigin(origins="*")
public class CatalogosRestControllet {

	@Autowired
	private CatalogosService catalogoService;
	@GetMapping(value="/carreras")
	@ApiOperation(value="Lista las carreras que ofrece la institucion")
	public List<StvCarrDto> getCarrerasAll()   {
		
		    return catalogoService.finAll();
	      
	}
	
	

	@GetMapping(value="/turnos")
	@ApiOperation(value="Lista los turnos disponibles en la institución")
	public List<StvTurnoDto> getTurnosAll()   {
		
		    return catalogoService.finAllCarreras();
	      
	}

	
}
