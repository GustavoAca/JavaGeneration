package com.generation.treinospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.treinospring.model.ClienteModel;
import com.generation.treinospring.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")

public class ClienteController {
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping
	public ResponseEntity<List<ClienteModel>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClienteModel> getById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/placas/{placa}")
	public ResponseEntity<List<ClienteModel>> getByPlaca(@PathVariable String placa){
		return ResponseEntity.ok(repository.findAllByPlacaContainingIgnoreCase(placa));
	}
	
	@PostMapping
	public ResponseEntity<ClienteModel> post (@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
	}
	
	@PutMapping 
	public ResponseEntity<ClienteModel> put (@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(cliente));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}
