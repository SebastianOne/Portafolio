const fs = require('fs');
// forma convencional
/*
fs.readFile('file.json', (err, data) => {
if (err) {
console.log(err)
} else {
console.log(JSON.parse(data));
}
});
*/
/*
const promesa2 = async() => {
    try {
        let resultado = await new Promise((resolve, reject)=>fs.readFile('file.json', (error, data) => error? reject(error):resolve(JSON.parse(data))))
        console.log(resultado)
    } catch (error) {
        console.log(error)
    }
};

promesa2();

*/

let promesa1 = new Promise((resolve, reject)=>fs.readFile('file.json', (error, data) => error? reject(error):resolve(JSON.parse(data)))); 
let promesa2 = new Promise((resolve, reject)=>fs.readFile('file2.json', (error, data) => error? reject(error):resolve(JSON.parse(data))));
let promesa3 = new Promise((resolve, reject)=>fs.readFile('file3.json', (error, data) => error? reject(error):resolve(JSON.parse(data))));
/*
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
*/
/*
const promesa4 = async() => {
    try {
        let resultado = await Promise.all([promesa1,promesa2,promesa3])
        console.log(resultado)
    } catch (error) {
        console.log(error)
    }
};


promesa4();
console.log("hola como estan")
console.log("hola como estan")
console.log("hola como estan")
console.log("hola como estan")
console.log("hola como estan")
console.log("hola como estan")
console.log("hola como estan")
console.log("hola como estan")
*/

