package com.example.controlescolar.service;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import com.example.controlescolar.Entity.DTO.DatosPersonalesDto;
import com.example.controlescolar.Entity.DTO.RegistroDto;
import com.example.controlescolar.Entity.DTO.UploadFileDTO;


public interface IUsuariosService {
	
	ResponseEntity<UploadFileDTO> saveFile(MultipartFile file) throws Exception;

	ResponseEntity<?> save(@Valid RegistroDto spridendto2);

	ResponseEntity<?> saveDatosPersonales(@Valid DatosPersonalesDto datosPersonalesdto);
}
