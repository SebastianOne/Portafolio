let films = ["star wars", "totoro","rocky","pulp fiction","la vida es bella"]
console.log(films[1])

let filmsMayuscula = films.map(elemento => elemento.toUpperCase());

let cartoons = ["toy story", "finding Nemo", "kung-fu panda", "wally",
"fortnite"]

cartoons.pop();

let cartoonsMaysucula = cartoons.map(elemento => elemento.toUpperCase())

function agregarCartoon(nuevoCartoon){
    cartoons.push(nuevoCartoon);
}


function unirArrays(){
    for(let i = 0; i<cartoonsMaysucula.length;i++){
        filmsMayuscula.push(cartoonsMaysucula[i]);
    }
}

unirArrays()
console.log(filmsMayuscula)


const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9];

const asiaScores2 = [8, 10, 6, 9, 10, 6, 6, 8];
const asiaScores3 = [8, 10, 6, 9, 10, 6, 6,8];

function compararArrays(){
    if(asiaScores.toString() === euroScores.toString()){
        console.log("las calificaciones son iguales")
    }
    else{
        console.log("las calificaciones no son iguales")
    }
}
function compararArrays2()
{
    for(let i =0;i < asiaScores.length;i++){
        if(asiaScores[i] != euroScores[i])
        {
            console.log("las notas no son iguales")
            console.log(i)
            break;
        }
    }

    console.log("las notas son iguales")

}

function compararArrays3 (array1,array2){
    let diferente = 0;
    if(array1.length != array2.length){
        console.log("los arrays no son del mismo tamaño, por lo tanto no son iguales en tamaño y no se compara sus elememento")

    }
    else{

        for(let i = 0; i < array1.length; i++){
            for(let j =0; j<array2.length; j++){
                if( i === j){
                    if(array1[i] != array2[j]){
                       diferente++;
                    }
                }
    
            }       
        }
        if(diferente != 0){
             console.log("los arrays son diferentes")
        }
        else{
            console.log("los arrays son iguales")
    
        }

    }
    
}

