El enunciado del ejercicio fue proporcionado por digital-house.

En esta ejercitacion se realizo el diagrama entidad-relacion y el diagrama relacional de la base de datos que se necesita de acuerdo al siguiente enunciado:

Digital House necesita diseñar una base de datos para su sistema “Playground”.
Este sistema es un campus destinado para que los estudiantes tengan acceso al
contenido que tienen que estudiar para una clase, realizar ejercitaciones, descargar
material de referencia y todo lo necesario para su aprendizaje.

Usuario:
● Nombre, apellido, email, contraseña y categoría.
● Podrán tener categoría de estudiantes, docentes, editores o
administradores.
● Un usuario está asociado a una carrera que tiene un nombre, una
fecha de inicio, una fecha de finalización.
● Una carrera tiene materias.

Lo siguiente que queremos es poder almacenar las materias que tendrán:
●
Un título, una descripción, una imagen, una fecha de inicio, una fecha de
finalización y un cupo máximo.
●
Módulos (unidades temáticas para organizar el contenido) que tendrán
un título, una descripción y una fecha de inicio.

Adicionalmente a los usuarios y materias, le gustaría almacenar información
relativa al contenido a publicar.
Es por esto que decidió organizar las unidades en distintas clases que
también tendrán un título, una descripción, una fecha de inicio, y una marca de
visibilidad (si el bloque está visible o no).
Las clases pueden ser “virtuales” o “en vivo”.
Todas las clases contendrán bloques.
Los bloques tendrán un título y una marca de visibilidad. Los bloques podrán
ser de diferente tipo: texto, vídeo, presentación, PDF o archivo.
