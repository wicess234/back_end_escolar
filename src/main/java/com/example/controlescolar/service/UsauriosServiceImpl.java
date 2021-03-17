package com.example.controlescolar.service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.controlescolar.Entity.Spriden;
import com.example.controlescolar.Entity.DTO.RegistroDto;
import com.example.controlescolar.Entity.DTO.UploadFileDTO;
import com.example.controlescolar.Repository.ISpridemRepository;
import com.example.controlescolar.Repository.IstvTurnRepository;

@Service
public class UsauriosServiceImpl implements IUsuariosService {
	
	
	
	@Autowired
	private ISpridemRepository iSrpidenRepository;
	
	@Autowired
	private IstvTurnRepository istvTurnRepository;
	@Override
	@Transactional
	public ResponseEntity<RegistroDto> save(@Valid RegistroDto spridendto2){
		
	 	Calendar fecha = new GregorianCalendar();
	 	int year = fecha.get(Calendar.YEAR);  
	 	Random r1 = new Random();
	 	int numero=r1.nextInt(10000);
		Spriden newSpriden=new Spriden();
		 String numeros=String.valueOf(year+""+numero);
	 		int matriculaEstudiante=Integer.parseInt(numeros);
	 		List<Spriden> spr=iSrpidenRepository.sarchsMatricula(matriculaEstudiante);
	 		if(!spr.isEmpty()) {
	 		 	Random r2 = new Random();
	 		 	int numero2=r2.nextInt(10000);
	 			 String numeros2=String.valueOf(year+""+numero2);
	 	 		int matriculaEstudiante2=Integer.parseInt(numeros2);
	 			 newSpriden.setSpridenMatricula(matriculaEstudiante2);
	 		}else {
	 			newSpriden.setSpridenMatricula(matriculaEstudiante);	 	
	 		}
	 		
			newSpriden.setSpridenAp(spridendto2.getSpridenAp());
		 	newSpriden.setSpridenApm(spridendto2.getSpridenApm());
		 	newSpriden.setSpridenNombre(spridendto2.getSpridenNombre());
		 	newSpriden.setSpridenCurp(spridendto2.getSpridenCurp());
		 	newSpriden.setSpridenFlag(spridendto2.getSpridenFlag());
		 	newSpriden.setSridenUser(spridendto2.getSridenUser());
		 	newSpriden.setUsuarioId(spridendto2.getUsuarioId());
		 	newSpriden.setSpridenActivityDate(spridendto2.getSpridenActivityDate());	 	

		 	iSrpidenRepository.saveAndFlush(newSpriden);
		return new ResponseEntity<RegistroDto>(spridendto2,HttpStatus.OK);
	}
	
	
	
	public static final String uploadingDir = System.getProperty("user.dir") + "/alumnosDocumentos";
	 
	@Override
	@Transactional
	public ResponseEntity<UploadFileDTO> saveFile(MultipartFile file) throws Exception {
			
		System.out.println(StringUtils.cleanPath(file.getOriginalFilename()));
        try {
            Path copyLocation = Paths
                .get(uploadingDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
            System.out.println(copyLocation);
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
          //  throw new FileStorageException("Could not store file " + file.getOriginalFilename()
          //      + ". Please try again!");
        }
			

		return null;
	}

	

}
