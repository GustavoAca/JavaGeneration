package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@Table(name="Categoria")
public class CategoriaModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Size(min=3, max=20)
		private String descricao;

		
		//RELAÇÃO DE TABLES
		@OneToMany(mappedBy="categoria",cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<ProdutoModel> produto;
		
		//GET E SET
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}


		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public List<ProdutoModel> getProduto() {
			return produto;
		}

		public void setProduto(List<ProdutoModel> produto) {
			this.produto = produto;
		}
		
		
}

