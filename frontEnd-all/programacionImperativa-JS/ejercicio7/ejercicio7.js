const puntajes = [12, 34, 56, 34, 5, 8, 76, 4, 1, 90];
for (let index = 0; index < puntajes.length; index++) {
console.log(puntajes[index]);
}

let imprimirElementos = puntajes.forEach(element => console.log(element));

/*-------------------------------*/
const preciosSinIva = [1200, 340, 560, 30400, 500, 80, 1000, 90000];
const iva = 1.21;
for (let i = 0; i < preciosSinIva.length; i++) {
console.log(preciosSinIva[i] * iva);
}

let imprimirElementos2 = preciosSinIva.forEach(element => console.log(element*iva));

/* no hay nada que hacer en esta ejercitacion*/