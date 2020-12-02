# ControlMiembros
Proyecto web con java, base de datos Mysql con MySQL Workbench 8.0 CE, y en el cliente JSP

codigo Mysql
CREATE DATABASE control_miembros;

USE control_miembros;

Create Table miembro(
	id_miembro int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(45) NOT NULL,
    apellido varchar(45) NOT NULL,
    telefono varchar(45) NOT NULL,
    email varchar(45) NOT NULL,
    membresia varchar(45) NOT NULL
);

Insert INTO miembro(nombre,apellido,telefono,email,membresia)VALUES("Matias","Rodriguez","mati@gmail.com","4444-5555","Plata");
Insert INTO miembro(nombre,apellido,telefono,email,membresia)VALUES("Ezequiel","Perez","perez@gmail.com","4455-5555","Bronce");
Insert INTO miembro(nombre,apellido,telefono,email,membresia)VALUES("Rocio","Rodriguez","roo@gmail.com","3344-5555","Oro");
Insert INTO miembro(nombre,apellido,telefono,email,membresia)VALUES("Florencia","Suarez","flor@gmail.com","1111-5555","Bronce");
Insert INTO miembro(nombre,apellido,telefono,email,membresia)VALUES("Erica","Rodriguez","eri@gmail.com","2222-5555","Plata");
Insert INTO miembro(nombre,apellido,telefono,email,membresia)VALUES("Juan","Perez","Juan@gmail.com","4444-6666","Bronce");
 
