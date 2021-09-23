DROP TABLE IF EXISTS mascota;
CREATE TABLE mascota(id INT PRIMARY KEY AUTO_INCREMENT, nombre varchar(100) NOT NULL, edad INT NOT NULL );
insert into mascota (nombre,edad) values ('Juan',5);
insert into mascota (nombre,edad) values ('Pepito',5);
insert into mascota (nombre,edad) values ('Raul',7);
