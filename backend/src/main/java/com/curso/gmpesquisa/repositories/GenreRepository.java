package com.curso.gmpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.gmpesquisa.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
	

}
