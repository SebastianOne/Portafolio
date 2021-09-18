const fs = require("fs");
let arregloObtenido = fs.readFileSync("./departamentos.json","utf-8");
let departamentos = JSON.parse(arregloObtenido);
 

let inmobiliaria = {

    departamentos: departamentos,
    departamentosDisponibles: function(){return this.departamentos.filter(departamentoActual => departamentoActual.disponible)},
    listarDepartamentos: array => array.forEach(elemento =>  console.table({id: elemento.id, precio: elemento.precioAlquiler,diponibilidad: elemento.disponible?"Disponible":"Alquilado"})),
    buscarPorId: function(id_buscado){ 
        let resultado = this.departamentos.find(elemento => elemento.id === id_buscado);
        if(resultado != null){
            return resultado
        }else{
            return "no se encontro ningun departamento con ese id"
        }
    },
    buscarPorPrecio: function(precio_filtro){ return  this.departamentosDisponibles().filter(elemento => elemento.precioAlquiler <= precio_filtro )},
    ordenarPorPrecio: function(){ return this.departamentos.sort((a,b)=> a.precioAlquiler - b.precioAlquiler)},
    precioConImpuesto:function(porcentaje,array){
        let array2= []
        array.forEach(elemento => array2.push(deepCopy(elemento)))
        array2.forEach(elemento=>elemento.precioAlquiler = elemento.precioAlquiler*((porcentaje/100)+1))
        return array2;
    },

    alquilar: function(id){ 
         this.departamentos.forEach(elemento=> {
             if(elemento.id === id)
                elemento.disponible = false;
         })
    }, 

    calcularIngreso: function(){
        let alquilados = this.departamentos.filter(elemento => elemento.disponible === false);
        let respuesta = alquilados.reduce((acumulador,elemento, index)=>{
            if(index === 1){
                index++;
                return acumulador.precioAlquiler + elemento.precioAlquiler;  
            }
            else{
                index++;
                return acumulador + elemento.precioAlquiler
                
            }
        })
        return respuesta;
    },

    comentar: function(idDepartamento,comentario,puntuacion){
        let departamento = this.buscarPorId(idDepartamento);
        let objetoComentario = {
            comentario: comentario,
            puntuacion: puntuacion
        }
        if(typeof departamento === 'object'){
            if(puntuacion >=1 && puntuacion <=5){
                departamento.comentarios.push(objetoComentario);
                return "Comentario realizado con éxito";
            }
            else{
                return "la puntuacion debe estar en el rango de 1-5";
            }
            
        }
        else{
            return departamento;
        }
    },

    preferenciasCliente: function(num_habitaciones, mascotas,num_personas,precioAlquiler){
        return  this.departamentosDisponibles().filter(elemento => elemento.cantidadHabitacion === num_habitaciones && elemento.aceptaMascotas === mascotas && elemento.cantidadPersonas === num_personas && elemento.precioAlquiler === precioAlquiler)

    }

    
     
};


function deepCopy(objeto){
    let claves = Object.keys(objeto);
    let nuevoObjeto = {};
    for(let i = 0; i< claves.length;i++){
        let clave = claves[i]
        if(typeof objeto[clave]=== 'object'){
            nuevoObjeto[clave]= deepCopy(objeto[clave])
        }else{
            nuevoObjeto[clave]=objeto[clave]
        }
    }
    return nuevoObjeto;
}



