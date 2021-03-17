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

import com.example.controlescolar.Entity.Opccarr;
import com.example.controlescolar.Entity.OpccarrPK;
import com.example.controlescolar.Entity.Spbper;
import com.example.controlescolar.Entity.Spraddr;
import com.example.controlescolar.Entity.Spriden;

import com.example.controlescolar.Entity.Sprtele;
import com.example.controlescolar.Entity.DTO.DatosPersonalesDto;

import com.example.controlescolar.Entity.DTO.RegistroDto;
import com.example.controlescolar.Entity.DTO.UploadFileDTO;
import com.example.controlescolar.Repository.ISpridemRepository;
import com.example.controlescolar.Repository.IstvTurnRepository;
import com.example.controlescolar.Repository.OpeccarRepository;
import com.example.controlescolar.Repository.SbperRepository;
import com.example.controlescolar.Repository.SpraddrRepository;
import com.example.controlescolar.Repository.SprteleRepository;
import com.example.controlescolar.Repository.StvprepRepository;
import com.example.controlescolar.Repository.StvtelRepository;
import com.example.controlescolar.Repository.StvtermRepository;


@Service
public class UsauriosServiceImpl implements IUsuariosService {
	
	
	
	@Autowired
	private ISpridemRepository iSrpidenRepository;
	
	@Autowired
	private IstvTurnRepository istvTurnRepository;
	@Autowired
	private StvprepRepository stvpreprRepository;
	
	@Autowired
	private OpeccarRepository opeccarRepository;
	
	@Autowired
	private StvtermRepository stvtermRepository;
	
	@Autowired
	private StvtelRepository stvtelRepository;
	
	@Autowired
	private SprteleRepository sprtelerepository;
	
	@Autowired
	private SbperRepository sbperRepository;
	
	@Autowired
	private SpraddrRepository spraddrRepository;
	
	@Override
	@Transactional
	public ResponseEntity<?> save(@Valid RegistroDto spridendto2){
		
	 	Calendar fecha = new GregorianCalendar();
	 	int year = fecha.get(Calendar.YEAR);  
	 	Random r1 = new Random();
	 	int numero=r1.nextInt(10000);
		Spriden newSpriden=new Spriden();
		 String numeros=String.valueOf(year+""+spridendto2.getCarrera()+numero);
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

		 	newSpriden.setSpridenActivityDate(spridendto2.getSpridenActivityDate());
		 	OpccarrPK id = new OpccarrPK();
		 			id.setSpridenMatricula(matriculaEstudiante);
		 			id.setStvcarrId(spridendto2.getCarrera());
		 			
		 			
		 	Opccarr pecar=new Opccarr();
		 		pecar.setId(id);
		 		pecar.setSpriden(newSpriden);
		 		pecar.setStvprep(stvpreprRepository.findById(spridendto2.getPrepaId()).get());
		 		pecar.setStvterm(stvtermRepository.findById(spridendto2.getTermino()).get());
		 		pecar.setStvturn(istvTurnRepository.findById(spridendto2.getTurno()).get());
		 	
		 		
		 	
		 	Spriden idMatircula=iSrpidenRepository.saveAndFlush(newSpriden);
		 	opeccarRepository.saveAndFlush(pecar);
	 	 	Spbper spbprnew=new Spbper();
		 	spbprnew.setSpbpersFallecido(spridendto2.getSpbpersFallecido());
		 	spbprnew.setSpbpersFechNac(spridendto2.getSpbpersFechNac());
		 	spbprnew.setSpbpersSex(spridendto2.getSpbpersSex());
		 	spbprnew.setSpbpersUser(spridendto2.getSpbpersUser());
		 	spbprnew.setSpbpesrCivil(spridendto2.getSpbpesrCivil());
		 	spbprnew.setSpridenActivityDate(spridendto2.getSpridenActivityDate());
			spbprnew.setSpriden(iSrpidenRepository.searchsMatriculaPer(idMatircula.getSpridenMatricula()));
			sbperRepository.saveAndFlush(spbprnew);
		 	Sprtele sprtele=new Sprtele();
		 			sprtele.setSprteleFlag(spridendto2.getSprteleFlag());
		 			sprtele.setSprteleNumber(spridendto2.getSprteleNumber());
		 			sprtele.setStvteleCode(spridendto2.getStvteleCode());
		 			sprtele.setSpriden(iSrpidenRepository.searchsMatriculaPer(idMatircula.getSpridenMatricula()));
		 			sprtelerepository.saveAndFlush(sprtele);	 	 
		 	
		 	Spraddr spradrees=new Spraddr();
		 			spradrees.setPraddrCalle(spridendto2.getPraddrCalle());
		 			spradrees.setPraddrCp(spridendto2.getPraddrCp());
		 			spradrees.setPraddrMunODel(spridendto2.getPraddrMunODel());
		 			spradrees.setPraddrNum(spridendto2.getPraddrNum());
		 			spradrees.setPraddrPais(spridendto2.getPraddrPais());
		 			spradrees.setSpraddrCiudad(spridendto2.getSpraddrCiudad());
		 			spradrees.setSpraddrColonia(spridendto2.getSpraddrColonia());
		 			spradrees.setSpraddrEstado(spridendto2.getSpraddrEstado());
		 			spradrees.setSpridenActivityDate(spridendto2.getSpridenActivityDate());
		 			spradrees.setSridenUser(spridendto2.getSpbpersUser());
		 			spradrees.setStvatypTipo(spridendto2.getStvatypTipo());
		 			spradrees.setSpriden(iSrpidenRepository.searchsMatriculaPer(idMatircula.getSpridenMatricula()));
		 			spraddrRepository.saveAndFlush(spradrees);
		 			
		 	spridendto2.setSpridenMatricula(idMatircula.getSpridenMatricula());

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
	
	
	
	@Override
	@Transactional
	public ResponseEntity<?> saveDatosPersonales(@Valid DatosPersonalesDto datosPersonalesdto){
						
					Spbper spbpers=new Spbper();
							spbpers.setSpbpersFallecido(datosPersonalesdto.getSpbpersFallecido());
							spbpers.setSpbpersFechNac(datosPersonalesdto.getSpbpersFechNac());
							spbpers.setSpbpersSex(datosPersonalesdto.getSpbpersSex());
							spbpers.setSpbpersUser(datosPersonalesdto.getSpbpersUser());
							spbpers.setSpbpesrCivil(datosPersonalesdto.getSpbpesrCivil());
							spbpers.setSpridenActivityDate(datosPersonalesdto.getSpridenActivityDate());
				sbperRepository.saveAndFlush(spbpers);
		
		return new ResponseEntity<DatosPersonalesDto>(datosPersonalesdto,HttpStatus.OK);
	}
	
	


	

}
