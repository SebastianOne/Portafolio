const a = [23, 45, 32];
const b = [12, 67, 7];
function encontrarGanador(a, b) {

    let contadorA = 0;
    let contadorB = 0; 

    for(let i = 0; i < a.length; i++){
        if(a[i]>b[i])
            contadorA++;
        else if(a[i]<b[i])
            contadorB++;
    }
    if(contadorA>contadorB)
        return "el ganador es el participante A"
    else if(contadorB>contadorA)
        return "el ganador es el participante B"
    else
        return "hay un empate entre los aprticipantes"


}

console.log(encontrarGanador(a,b));

