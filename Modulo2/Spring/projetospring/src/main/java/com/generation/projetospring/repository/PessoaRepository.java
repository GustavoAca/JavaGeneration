package com.generation.projetospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.projetospring.model.PessoaModel;

@Repository

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
	
	public List<PessoaModel> findAllByTituloContainingIgnoreCase(String nome);
	
	
}
