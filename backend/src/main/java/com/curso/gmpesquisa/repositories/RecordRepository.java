package com.curso.gmpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.gmpesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
	

}