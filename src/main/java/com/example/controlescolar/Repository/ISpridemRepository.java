package com.example.controlescolar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.controlescolar.Entity.Spriden;



@Repository
public interface ISpridemRepository extends JpaRepository<Spriden, Long> {

	@Query(value ="SELECT * FROM spriden  WHERE SPRIDEN_MATRICULA=?1",nativeQuery = true)
	List<Spriden> sarchsMatricula(int matriculaEstudiante);	
}
