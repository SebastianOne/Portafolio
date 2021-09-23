package modelo;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        VenderEmpleado venderEmpleado = new VenderEmpleado("2020-01-12", "pepe");
        VenderAfiliado venderAfiliado = new VenderAfiliado("2020-01-12","juan");
        VenderAfiliado venderAfiliado2 = new VenderAfiliado("2020-01-12","juan");
        VenderAfiliado venderAfiliado3 = new VenderAfiliado("2020-01-12","juan");
        venderEmpleado.conseguiAfiliado(venderAfiliado);
        venderEmpleado.conseguiAfiliado(venderAfiliado2);
        venderEmpleado.conseguiAfiliado(venderAfiliado3);
        venderEmpleado.vender();
        venderEmpleado.vender();
        venderEmpleado.mostrarCategoria();


        VendedorPasante pasante = new VendedorPasante(LocalDate.now().toString(), "juaquin");
        pasante.vender();
        pasante.vender();
        pasante.mostrarCategoria();


    }
}
