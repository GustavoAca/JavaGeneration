-- Exercico 1

create database db_generation_game_online;
use db_generation_game_online;

create table tb_classes(
id_classe bigint auto_increment,
nome_classe varchar(255),
atributo_bonus varchar(255),

primary key (id_classe)
);

create table tb_personagens(
id_personagem bigint auto_increment,
nome_personagem varchar(50),
nivel int,
ataque int,
defesa int,
id_classe bigint,

primary key (id_personagem),
foreign key (id_classe) references tb_classes(id_classes)
);

insert tb_classes(nome_classe,atributo_bonus)
value
("Mago", "Magica");

insert tb_classes(nome_classe,atributo_bonus)
value
("Feiticeiro", "Magica");

insert tb_classes(nome_classe,atributo_bonus)
value
("Barbaro", "Força");

insert tb_classes(nome_classe,atributo_bonus)
value
("Cavaleiro", "Destreza");

insert tb_classes(nome_classe,atributo_bonus)
value
("Ladino", "Furtividade");

select * from tb_classes;

insert tb_personagens(nome_personagem,nivel,ataque,defesa,id_classe)
value
("Gerald",5,100,1500,1);

insert tb_personagens(nome_personagem,nivel,ataque,defesa,id_classe)
value
("Gus",65,16000,21000,1);

insert tb_personagens(nome_personagem,nivel,ataque,defesa,id_classe)
value
("Geral",42,3210,1500,2);

insert tb_personagens(nome_personagem,nivel,ataque,defesa,id_classe)
value
("Gald",35,2500,1500,3);

insert tb_personagens(nome_personagem,nivel,ataque,defesa,id_classe)
value
("Ger",50,10000,1600,4);

insert tb_personagens(nome_personagem,nivel,ataque,defesa,id_classe)
value
("Rald",25,1000,4500,4);

insert tb_personagens(nome_personagem,nivel,ataque,defesa,id_classe)
value
("Ald",5,100,6540,5);

insert tb_personagens(nome_personagem,nivel,ataque,defesa,id_classe)
value
("Erald",15,500,150,1);

select *
from tb_personagens
where ataque > 2000;

select *
from tb_personagens
where defesa >= 1000 and defesa <=2000;

select *
from tb_personagens
where nome_personagem like '%c%';

select *
from tb_classes
inner join tb_personagens on tb_personagens.id_classe = tb_classes.id_classe;

select *
from tb_classes
inner join tb_personagens on tb_personagens.id_classe = tb_classes.id_classe
where nome_classe = "Cavaleiro";

-- Exercicio 2

create database db_pizzaria_legal;
use db_pizzaria_legal;



create table tb_categorias(
	id_categoria bigint auto_increment,
    nome_categoria varchar(255),
    tamanho varchar(255),
    
    primary key (id_categoria)
);

insert tb_categorias(nome_categoria,tamanho)
value
("Salgado","Pequena");

insert tb_categorias(nome_categoria,tamanho)
value
("Salgado","Grande");

insert tb_categorias(nome_categoria,tamanho)
value
("Doce","Pequena");

insert tb_categorias(nome_categoria,tamanho)
value
("Doce","Grande");

create table tb_pizza
(
	id_pizza bigint auto_increment,
	nome varchar(255),
    preco decimal(5,2),
    azeitona boolean,
    borda_recheado boolean,
    id_categoria bigint,
    
    primary key (id_pizza),
    foreign key (id_categoria) references tb_categoria(id_categoria)
);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("Queijo",40.9, true, true, 1);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("Milho",40.9, true, true, 2);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("Kinder",90.98, true, true, 4);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("Palmito",35.9, true, true, 2);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("M&M",50.0, false, true, 3);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("Queijo",25.9, true, true, 1);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("Queijo",25.9, false, true, 2);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("Calabresa",60.9, true, true, 2);

insert tb_pizza(nome,preco,azeitona,borda_recheado, id_categoria)
value
("Frango catupiry",50.6,true, false, 2);

select *
from tb_pizza
where preco > 45.0;

select * 
from tb_pizza
where preco >= 50.0 and preco <= 100.00;

select *
from tb_pizza
where nome like '%M';


