package modelo;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BuscadorFacade buscador = new BuscadorFacade();
        buscador.busqueda("Madrid",new Date(2021,7,10),new Date(2021,7,10));
    }
}
