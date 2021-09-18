desafio 1:
Dado el siguiente código de lectura de archivos con FileSystem, necesitamos poder pasar la
sintaxis a la de promesas y que podamos ver por consola los archivos correctamente.
const fs = require('fs');
// forma convencional
fs.readFile('file.json', (err, data) => {
if (err) {
console.log(err)
} else {
console.log(JSON.parse(data));
}
});

desafio2:
Ahora tenemos un código con callbacks anidados y necesitamos ejecutarlos todos al
mismo tiempo —con las funciones callbacks no lo podríamos hacer — . Necesitamos utilizar
el método de promesas Promise.all() para poder transcribir nuestros callbacks anidados a
promesas y obtener por consola los 3 archivos leídos e impresos por las misma.



const fs = require('fs');
// convencional
function lectorDeArchivosMultiple(){
return fs.readFile('file.json', (err, data1) => {
fs.readFile('file2.json', (err, data2) => {
fs.readFile('file3.json', (err, data3) => {
console.log(JSON.parse(data1));
console.log(JSON.parse(data2));
console.log(JSON.parse(data3));
});
});
});
}
lectorDeArchivosMultiple()

desafio3:
Dado el siguiente código, debemos pegar, en un archivo, ese código entregado, exportar la
función promesa e importarla en otro archivo diferente. Lo que necesitamos es poder leer el
archivo file.json luego de los segundos especificados en la función.

function promesa() {
return new Promise(function(resolve, reject) {
console.log("leyendo...");
setTimeout(resolve, 3000);
})
}
