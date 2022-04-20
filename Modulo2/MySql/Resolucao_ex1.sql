CREATE DATABASE db_RH;
USE db_RH;

DROP DATABASE db_RH;

CREATE TABLE colaboradores(
	id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    nome VARCHAR(255) NOT NULL,
    cargo VARCHAR(255) NOT NULL,
    setor VARCHAR(255) NOT NULL,
    salario DOUBLE NOT NULL
);

INSERT INTO colaboradores(nome, cargo, setor, salario)
VALUE(
	"Gustavo", "Supervisor", "Rh", 36500.00
);

INSERT INTO colaboradores(nome, cargo, setor, salario)
VALUE(
	"Bianca", "Gerente", "Administrativo", 46500.00
);

INSERT INTO colaboradores(nome, cargo, setor, salario)
VALUE(
	"Gabi", "Auxiliar adm", "Administrativo", 1500.00
);

INSERT INTO colaboradores(nome, cargo, setor, salario)
VALUE(
	"Eliomar", "Porteiro", "Rh", 1700.00
);

INSERT INTO colaboradores(nome, cargo, setor, salario)
VALUE(
	"Paula", "enfermeira", "Rh", 1900.00
);

DESC colaboradores;

SELECT * 
FROM colaboradores 
WHERE salario < 2000;

SELECT nome, salario 
FROM colaboradores 
WHERE salario < 2000;

SELECT nome,salario FROM colaboradores
WHERE salario > 2000;

/*--------------------EX2--------------------------------------------*/
CREATE DATABASE db_Ecommerce;
USE db_Ecommerce;

DROP DATABASE db_Ecommerce;

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT, 
    nome VARCHAR(255),
    descricao VARCHAR(255),
    valor FLOAT(9,2), 
    modelo VARCHAR(255),

	PRIMARY KEY (id)
);
ALTER TABLE tb_produtos MODIFY valor FLOAT(9,2);

INSERT INTO tb_produtos(nome,descricao, valor,modelo)
VALUES("xbox", "usado para jogar", 1520.00, "series x"),
	("Ps4", "Usado para jogar", 1620.99, "Slim"),
    ("Ps4", "Usado para jogar", 1620.99, "Slim"),
    ("Ps3", "Usado para jogar", 1020.99, "Black"),
    ("Ps2", "Usado para jogar", 820.99, "Premium"),
    ("xbox one", "usado para jogar", 1520.00, "series one"),
    ("xbox 360", "usado para jogar", 1020.00, "series 360"),
    ("Placa de som", "usado para gravar com mais qualidade o som", 420.00, "series k954"),
    ("Ps1", "Usado para jogar", 620.99, "Init");
    
    SELECT * FROM tb_produtos;
    
    SELECT id ,nome, valor 
    FROM tb_produtos 
	WHERE valor < 500;
    
    SELECT  id, nome,valor
    FROM  tb_produtos
    WHERE valor > 500;
  /*--------------------EX3--------------------------------------------*/  
  
  CREATE DATABASE db_escola;
  USE db_escola;
  
  DROP DATABASE db_escola;
  DROP TABLE tb_estudante;
  
  CREATE TABLE tb_estudante(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(255),
    turma VARCHAR(255),
    curso VARCHAR(255),
    semestre INT ,
    nota FLOAT(3,1),
    
    PRIMARY KEY(id)
  );
  
  INSERT INTO tb_estudante(nome,turma,curso,semestre,nota) 
  VALUES
	("Gustavo"," Tarde","Analise de sistemas", 3, 6.5),
    ("Israel","noite","Analise de sistemas", 4, 7),
    ("Michael","Tarde","Analise de sistemas",3, 8.6),
    ("Douglas","noite", "Analise de sistemas",4, 4.0),
    ("Maiar","noite", "Analise de sistemas",4, 5.3),
    ("Fernadno","noite", "Analise de sistemas",4, 9),
    ("Bianca","Tarde", "Analise de sistemas",3, 10),
    ("Gabriele","Tarde", "Analise de sistemas",4, 10
    );

    SELECT * 
    FROM tb_estudante
	WHERE nota < 7;
    
    SELECT * 
    FROM tb_estudante
	WHERE nota < 7;

/*
	ANOTAÇÕES
		alterando do tipo de dado em uma coluna
		alter table colaboradores modify id bigint;
        
         Alterando dados 
		update colaboradores set setor = "Administrativo" where id >= 4;
        
        apagando dados
		delete from colaboradores where id = 1;
        
*/