enunciado:
Vamos a afianzar nuestro conocimiento de arrays explorando distintas acciones sobre ellos.
Veremos si se comportan como esperamos u ocurren resultados inesperados.
En primer lugar, practiquemos las acciones más comunes y necesarias:
1) Acceder a elementos específicos de un array.
2) Modificar cada uno de sus elementos un array e imprimirlos.
3) Agregar elementos a un array.
4) Extraer elementos de un array.
5) Comparar elementos de un array con los elementos de otro.

El tech leader del equipo necesita conocer la estructura de datos del nuevo proyecto. Para esto,
deberemos:
1. Crear un archivo arrays.js que contenga el código:
let films = ["star wars", "totoro", "rocky", "pulp fiction", "la vida es bella"]

2. En el mismo archivo nos piden que los nombres de las películas estén en MAYÚSCULAS
usando .toUpperCase() para cada elemento. Asegurarnos que entregamos el array con
todas las películas en mayúsculas. Hacerlo con una función que recibe el array films por
parámetro.

3. Mientras trabajabamos en el ejercicio 2, se descubrió que en el código también existe
otro array, pero con películas animadas.

let cartoons = ["toy story", "finding Nemo", "kung-fu panda", "wally",
"fortnite"]

En el mismo archivo pegar ese código y crear una función que agregue cada cartoon del
array cartoons al array films. No quieren un nuevo array, deben agregarse al array films.
4. Uno de los desarrolladores advirtió que la última animación es en realidad un
videojuego. Eliminar ese último elemento del array cartoons antes de pasarlos a films.
5. Finalmente, nos envían dos arrays con las calificaciones que hacen distintos usuarios
del mundo de estas películas de la siguiente forma:
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9];

Nos piden crear una función que compare las calificaciones y nos diga si son iguales o
diferentes. Nos confirman que están en el orden adecuado y que solo traen valores numéricos
del 1 al 10.
Para verificar que hasta acá viene todo bien, recomendamos probar cada una de las funciones y
testear su correcto funcionamiento

