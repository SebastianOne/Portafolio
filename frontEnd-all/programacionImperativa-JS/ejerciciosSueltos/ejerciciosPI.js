
/* codigo principal

let arrayFrase = [
	"No",
	"he",
	"fracasado,",
	"simplemente",
	"me",
	"he",
	"topado",
	"con",
	"diez",
	"mil",
	"soluciones",
	"equivocadas"
  ];
  
  let fraseNueva = "";
  */

  /* forma uno de hacerlo
  for(let i = 0; i<arrayFrase.length;i++)
  {
	 fraseNueva += arrayFrase[i] + " ";
  }*/

  /* forma dos de hacerlo
  fraseNueva = arrayFrase.join(" ");
  console.log(fraseNueva);
  */
 //------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
 let estudiantes = [
	{
	  nombre: 'Alvaro',
	  promedio : 9,
	  curso : 'Android',
	},
	{
	  nombre: 'Daniel',
	  promedio : 6,
	  curso : 'Full Stack',
	},
	{
	  nombre: 'Alexis',
	  promedio : 3,
	  curso : 'iOS',
	},
  ]
*/

  /* forma uno de hacerlo
  let estudiante1 = {
	nombre: "Juan",
	promedio: 5,
	cuso: "iOS"
  }
  
  let estudiante2 = {
	nombre: "Miguel",
	promedio: 2,
	cuso: "Android"
  }
  estudiantes.push(estudiante1, estudiante2);
  */
  

  
  /* 
  forma tres de hacerlo 
	estudiantes.push({nombre: "Juan", promedio: 5, cuso: "iOS"}, {nombre: "Miguel", promedio: 2, cuso: "Android"});
	
  */ 

  /*
	estudiantes.push({nombre: 'Juan', promedio : 5, curso : 'iOS'})
  
	estudiantes.push({nombre: 'Miguel', promedio : 2, curso:'Android'})
*/

//------------------------------------------------------------------------------------------------------------------------------------------------------------------

/*

let frutas = ["banano", "manzana","pera"]
let frutas2 = ["banano", "manzana","pera"]


function contiene(array, elemento){
	if(array.indexOf(elemento) === -1){
		return false;
	}else{
		return true;
	}
}

console.log(contiene(frutas, "perra"));

function trasladarUltimo(arrayUno,arrayDos)
{
	if(arrayUno.length > 0 && arrayDos.length > 0 ){
		let ultimo = arrayUno.pop();
	    arrayDos.push(ultimo);
	    console.log("se puedo hacer");
	}         
	else{
		console.log("no se puedo hacer")
	}

}


trasladarUltimo(frutas2, frutas);
*/ 

/*   usao del while y el do-while
function encontreUn5(numeros){
    let validacion = 0;
    do
    {
        for(let i = 0; i <numeros.length;i++)
        {
            if( numeros[i] === 5 )
            {
                validacion = true;
                console.log("se encontró un 5!");
                break;
            }
        }
    }
	while(validacion === numeros.length);

    
}

function encontreUn5Dos(numeros){
    let validacion = 0;
    do
    {
        if( numeros[validacion] === 5 )
            {
                validacion = numeros.length;
                console.log("se encontró un 5!");
                break;
            }
			else{
				validacion++;
			}
    }
	while(validacion < numeros.length);

    
}
encontreUn5Dos([1,2,3,4,5]);

function tablaDeMultiplicar(numero) {
	//Escribí tu código aquí  
   let validacion = false;
   while(validacion === false){
	   for(let i = 1; i <= 10; i++){
		   console.log(numero + " * "+ i + " = " + numero*i);
	   }
	   validacion = true;
   }
}

function tablaDeMultiplicar2(numero) {
	let i = 0;
	while(i < 11){
		console.log(numero + " * "+ i + " = " + numero*i);
		i++;
	}
}

tablaDeMultiplicar(5);
tablaDeMultiplicar2(5);


*/
/*
const o = {
	firstName: "juan",
	b: "b",
	obj: {
		key: "key",
	},
}

const o2 = Object.assign({},o);
o2.obj.key = "new value";
console.log(o.obj.key);
*/
/*
const a = [23, 45, 32];
const b = [12, 67, 7];


function encontrarGanador(a, b) {
	let puntosPrimerParticipante = 0;
	let puntosSegundoParticipante = 0;
	for(let i = 0; i < a.length ; i++)
	{
		if (a[i] > b[i]) {
			puntosPrimerParticipante += 1;
			} else if (a[i] < b[i]) 
			{
				puntosSegundoParticipante += 1;
			}
	}
*/
	// comparación final
	/*
	if (puntosPrimerParticipante > puntosSegundoParticipante) {
		return "primer";
		} else {
			return "segundo";
			}
}
	console.log("El ganador es: " + encontrarGanador(a, b) + " participante");
	*/
