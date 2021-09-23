package modelo;

import java.util.Date;

public class VendedorPasante extends Vendedor{

    public VendedorPasante(String fechaIngreso, String nombre) {
        super(fechaIngreso, nombre);
    }

    @Override
    public void vender() {
        System.out.println("realizo venta");
        setVentas(getVentas()+1);

    }

    @Override
    public void calculoDePuntos() {
        setPuntosTotales(getPuntosTotales() + (getVentas()*5));

    }

    @Override
    public void recategorizar() {
        if(getPuntosTotales() < 50)
            setCategoria( "Pasante Novato");
        else if(getPuntosTotales() >= 50)
            setCategoria( "Pasante Experimentado");

    }
}
