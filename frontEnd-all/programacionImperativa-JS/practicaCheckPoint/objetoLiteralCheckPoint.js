const modulo = require('./alumno');

function Curso(nombre,notaAprobacion, faltasMaximas, listaEstudiantes){
    this.nombre = nombre;
    this.notaAprobacion = notaAprobacion;
    this.faltasMaximas = faltasMaximas;
    this.listaEstudiantes = listaEstudiantes;
    this.agregarEstudiante = function(estudiante){
        this.listaEstudiantes.push(estudiante);
    }
    this.aprobacionEstudiantes = function(){
        let array = [];
        for(let i = 0; i<this.listaEstudiantes.length; i++)
        {
            if(this.listaEstudiantes[i].calcularPromedio() > this.notaAprobacion){
                array.push(true);
            }else{
                array.push(false);
            }           
    
        }

        return array;

    }
}

function aprobacionCurso(alumno){

    if(alumno.calcularPromedio() > curso.notaAprobacion)
    {
        if(alumno.cantidadDeFaltas < curso.faltasMaximas ){
            return true;
        }
        else if(alumno.cantidadDeFaltas === curso.faltasMaximas)
        {
           let nota = (curso.notaAprobacion*0.1) + curso.notaAprobacion;
           if(nota >= alumno.calcularPromedio)
           {
               return true;

           }
           else{
               return false;
           }

        }
       
    }
    else
    {
        return false;
    }
   
}


let curso = new Curso("matematicas",7,3,[modulo.alumno]);
curso.agregarEstudiante(new modulo.Alumno("sebastian",7,[7,9,10,8]));
console.log(curso.aprobacionEstudiantes());


