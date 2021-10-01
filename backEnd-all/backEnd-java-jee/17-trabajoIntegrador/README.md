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
    email varchar(100) NOT NULL,
    password varchar(200) NOT NULL,
    apellido varchar(30) NOT NULL,
    nombre varchar(40) NOT NULL,
    dni varchar(40) NOT NULL,
    fecha_alta DATETIME NOT NULL,
    id_domicilio int NOT NULL
);

CREATE TABLE odontologo(
    id_odontologo int PRIMARY KEY AUTO_INCREMENT,
    email varchar(100) NOT NULL,
    password varchar(200) NOT NULL,
    apellido varchar(30) NOT NULL,
    nombre varchar(40) NOT NULL,
    matricula varchar(40) NOT NULL
);

CREATE TABLE turno(
    id_turno int PRIMARY KEY AUTO_INCREMENT,
    id_odontologo int NOT NULL,
    id_paciente int NOT NULL,
    fecha_hora_turno DATETIME NOT NULL
);

CREATE TABLE administrador(
    id_administrador int PRIMARY KEY AUTO_INCREMENT,
    email varchar(100) NOT NULL,
    password varchar(200) NOT NULL
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


INSERT INTO `odontologo`(`email`, `password`, `apellido`, `nombre`, `matricula`) VALUES ('odontologo@gmail.com','1234','pedros picapiedra','sadam housein','12344556')

INSERT INTO `domicilio`( `calle`, `numero`, `localidad`, `provincia`) VALUES ('calle pierela',2,'localidad 1','provincia 1')

INSERT INTO `paciente`(`email`, `password`, `apellido`, `nombre`, `dni`, `fecha_alta`, `id_domicilio`) VALUES ('paciente@gmail.com','123456','pardo rubio','andres felipe','dni1234','2021-01-01 12:05:01','1')

INSERT INTO `administrador`(`email`, `password`) VALUES ('administrador@gmail.com','1234567')
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

{
    "nombre": "camilo andres5",
    "apellido": "perez garzon4",
    "dni": "12345678912345654",
    "fecha_alta": "2020-12-12T12:24:23",
    "domicilio":{
        "calle": "calle garzon87",
        "numero": 1,
        "localidad":"localidad nueva",
        "provincia": "provincia nueva"
    }



}



GRUPO 3 – CÓDIGOS: 3,8,13,18,23,28,33 LOS SERES VIVOS Y SU HÁBITAT FINITO EN BOGOTÁ 
cuales son las problematicas que lo tienen
habitat limitado
ver estadisticcas



