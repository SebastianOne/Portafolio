package modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuInfantil extends Menu {

    private String regaloSorpresa;
    private Double costoRegalo;


    public MenuInfantil(String regaloSorpresa, Double costoRegalo) {
        super(5000.0, new ArrayList<>(Arrays.asList("jamon","queso","pan","arroz","cerdo","pollo")));
        this.regaloSorpresa = regaloSorpresa;
        this.costoRegalo = costoRegalo;
    }

    @Override
    public Double calcularCosto() {
        return getPrecioBase() + costoRegalo;
    }

    @Override
    public void informarAdicional() {
        System.out.println("el menu infaltil tienen como adicional el reglao sorpresa que es: " + regaloSorpresa);
    }
}
