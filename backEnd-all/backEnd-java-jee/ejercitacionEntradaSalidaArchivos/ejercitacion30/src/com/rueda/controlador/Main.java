// juan sebastian rueda rodriguez
package com.rueda.controlador;

import com.rueda.modelo.Empleado;
import com.rueda.modelo.Empresa;
import com.rueda.modelo.PersistenciaEmpleado;
import com.rueda.modelo.PersistenciaEmpresa;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("juan","perez","milegaja",345555D);
        Empleado empleado2 = new Empleado("juan","perez","milegaje",345555D);
        Empleado empleado3 = new Empleado("juan","perez","milegaji",345555D);
        Empleado empleado4 = new Empleado("juan","perez","milegajo",345555D);
        Empleado empleado5 = new Empleado("juan","perez","milegaju",345555D);

        Empresa empresa = new Empresa(154882, "miRazon");


        empresa.agregarEmpleado(empleado);
        empresa.agregarEmpleado(empleado2);
        empresa.agregarEmpleado(empleado3);
        empresa.agregarEmpleado(empleado4);
        empresa.agregarEmpleado(empleado5);

        PersistenciaEmpleado persistencia = new PersistenciaEmpleado();
        persistencia.guardar(empresa.getEmpleados());
        System.out.println("empleados leidos desde el archivo empresa");
        persistencia.leer().forEach(System.out::println);
        System.out.println("\n \n");


        PersistenciaEmpresa persistencia2 = new PersistenciaEmpresa();
        persistencia2.guardar(empresa);
        System.out.println("empleados leidos desde el archivo empleado");
        persistencia2.leer().getEmpleados().forEach(System.out::println);
        System.out.println("\n \n");

    }
}
