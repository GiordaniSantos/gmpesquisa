package com.curso.gmpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.gmpesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	

}
