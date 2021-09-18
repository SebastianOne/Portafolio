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

module.exports = autos;