let parImpar = numero => numero % 2 === 0 ? "el numero es par":"el numero es impar";
let barrera = pago => pago ? "la barrera se leventa porque pago":"la barrera no se levante porque no pago";
let numeroRecibido = numero => numero === Math.floor(Math.random()*11)? "el numero es igual al random":"el numero es diferente al random";
let fechaNavideña = fecha => {
    let arreglo = fecha.split('/');
    let respuesta =  arreglo[2]=== 12?  "la fecha dada esta en navidad" : "la fecha dada no esta en navidad";
    return respuesta
}

let diasDelMes = mes => {
    switch(mes){
        case "abril":
        case "junio":
        case "septiembre":
        case "noviembre":    
            return "tienen 30 días"
        break;

        case "enero":
        case "marzo":
        case "mayo":
        case "julio":
        case "agosto":
        case "octubre":
        case "diciembre":
            return "tienen 31 días"
        break;

        case "febrero":
            return "tiene 28 días"
        break;

       default:
           return "no existe ese mes"           
        break;

    }
   
}

function notaAlumno(nota){
    let respuesta;
    if (nota < 4 ){
        respuesta = "el alumno recursa la materia";
        return respuesta;
    }
    else if(nota >= 4 && nota < 7){
        respuesta = "el alumno va a recuperatorio"
        return respuesta;
    }else{
        respuesta = "el alumno aprobo la materia";
        return respuesta;
    }
}

let paracaidas = (altura,velocidad) => altura >= 2000 && altura<=3000 && velocidad < 1000? "ya puede abrir el paracaidas":"no puede abrir el paracaidas";

let precio = (tomate,papa,huevo)=>{
    let precioTotal = 150;
    if(tomate === true && papa === true && huevo === true){
        precioTotal = 150+20+50+60;
        return precioTotal
    }else if(tomate === false && papa === true && huevo === false)
    {
        precioTotal = 150+50;
        return precioTotal
    }
    else if(tomate === true  && papa === true && huevo === false)
    {
        precioTotal = 150+20+50;
        return precioTotal
    }
    else if(tomate === false && papa ===  true && huevo === true)
    {
        precioTotal = 150+50+60;
        return precioTotal
    }
    else if(tomate === true && papa === false && huevo ===true)
    {
        precioTotal = 150+20+60;
        return precioTotal
    }
    else if(tomate === true  && papa === false && huevo === false)
    {
        precioTotal = 150+20;
        return precioTotal
    }
    else if(tomate === false && papa === false && huevo === true)
    {
        precioTotal = 150+60;
        return precioTotal
    }
    else if(tomate ===  false && papa === false && huevo === false)
    {
        precioTotal = 150;
        return precioTotal
    }
}
console.log(precio(true, false, true))
