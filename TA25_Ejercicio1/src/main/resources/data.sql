
DROP table IF EXISTS fabricantes;

create table fabricantes(
	codigo int auto_increment,
	nombre varchar(100),
	primary key (codigo)
);

DROP table IF EXISTS articulos;

create table articulos(
	codigo int auto_increment,
	nombre varchar(100),
	precio int,
	codfabricante int,
	primary key (codigo),
	foreign key(codfabricante) references fabricantes(codigo) 
);

insert into fabricantes (nombre)values('Jose');
insert into fabricantes (nombre)values('Dani');
insert into fabricantes (nombre)values('Pol');



insert into articulos (nombre, precio,codfabricante)values('Placa Base',50,3);
insert into articulos (nombre, precio,codfabricante)values('Fuente Alimentacion',60,2);
insert into articulos (nombre, precio,codfabricante)values('Memoria Ram',70,1);
