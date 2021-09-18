/*juan sebastian rueda rodriguez*/
const fs = require('fs')
let bicicletas = JSON.parse(fs.readFileSync("./BICICLETAS.json","utf-8"));


let carrera = {
    bicicletas: bicicletas,

    bicisPorTanda: 6,

    bicicletasHabilitadas:function(){
       return this.bicicletas.filter(biciActual=> !biciActual.doppingPositivo);
    },

    listarBicicletas: arreglo => arreglo.forEach(elementoActual => console.table({id: elementoActual.id, rodado: elementoActual.rodado, pesoEnKg: elementoActual.pesoEnKg, descalificado: elementoActual.doppingPositivo?"descalificado":"habilitado"})),

    buscarPorCiclista: function(nombre){
        let resultado = this.bicicletas.filter(biciActual=> biciActual.ciclista === nombre);
        if(resultado.length === 0)
            return "no se encontro la bicicleta";
        else
             return resultado; 
 
     },
     buscarPorLargo: function(largo){
         return  this.bicicletasHabilitadas().filter(biciActual => biciActual.largoEnCm <= largo);
     },

     ordenarPorPeso: function(){
         return this.bicicletas.sort((a,b)=>a.pesoEnKg - b.pesoEnKg);
     }, 
    
     generarTanda: function(rodado, peso){

         let resultado = []
         let resultadoArreglo = this.bicicletasHabilitadas().filter(biciActual=> biciActual.rodado <= rodado && biciActual.pesoEnKg <= peso);

         if(resultadoArreglo.length > this.bicisPorTanda)
            return resultado = resultadoArreglo.slice(0, 6);
         else
            return resultadoArreglo;


     }, 

     calcularPodio:funcionTanda =>{
        let arregloOrdenado = funcionTanda.sort((a,b)=> a.puntaje - b.puntaje);
        let resultadoArreglo = arregloOrdenado.slice(3);

        console.log("El ganador es "+resultadoArreglo[2].ciclista +", con un puntaje de: "+resultadoArreglo[2].puntaje+" el segundo puesto es para: " +resultadoArreglo[1].ciclista +", con un puntaje de: "+resultadoArreglo[1].puntaje+" y el tercer puesto es para: "+resultadoArreglo[0].ciclista+" con un puntaje de: "+ resultadoArreglo[0].puntaje) ;
     }


}

//carrera.listarBicicletas(carrera.bicicletas)
//console.log(carrera.buscarPorCiclista("Heath Ranscome"));
//console.log(carrera.buscarPorLargo(100));
//console.log(carrera.ordenarPorPeso());
//console.log(carrera.generarTanda(70,10));
carrera.calcularPodio(carrera.generarTanda(70,10));
