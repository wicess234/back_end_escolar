package com.example.controlescolar.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.controlescolar.Entity.DTO.DatosPersonalesDto;
import com.example.controlescolar.Entity.DTO.RegistroDto;
import com.example.controlescolar.Exception.CustomerExceptionHandler;
import com.example.controlescolar.service.UsauriosServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="Microservicio que registra a los usuarios")
@CrossOrigin(origins="*")
@Validated
public class UsuariosRestController  extends CustomerExceptionHandler{
	
	
	@Autowired
	private UsauriosServiceImpl usaurioServiceImpl;
	

	
	@PostMapping(value="/registro")
	@ApiOperation(value="Guarda los aspirantes cuando realizan su registro")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> newUsuario(@Valid @RequestBody
			RegistroDto spridendto)   {
				
				usaurioServiceImpl.save(spridendto);
				
		return new ResponseEntity<RegistroDto>(spridendto,HttpStatus.OK);
	}
	
	@PostMapping(value="/DatosPersonales")
	@ApiOperation(value="Guarda los aspirantes cuando realizan su registro")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<?> newDatos(@Valid @RequestBody
			DatosPersonalesDto datosPersonalesDto)   {
				
				usaurioServiceImpl.saveDatosPersonales(datosPersonalesDto);
				
		return new ResponseEntity<DatosPersonalesDto>(datosPersonalesDto,HttpStatus.OK);
	}

	
	
}
