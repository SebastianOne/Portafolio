let pulgadasAcentimetros = pulgada => pulgada * 2.54;
let conversionUrl = url => `http:/www.${url}.com`
let fraseAdmiracion = frase => `¡${frase}!`
let edadPerro = edad => edad*7;
let precioHora = sueldo => (sueldo/30)/8 ;
let circunferencia = radio => (radio*2)*Math.PI;
let esMAyuscula = palabra => {
    let arreglo = palabra.split('');
    let respuesta = true;
    for(let i = 0; i<arreglo.length; i++)
    {
        if(arreglo[i] != " ")
        {
            if(arreglo[i] != arreglo[i].toUpperCase() && arreglo[i] != " "){ 
                return respuesta = false;
            }
            else{
                respuesta = true;
            }
        }
    }
    return respuesta;
};

let tipoDAto = dato => typeof dato;
