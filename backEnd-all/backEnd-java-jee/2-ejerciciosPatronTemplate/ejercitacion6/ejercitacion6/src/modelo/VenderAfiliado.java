package modelo;

import java.util.Date;

public class VenderAfiliado extends Vendedor{


    public VenderAfiliado(String fechaIngreso,  String nombre) {
        super(fechaIngreso, nombre);
    }

    @Override
    public void vender() {
        System.out.println("realizo venta");
        setVentas(getVentas()+1);

    }

    @Override
    public void calculoDePuntos() {
        setPuntosTotales(getPuntosTotales() + (getVentas()*15));

    }
}
