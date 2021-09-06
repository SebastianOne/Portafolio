DROP TABLE IF EXISTS odontologo;
CREATE TABLE odontologo(id INT PRIMARY KEY AUTO_INCREMENT, nombre varchar(100) NOT NULL, apellido varchar(100) NOT NULL, matricula varchar(100) NOT NULL );
insert into odontologo (nombre,apellido,matricula) values ('Juan','Perez','juan@gamil.com');
insert into odontologo (nombre,apellido,matricula) values ('Pepito','Rodriguez','pepito@gamil.com');
insert into odontologo (nombre,apellido,matricula) values ('Raul','Sanabria','raul@gamil.com');
