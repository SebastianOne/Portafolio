// juan sebastian rueda rodriguez
package com.rueda.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Empresa implements Serializable{
    private Integer cuit;
    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(Integer cuit, String razonSocial) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }
}
