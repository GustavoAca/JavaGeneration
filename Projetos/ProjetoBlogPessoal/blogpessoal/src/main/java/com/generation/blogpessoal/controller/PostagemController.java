package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.generation.blogpessoal.model.PostagemModel;
import com.generation.blogpessoal.repository.PostagemRepository;



@RestController
@RequestMapping("/postagem")

public class PostagemController {

	
		@Autowired
		private PostagemRepository repository;
		
		@GetMapping 
		public ResponseEntity<List<PostagemModel>> GetAll(){
			return ResponseEntity.ok(repository.findAll());
		}
	}

