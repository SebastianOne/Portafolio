
function Alumno(nombre, cantidadDeFaltas, notas){

    this.nombre = nombre;
    this.cantidadDeFaltas = cantidadDeFaltas;
    this.notas = notas;
    this.calcularPromedio = function(){
        let promedio = 0;
        for(let i = 0; i<notas.length; i++){
            promedio += this.notas[i];   

        }

        return promedio/this.notas.length;

    },

    this.faltar = function(){
        this.cantidadDeFaltas++;
    }
}

let alumno = new Alumno('juan', 5, [1,5,7,8]);

module.exports = {alumno,Alumno};
