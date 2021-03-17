package com.example.controlescolar.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.controlescolar.Entity.Stvcarr;

@Repository
public interface StvcarrRepository extends JpaRepository<Stvcarr,String> {
		
	
	@Query(value ="SELECT * FROM Stvcarr",nativeQuery = true)
	List<Stvcarr> searchCarrera();
}
