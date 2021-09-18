En este ejercicio realice una API REST sencilla usando spring boot, con un CRUD para una tabla llamada estudiante, como base de datos use H2 para tener la base de datos de forma local. se implemento el patron DAO, y accedimos a la base de datos por medio de JDBC.

--------------------------------------------------------------------------------
el sql de la tabla para esta API es la siguiente:

CREATE TABLE estudiante(id INT PRIMARY KEY AUTO_INCREMENT, nombre varchar(100) NOT NULL, apellido varchar(100) NOT NULL, profesor varchar(100) NOT NULL , promedio_notas DOUBLE NOT NULL);

insert into estudiante (nombre,apellido,profesor,promedio_notas) values ('Juan2','Perez2','profe2',1252.0);
insert into estudiante (nombre,apellido,profesor,promedio_notas) values ('Juan3','Perez3','profe3',1252.0);
insert into estudiante (nombre,apellido,profesor,promedio_notas) values ('Juan4','Perez4','profe4',1252.0);
insert into estudiante (nombre,apellido,profesor,promedio_notas) values ('Juan5','Perez5','profe5',1252.0);

--------------------------------------------------------------------------------

por otro el uso de la API es la siguiente:
- listar todos los estudiantes: peticion GET, "/estudiantes/"
- buscar a un estudiante en especifico segun el id: peticion GET, "/estudiante/3" en donde el 3 es el id
- actualizar a un estudiante: peticion PUT, "/estudiante/actualizar" y en el body del Json va de la siguiente forma:
{
    "id": 2,
    "nombre": "rosa",
    "apellido": "smith",
    "profesor": "pepttte",
    "promedioNotas": 7.0
}

- insertar un estudiante: peticion POST, "/estudiante/registrar" y en el body del Json va de la siguiente forma:

{
    "nombre": "rosa",
    "apellido": "smith",
    "profesor": "pepttte",
    "promedioNotas": 7.0
}



