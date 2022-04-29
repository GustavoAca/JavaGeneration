package com.generation.projetospring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.projetospring.repository.PessoaRepository;
import com.generation.projetospring.model.PessoaModel;

@RestController
@RequestMapping("/projeto")
public class PessoaController {

	@Autowired
	private PessoaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PessoaModel>> getAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
}
