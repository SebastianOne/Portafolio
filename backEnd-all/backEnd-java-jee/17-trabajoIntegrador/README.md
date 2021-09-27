los archivos de del 24 hasta el 29, estan pidiendo que se implemente API REST. es decir usar API REST para las diferentes entidades dentro de la clinica de odontologos.


---------------------------------------------------------------------------------

CREATE TABLE domicilio(
    id_domicilio int PRIMARY KEY AUTO_INCREMENT,
    calle varchar(20) NOT NULL,
    numero int NOT NULL,
    localidad varchar(30) NOT NULL,
    provincia varchar(30) NOT NULL
);

CREATE TABLE paciente(
    id_paciente int PRIMARY KEY AUTO_INCREMENT,
    apellido varchar(30) NOT NULL,
    nombre varchar(40) NOT NULL,
    dni varchar(40) NOT NULL,
    fecha_alta DATETIME NOT NULL,
    id_domicilio int NOT NULL
);

CREATE TABLE odontologo(
    id_odontologo int PRIMARY KEY AUTO_INCREMENT,
    apellido varchar(30) NOT NULL,
    nombre varchar(40) NOT NULL,
    matricula varchar(40) NOT NULL
);

CREATE TABLE turno(
    id_turno int PRIMARY KEY AUTO_INCREMENT,
    id_odontologo int NOT NULL,
    id_odontologo int NOT NULL,
    fecha_hora_turno DATETIME NOT NULL
);


ALTER TABLE paciente 
add constraint paciente_domicilio_fk foreign key (id_domicilio)
references domicilio (id_domicilio);

ALTER TABLE turno 
add constraint turno_paciente_fk foreign key (id_paciente)
references paciente (id_paciente);

ALTER TABLE turno 
add constraint turno_odontologo_fk foreign key (id_odontologo)
references odontologo(id_odontologo);

-------------------------------------------------------------------------------
json:

{
    "nombre": "camilo andres",
    "appelido": "perez garzon",
    "dni": "123456789123456",
    "fecha_alta": "2021-12-31 21:59:59",
    "domicilio":{
        "calle": "calle garzon",
        "numero":45,
        "localidad": "san sipriano",
        "provincia": "provincia4"
    }

}



