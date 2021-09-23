package modelo;

import java.util.List;

public abstract class Menu {

    private Double precioBase;
    private List<String> menu;

    public Menu(Double precioBase, List<String> menu) {
        this.precioBase = precioBase;
        this.menu = menu;
    }

    public void armarMenu(){
        System.out.println("se esta armando el Menu correspondiente");
        informarAdicional();
        System.out.println("el costo total del menu es: " + calcularCosto());
        System.out.println();

    }

    public abstract Double calcularCosto();
    public abstract void informarAdicional();

    public Double getPrecioBase() {
        return precioBase;
    }
}
