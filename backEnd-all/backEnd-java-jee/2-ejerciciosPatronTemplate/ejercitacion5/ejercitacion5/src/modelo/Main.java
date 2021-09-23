package modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MenuAdulto menu1 = new MenuAdulto();
        MenuInfantil menu2 = new MenuInfantil("juguete", 2000.0);
        MenuVegetariano menu3 = new MenuVegetariano(new ArrayList<String>(Arrays.asList("paprica","canela","alpaca","curry")),1000.0);

        menu1.armarMenu();
        menu2.armarMenu();
        menu3.armarMenu();

    }

}
