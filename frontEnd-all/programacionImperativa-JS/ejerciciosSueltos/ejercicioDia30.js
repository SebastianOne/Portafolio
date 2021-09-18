
//ejercicio 1 al 4

let films = ["star wars", "totoro",  "rocky", "pulp fiction",  "la vida es bella"];
let cartoons = ["toy story", "finding Nemo", "kung-fu panda", "wally", "fortnite"]

/*
console.log(films[1]);
films[1].toUpperCase();
console.log(films[1]=films[1].toUpperCase());
console.log(films)
*/

function arrayValidacion(array){
	if(array[1] === "totoro"){
		console.log(array[1]);
		return true;

	}else{
		return false;
	}
}
console.log(arrayValidacion(films));

//forma uno de volver el array mayuscula
function arrayMayuscula(array)
{
	for(let i; i < array.length ; i++){
		array[i] = array[i].toUpperCase();
	}

}

//forma dos de volver array mayuscula
function arrayMayuscula()
{
   let nuevoArray = films.map(function(films) {  return films.toUpperCase()});
   films =  nuevoArray;
}

arrayMayuscula(films);
console.log(films);

//---------------------------------------------------
//forma tres de mayuscula

// unir array y convertir cartoons mayuscula
function arrayMayuscula2(array)
{
  let nuevoArray = array.map(function(array) {  return array.toUpperCase()});
  return  nuevoArray;

}
function unirArray()
{
	cartoons.pop();
	let cartoonsMayuscula = arrayMayuscula2(cartoons);
	films = films.concat(cartoonsMayuscula);
}

unirArray()
console.log(films);

// ejercicio 5 ----------------------------------------------------------

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 9, 10, 6, 7, 9];
//forma uno de hacer comparcion arreglos
function comparacionString(){

	if(asiaScores.toString() === euroScores.toString()){
		console.log("son iguales los dos arreglos");

	}
	else{
		console.log("son diferentes los arreglos --- comparacion1");

	}
}

comparacionString()
//forma dos de hacer comparcion arreglos
function comparacionString2()
{
   let validacion = 0;
   for(let i = 0; i < asiaScores.length; i++)
   {
	   for(let j = 0; j < euroScores.length;j++){
		if(i === j)
		{
			if(asiaScores[i] != euroScores[j]){
				validacion++;		
			}
		}

	   }
	   
   }

   if(validacion === 0)
	console.log("el arreglo es igual ----- comparacion2");
   else
	   console.log("el arreglo no es igual ------- comparacion2");
}

comparacionString2();