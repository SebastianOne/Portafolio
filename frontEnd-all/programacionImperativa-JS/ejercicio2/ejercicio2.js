let suma= (num1, num2) => num1+num2;

let resta = (num1, num2) => num1-num2;

let multiplicar = (num1, num2) => num1*num2;

let dividir = (dividendo, divisor) => {
    if(divisor === 0 ){
        console.log("no se puede dividir por 0");
    }
    else{
        return dividendo/divisor;
    }
}

function calcularIndiceMAsaCorporal(peso,altura){
    if(altura === 0){
        console.log("la altura no puede ser 0");
    }
    else{
        return peso/(altura^2);

    }

}


/* funcion constructora jugador*/
function Jugador(nombre,goles,valor){
    this.nombre=nombre;
    this.goles=goles;
    this.valor=valor;
    this.hacerGol= function(){
        this.goles++;
        console.log("GOL!!!!!!!");
        this.valor += 10000;
    } ;
    this.hattrick = function(){
        for(let i =0; i < 3 ; i++){
            this.hacerGol();
        }
        porcentajeJugador = this.valor * 0.1;
        this.valor += porcentajeJugador;
    }

}

jugador1 = new Jugador("Sebastian", 4, 50000);
jugador2 = new Jugador("Juan", 2, 30000);
jugador3 = new Jugador("SRonaldo", 1, 5000);


jugador1.hattrick();
console.log(jugador1.valor);