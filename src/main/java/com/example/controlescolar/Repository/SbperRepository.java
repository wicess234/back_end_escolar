package com.example.controlescolar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.controlescolar.Entity.Spbper;

@Repository
public interface SbperRepository extends JpaRepository<Spbper, Long> {

}
