const fs = require("fs");


let grupoEstadoTerminado = []
let grupoEstadoRepasar = []
let grupoEstadoPendiente = []

let clases = () => {  
    try{
        let clases = fs.readFileSync("./clases.json", {encoding: 'utf-8'});
        let objetos = JSON.parse(clases);
        return objetos;
 
    }catch{
        return null; 
    }
}

/* nota siempre que vallamos a escribir objetos es mejor usar el writeFileSync ya que si usamos el append este no lo metera dentro del arreglo sino lo escribe justo al final de lo que tengamos en el archivo, es por eso que es mejor volver a sobreescribir todo con lo que tenemos actualizado*/
function guardarObjetos(){
    if(clases() != null){
        grupoEstadoTerminado = clases().filter(objetoActual => objetoActual.estado === "terminada");
        let objetoJson1 = JSON.stringify(grupoEstadoTerminado);
        fs.writeFileSync("terminada.json",objetoJson1);
               
        grupoEstadoRepasar = clases().filter(objetoActual =>  objetoActual.estado === "repasar");
        let objetoJson2 = JSON.stringify(grupoEstadoRepasar);
        fs.writeFileSync("repasar.json",objetoJson2);
               
        grupoEstadoPendiente = clases().filter(objetoActual =>objetoActual.estado === "pendiente");
        let objetoJson3 = JSON.stringify(grupoEstadoPendiente);
        fs.writeFileSync("pendiente.json",objetoJson3);



        console.log(grupoEstadoTerminado);
        console.log(grupoEstadoRepasar);
        console.log(grupoEstadoPendiente);
    }
    else{
        console.log("el archivo JSON no se encontro")
    }
}



guardarObjetos();
