package com.curso.gmpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.gmpesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long> {
	

}
