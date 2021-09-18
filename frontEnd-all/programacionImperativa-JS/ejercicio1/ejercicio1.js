function Cliente(nombre,apellido,edad,peso,altura,prepagada){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
    this.peso=peso;
    this.altura=altura;
    this.prepagada=prepagada;
    this.calcularImc= function(){ return this.peso * this.altura^2};
}

function ImprimirMensage(){
    clientes.forEach(cliente => console.log(cliente.nombre + " " + cliente.apellido + "tiene " +    cliente.edad + " años y su índice de masa corporal es de " + cliente.calcularImc())
    );
}

cliente1 = new Cliente("Nicolas","Lopez",27,83.5,1.7,true);
cliente2 = new Cliente("Esteban","Piazza",28,80.1,1.76,true);
cliente3 = new Cliente("Jose","Fermoso",33,63.7,1.53,false);
cliente4 = new Cliente("Juana","Fernandez",26,55,1.62,true);
clientes = [cliente1,cliente2,cliente3,cliente4];
ImprimirMensage();