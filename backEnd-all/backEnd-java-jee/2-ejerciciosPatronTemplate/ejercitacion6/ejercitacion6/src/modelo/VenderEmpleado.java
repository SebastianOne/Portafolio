package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VenderEmpleado extends Vendedor{
    private List<VenderAfiliado> vendedores;

    public VenderEmpleado(String fechaIngreso,   String nombre) {
        super(fechaIngreso, nombre);
        vendedores = new ArrayList<>();
    }



    public void conseguiAfiliado(VenderAfiliado afiliado){
        vendedores.add(afiliado);
        setPuntosTotales(getPuntosTotales() + 10);
    }

    @Override
    public void vender() {
        System.out.println("realizo venta");
        setVentas(getVentas()+1);
    }

    @Override
    public void calculoDePuntos() {

        int years = Math.abs(getFechaIngreso().getYear() - LocalDate.now().getYear());
        setPuntosTotales(getPuntosTotales() + (years*5) +  + (5*getVentas()));
    }
}