select *
from tb_categorias
inner join tb_pizza on tb_categorias.id_categoria = tb_pizza.id_categoria;

select *
from tb_categorias
inner join tb_pizza on tb_categorias.id_categoria = tb_pizza.id_categoria
where nome_categoria = 'Doce';

-- Exercicio 3

create database db_farmacia_bem_estar;
use db_farmacia_bem_estar;

create table tb_categoria(
	id_categoria bigint auto_increment,
    tipo varchar(255),
    descricao varchar(255),
    
    primary key(id_categoria)
);

insert tb_categoria(tipo, descricao)
value
("generico","paralelo");

insert tb_categoria(tipo,descricao)
value
("Psicotropico","psiquiatricos");

insert tb_categoria(tipo,descricao)
value
("Calmante","para calmar");

insert tb_categoria(tipo,descricao)
value
("Preservativo","para evitar ist");

insert tb_categoria(tipo,descricao)
value
("Abortiva","para não vender para gravidas");

create table tb_produtos(
	id_produtos bigint auto_increment,
    nome varchar(255),
    preco decimal(5,2),
    receita boolean,
    desconto boolean,
    id_categoria bigint,
    
    primary key(id_produtos),
    foreign key(id_categoria) references tb_categoria(id_categoria)
);

insert tb_produtos(nome,preco,receita,desconto,id_categoria)
value
("Dipirona",45.0,false,false,1
);

insert tb_produtos(nome,preco,receita,desconto,id_categoria)
value
("Psicotropico", 61.2, false, false, 2
);

insert tb_produtos(nome,preco,receita,desconto,id_categoria)
value
("Tarja preta",80.6, true, true, 3
);

insert tb_produtos(nome,preco,receita,desconto,id_categoria)
value
("olla",9.90,false, false, 4
);

insert tb_produtos(nome,preco,receita,desconto,id_categoria)
value
("remedio abortista",56.4,true, true,5
);

insert tb_produtos(nome,preco,receita,desconto,id_categoria)
value
("olla",9.90,false, false, 4
);

insert tb_produtos(nome,preco,receita,desconto,id_categoria)
value
("remedio abortista",56.4,true, true,5
);

insert tb_produtos(nome,preco,receita,desconto,id_categoria)
value
("Psicotropico", 61.2, false, false, 2
);


select *
from tb_produtos
where preco > 50;

select *
from tb_produtos
where preco >= 5 and preco <= 60;

select *
from tb_produtos
where nome like '%C';

select *
from tb_produtos
inner join tb_categoria on tb_produtos.id_categoria = tb_categoria.id_categoria;

-- Exercicio 4
create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint(5) auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert tb_categoria (descricao, ativo) values ("Bovino",true);
insert tb_categoria (descricao, ativo) values ("Suino",true);
insert tb_categoria (descricao, ativo) values ("Aves",true);
insert tb_categoria (descricao, ativo) values ("pertence feijoada",true);
insert tb_categoria (descricao, ativo) values ("imbutidos",true);
insert tb_categoria (descricao, ativo) values ("outros",true);

select * from tb_categoria;

