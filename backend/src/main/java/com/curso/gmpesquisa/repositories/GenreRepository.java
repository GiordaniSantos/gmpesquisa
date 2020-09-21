package com.curso.gmpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.gmpesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
	

}
