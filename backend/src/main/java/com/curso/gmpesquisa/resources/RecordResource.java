package com.curso.gmpesquisa.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.gmpesquisa.dto.RecordDTO;
import com.curso.gmpesquisa.dto.RecordInsetDTO;
import com.curso.gmpesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {
	
	@Autowired
	private RecordService service;
	
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsetDTO dto){
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}
	
}
