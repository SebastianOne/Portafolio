package com.rueda.modelo;
// juan sebastian rueda rodriguez
import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private String apellido;
    private String legajo;
    private Double sueldo;

    public Empleado (String nombre, String apellido, String legajo, Double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public String getLegajo() {
        return legajo;
    }



    public Double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Empleado con nombre: " + nombre + ", apellido: " + apellido + ", legajo: " + legajo + ", sueldo: " + sueldo ;
    }
}
