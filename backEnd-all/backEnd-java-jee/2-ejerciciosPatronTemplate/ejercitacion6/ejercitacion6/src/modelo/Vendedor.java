package modelo   ;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public abstract class  Vendedor {
    private String nombre;
    private LocalDate fechaIngreso;
    private String categoria;
    private int puntosTotales;
    private int ventas;

    public Vendedor(String fechaIngreso,  String nombre ) {
        this.fechaIngreso = LocalDate.parse(fechaIngreso, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.categoria = "novato";
        this.puntosTotales = 0;
        this.nombre = nombre;
        this.ventas = 0;
    }

    public void mostrarCategoria(){
        calculoDePuntos();
        recategorizar();
        System.out.println(toString());
        ventas = 0;

    }

    public abstract void vender();
    public abstract void calculoDePuntos();

    public void recategorizar(){
        if(puntosTotales < 20)
            categoria = "novato";
        else if(puntosTotales>= 20 && puntosTotales<= 30)
            categoria = "aprendices";

        else if(puntosTotales>= 31 && puntosTotales<= 40)
            categoria = "buenos";
        else
            categoria = "maestros";

    }

    @Override
    public String toString() {
        return "Vendedor: " + nombre + " tiene un total de puntos: " +  puntosTotales+ " y una categoria de: " + categoria;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
}
