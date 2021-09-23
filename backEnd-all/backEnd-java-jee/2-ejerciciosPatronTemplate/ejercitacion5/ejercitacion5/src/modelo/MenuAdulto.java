package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuAdulto extends Menu{


    public MenuAdulto() {
        super(5000.0, new ArrayList<>(Arrays.asList("jamon","queso","pan","arroz","cerdo","pollo")));
    }

    @Override
    public Double calcularCosto() {
        return getPrecioBase();
    }

    @Override
    public void informarAdicional() {
        System.out.println(" el menu adulto no tiene adicionales");
    }
}
