create database db_RH;
use db_RH;

drop database db_RH;

create table colaboradores(
	id bigint auto_increment primary key not null,
    nome varchar(255) not null,
    cargo varchar(255) not null,
    setor varchar(255) not null,
    salario double not null
);

insert into colaboradores(nome, cargo, setor, salario)
value(
	"Gustavo", "Supervisor", "Rh", 36500.00
);

insert into colaboradores(nome, cargo, setor, salario)
value(
	"Bianca", "Gerente", "Administrativo", 46500.00
);

insert into colaboradores(nome, cargo, setor, salario)
value(
	"Gabi", "Auxiliar adm", "Administrativo", 1500.00
);

insert into colaboradores(nome, cargo, setor, salario)
value(
	"Eliomar", "Porteiro", "Rh", 1700.00
);

insert into colaboradores(nome, cargo, setor, salario)
value(
	"Paula", "enfermeira", "Rh", 1900.00
);

desc colaboradores;

select * from colaboradores;

select nome,salario from colaboradores
where salario < 2000;

select nome,salario from colaboradores
where salario > 2000;
/*--------------------EX2--------------------------------------------*/












/*
	ANOTAÇÕES
		alterando do tipo de dado em uma coluna
		alter table colaboradores modify id bigint;
        
         Alterando dados 
		update colaboradores set setor = "Administrativo" where id >= 4;
        
        apagando dados
		delete from colaboradores where id = 1;
        
*/