create table tb_produtos (
id bigint(5) auto_increment,
nome varchar (255) not null,
preco decimal not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("ASA",40.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Picanha",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("coxa de frango",20.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Bacon",30.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("hamburguer",60.00,30,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Cupim",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Peito de frango",25.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Orelha de porco",20.00,30,4);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Salame",18.00,30,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("medalhao",50.00,30,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("mocoto",20.00,30,2);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("chuleta",20.00,30,1);
insert tb_produtos (nome, preco, qtProduto) values ("acendedor de churrasqueira",20.00,30);

select * from tb_produtos;

select * from tb_produtos where preco > 50;

select * from tb_produtos where preco > 50 and preco < 150;

select * from tb_produtos where nome like '%C';

select * from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;

select * from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id 
where  descricao = "Aves";

-- Exercicio 5

create database db_construindo_vidas;
use db_construindo_vidas;

create table tb_categorias(
	id_categoria bigint auto_increment,
    nome varchar(255),
    descricao varchar(255),
    
    primary key (id_categoria)
);

insert tb_categorias(nome,descricao)
values	("Construção","Máterias para construir"),
		("Manutenção","Objetos de reparação"),
        ("Isolamento","Isolantes"),
        ("Demolição","Para destruir");
        
create table tb_produtos(
	id_produtos bigint auto_increment,
    nome varchar(255),
    preco decimal(6,2),
    peso decimal(6,2),
    tamanho decimal(6,3),
    id_categoria bigint,
    
    primary key (id_produtos),
    foreign key(id_categoria) references tb_categoria(id_categoria)
);

insert tb_produtos(nome,preco,peso,tamanho,id_categoria)
values
("Martelo",96.0, 2.0, 0.3,2),
("Explosivo",9600.0, 200.0, 0.3,4),
("Fita isolante",26.0, 0.2, 0.3,3),
("Fita branca",16.0, 0.02, 0.3,3),
("Trena",39.8, 0.3, 5.0,2),
("Alicate",75.0, 0.3, 0.2,2),
("Saco de cimento",50.0, 20.0, 0.5,1),
("Marreta",96.0, 8.0, 0.5,4);

select * 
from tb_produtos
where preco > 100;

select *
from tb_produtos
where preco > 70 and preco < 150;

select *
from tb_produtos
where nome like '%C%';

select tb_categorias.id_categoria,tb_produtos.nome, tb_produtos.preco,tb_produtos.peso, tb_categorias.descricao
from tb_produtos
inner join tb_categorias on tb_produtos.id_categoria = tb_categorias.id_categoria ;

select tb_categorias.id_categoria,tb_produtos.nome, tb_produtos.preco,tb_produtos.peso, tb_categorias.descricao
from tb_produtos
inner join tb_categorias on tb_produtos.id_categoria = tb_categorias.id_categoria 
where tb_categorias.descricao = "Isolantes";

-- Exercicio 6

create database db_curso_da_minha_vida;
use db_curso_da_minha_vida;

create table tb_categoria(
	id_categoria bigint auto_increment,
    nome varchar(255),
    descricao varchar(255),
    
    primary key (id_categoria)
);

insert tb_categoria(nome, descricao)
values
		("Progrmação","Cursos ligados a programação"),
        ("Economia","Cursos ligados a economia"),
        ("Educação fisica","Cursos ligados a Educação fisica"),
        ("Odonto","Cursos ligados a odonto "),
        ("Enfermagem","Cursos ligados a enfermagem");
        
create table tb_cursos(
	id_cursos bigint auto_increment,
    nome varchar(255),
    numParticipante int,
    turmaTarde boolean,
    turmaNoite boolean,
    id_categoria bigint,
    mensalidade decimal(6,2),
    
    primary key (id_cursos),
    foreign key(id_categoria) references tb_categoria(id_categoria)
);

insert tb_cursos(nome,numParticipante,turmaTarde,turmaNoite,id_categoria,mensalidade)
values	("Curso java",69,false, true, 1,691.2),
		("Curso Finanças",19,true, false, 2, 350.0),
        ("Curso Educação fisica",54,false, true, 3, 799.0),
        ("Curso Especialista proteses",15,false, true, 4, 1500.99),
        ("Curso Curativos",45,false, true, 5, 286.6),
        ("Curso Python",19,false, true, 1, 164.99),
        ("Curso javascript",25,false, true, 1, 300.00),
        ("Curso Dentes",49,true, true, 2, 897.90);
        
        select *
        from tb_cursos
        where mensalidade > 500;
        
        select * 
        from tb_cursos
        where mensalidade >= 600 and mensalidade <= 1000;
        
        select *
        from tb_cursos
        where nome like '%J%';
        
        select *
        from tb_cursos
        inner join tb_categoria on tb_categoria.id_categoria = tb_cursos.id_categoria;
        
        select *
        from tb_cursos
        inner join tb_categoria on tb_categoria.id_categoria = tb_cursos.id_categoria
        where tb_categoria.nome = "Progrmação";
        
        select *
        from tb_cursos
        inner join tb_categoria on tb_categoria.id_categoria = tb_cursos.id_categoria
        where tb_cursos.turmaTarde = true and tb_cursos.turmaNoite = true ;
        
        
        