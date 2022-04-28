package com.generation.projetospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projeto")
public class PessoaController {

	@GetMapping
	public String getAll() {
		return "Funcionando meu chapa";
	}
	
}
