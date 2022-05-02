package com.generation.treinospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.treinospring.model.ClienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel,Long> {
				public List<ClienteModel>findAllByPlacaContainingIgnoreCase(String placa);
}
