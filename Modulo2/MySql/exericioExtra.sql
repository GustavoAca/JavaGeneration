create database db_quitanda;
use db_quitanda;

create table tb_categoria(
	categoria_id bigint auto_increment,
    descricao varchar(255),
    
    primary key (categoria_id)
);

insert tb_categoria(descricao, categoria_id)
values
("Para temperar",1),
("Pada adicionar a receita",2);


create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255),
    descricao varchar(255),
    preco decimal,
    qtdProduto int,
    categoria_id bigint,
    primary key (id),
    foreign key (categoria_id) references tb_categoria(categoria_id)
);



insert tb_produtos(nome, descricao, preco,categoria_id)
values
("Cebola","Tempero",2.50,1),
("Salsa", "Tempero",5.00,1),
("Cenoura", "Ingrediente",9.00,2),
("Batata", "Ingrediente",10.00,2),
("Batata-doce","Ingrediente",10.50,2);

select * from tb_produtos;

select * from tb_categoria;

select * from tb_produtos
where preco > 50;

select * from tb_produtos
where nome like '%a%';

select * from tb_produtos
inner join tb_categoria 
on tb_categoria.categoria_id = tb_produtos.categoria_id;






