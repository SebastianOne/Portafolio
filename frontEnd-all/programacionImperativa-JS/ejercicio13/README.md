enunciado:
Crear un archivo clases.json que contenga un array de objetos literales con
formato JSON. Cada objeto literal deberá tener las propiedades: título y
estado. En donde la primera podrá ser cualquier cadena de texto, por ejemplo,
“Introduccion a la Programacion” y la segunda, “terminada”, “repasar”,
“pendiente”.
XtraPlus1: Agregar otra propiedad descripción.
2. Crear un archivo app.js que "consuma" el archivo de clases.json. Mostrar el
listado de clases existentes por consola. Para esto, ¿necesitamos usar el
módulo nativo “fs”? ¿o con sólo require("archivo.json") ya obtenemos el
array de objetos?.
XtraPlus2: Manejar el error si no encuentra el archivo (try catch).
3. Crear una función para filtrar las clases por su estado, asignándolas a
diferentes arrays de objetos literales y guardar todo esto ordenado por
estado, en un archivo.json.
XtraPlus3: Mediante una función arrow guardar cada array en un archivo diferente
según corresponda el estado. Por ejemplo: “repasar.json”, “terminadas.json”.
