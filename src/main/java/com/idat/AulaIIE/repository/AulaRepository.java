package com.idat.AulaIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.AulaIIE.model.Aula;



@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

}
