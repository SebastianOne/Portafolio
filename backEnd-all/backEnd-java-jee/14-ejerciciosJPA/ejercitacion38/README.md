Enunciado brindado por digital-house:


En esta API-Rest hice una relacion de uno a muchos, bidirecional.


Tal como mencionamos anteriormente, para comenzar con esta actividad tenés que
tener:
*  La relación 1:M entre equipos y jugadores.
*  Haber generado la base de datos desde Springboots usando H2 en memoria.
*  crear API-Rest
*  implementar hibernate-jpa

Desafío

Recordemos... las entidades del proyecto de fútbol son:
● Jugador:
○ Nombre: String.
○ Puesto: String (Delantero, defensor, etc.).
○ Numero: int.

● Equipo:
○ Nombre: String.
○ Ciudad: String.

Ahora, el nuevo desafío consiste en agregar un fetchtype LAZY a la lista de jugadores y
agregar cascade para que, si se elimina un equipo de fútbol, se eliminen todos los
jugadores.

---------------------------------------------------------------------------------------------------------------------------------

sql de la base de datos en mysql:
CREATE TABLE JUGADOR(
    id_jugador int PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    puesto varchar(50) NOT NULL,
    numero int NOT NULL,
    id_equipo int NOT NULL
);

CREATE TABLE EQUIPO(
    id_equipo int PRIMARY KEY AUTO_INCREMENT,
    nombre varchar(50) NOT NULL,
    ciudad varchar(50) NOT NULL
);


ALTER TABLE JUGADOR 
add constraint jugador_equipo_fk foreign key (id_equipo)
references EQUIPO (id_equipo);
----------------------------------------------------------------------------------------------------------------------------------
API-Rest:
en el body para insertar y actualizar es igual jugador el json debe ir de la siguiente forma:
    {
        "id": 2,
        "nombre": "camilo",
        "puesto": "delantero",
        "numero": 10,
        "equipo": {
            "id": 1
        }
    }
------------------------------------------------------------------------------------------------------------------------------------


























