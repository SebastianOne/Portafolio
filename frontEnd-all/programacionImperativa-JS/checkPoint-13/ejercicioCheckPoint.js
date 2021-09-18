/*
let auto1 = new Auto("Ford", "Fiesta","Azul",2019,200,150000,12,"APL123",false);
let auto2 = new Auto("Toyota", "Corrolla","Blanco",2019, 0, 100000,14,"JJK116", false);
let autos= [
    {
        marca: "Ford",
        modelo:"Fiesta",
        precio: 150000,
        km: 200,
        color: "Azul",
        cuotas: 12,
        anio: 2019,
        patente:"APL123",
        vendido:false


    },
    {
        marca: "Toyota",
        modelo:"Corrolla",
        precio: 100000,
        km: 0,
        color: "Blanco",
        cuotas: 14,
        anio: 2019,
        patente:"JJK116",
        vendido:false
    }
];
    
    
let autos= require('./autos')
let concesionaria = {
   autos: autos,
 
   buscarAuto: function(patente)
   {
       let encontrado = null;
       for(let i = 0; i < this.autos.length; i++){
           if(patente === this.autos[i].patente)
           {
               encontrado = this.autos[i];
           }
       }
        return encontrado;
   },

   venderAuto: function(patente)
      {
             let encontrado = this.buscarAuto(patente);
             if(encontrado != null){
                encontrado.vendido = true;  
             }

   },
    
  autosParaLaVenta: function(){
    let autosVenta = [];
    for(let i =0; i< this.autos.length;i++){
        if(this.autos[i].vendido === false){
            autosVenta.push(this.autos[i]);
        }
    }
     return autosVenta;
},


autosNuevos: function(){
       let autosVenta =this.autosParaLaVenta();
       let autosKmNuevo = [];
       for(let i = 0; i<autosVenta.length; i++){
           if(autosVenta[i].km < 100){
               autosKmNuevo.push(autosVenta[i]);
           }

       }
       return autosKmNuevo;     
},


   listaDeVentas: function(){

    let listaVendidos = [];
       for(let i = 0; i < this.autos.length; i++){
           if(this.autos[i].vendido === true)
           {
               listaVendidos.push(this.autos[i].precio);
           }
       }
        return listaVendidos;
   },

  totalDeVentas: function(){
    let sumatoria=0;
    let listaPrecioVendidos = this.listaDeVentas();
    for(let i = 0; i<listaPrecioVendidos.length;i++){
        sumatoria += listaPrecioVendidos[i];

    }
    return sumatoria;
},
   
   puedeComprar:function(auto,persona){

    let costoCuota = auto.precio/ auto.cuotas;
    if(persona.capacidadDePagoTotal >= auto.precio  && persona.capacidadDePagoEnCuotas >= costoCuota){
        return true;

    }
    else{
        return false;
    }
   },

 autosQuePuedeComprar: function(persona){
    let autosVenta = this.autosParaLaVenta();
    let autosCompra = [];
    for(let i = 0; i<autosVenta.length;i++){
        if(this.puedeComprar(autosVenta[i], persona) === true){
            autosCompra.push(autosVenta[i]);
        }
    }
    return autosCompra;
}
   
}

*/
/* hacer totalVentas con reduce*/
/* autos nuevos filter */




/* todo lo que esta de aqui en adelante es el ejercicio anterior pero usando metodos de array, en vez usar el for
*/


    
    
let autos= require('./autos')
let concesionaria = {
   autos: autos,

   buscarAuto: function(patente)
   {
       let encontrado = this.autos.filter(auto =>{
           
       });


       for(let i = 0; i < this.autos.length; i++){
           if(patente === this.autos[i].patente)
           {
               encontrado = this.autos[i];
           }
       }
        return encontrado;
   },

   venderAuto: function(patente)
      {
             let encontrado = this.buscarAuto(patente);
             if(encontrado != null){
                encontrado.vendido = true;  
             }

   },
    
  autosParaLaVenta: function(){
    let autosVenta = [];
    for(let i =0; i< this.autos.length;i++){
        if(this.autos[i].vendido === false){
            autosVenta.push(this.autos[i]);
        }
    }
     return autosVenta;
},


autosNuevos: function(){
       let autosVenta =this.autosParaLaVenta();
       let autosKmNuevo = [];
       for(let i = 0; i<autosVenta.length; i++){
           if(autosVenta[i].km < 100){
               autosKmNuevo.push(autosVenta[i]);
           }

       }
       return autosKmNuevo;     
},


   listaDeVentas: function(){

    let listaVendidos = [];
       for(let i = 0; i < this.autos.length; i++){
           if(this.autos[i].vendido === true)
           {
               listaVendidos.push(this.autos[i].precio);
           }
       }
        return listaVendidos;
   },

  totalDeVentas: function(){
    let sumatoria=0;
    let listaPrecioVendidos = this.listaDeVentas();
    for(let i = 0; i<listaPrecioVendidos.length;i++){
        sumatoria += listaPrecioVendidos[i];

    }
    return sumatoria;
},
   
   puedeComprar:function(auto,persona){

    let costoCuota = auto.precio/ auto.cuotas;
    if(persona.capacidadDePagoTotal >= auto.precio  && persona.capacidadDePagoEnCuotas >= costoCuota){
        return true;

    }
    else{
        return false;
    }
   },

 autosQuePuedeComprar: function(persona){
    let autosVenta = this.autosParaLaVenta();
    let autosCompra = [];
    for(let i = 0; i<autosVenta.length;i++){
        if(this.puedeComprar(autosVenta[i], persona) === true){
            autosCompra.push(autosVenta[i]);
        }
    }
    return autosCompra;
}
   
}