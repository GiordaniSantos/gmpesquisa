 package com.curso.gmpesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.gmpesquisa.dto.RecordDTO;
import com.curso.gmpesquisa.dto.RecordInsetDTO;
import com.curso.gmpesquisa.entities.Game;
import com.curso.gmpesquisa.entities.Record;
import com.curso.gmpesquisa.repositories.GameRepository;
import com.curso.gmpesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsetDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		
		return new RecordDTO(entity);
		
	}
}
