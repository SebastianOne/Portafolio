package com.rueda.main.model;

public class Estudiante {
    private Integer id;
    private String nombre;
    private String apellido;
    private String profesor;
    private Double promedioNotas;

    public Estudiante(Integer id, String nombre, String apellido, String profesor, Double promedioNotas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesor = profesor;
        this.promedioNotas = promedioNotas;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getProfesor() {
        return profesor;
    }

    public Double getPromedioNotas() {
        return promedioNotas;
    }
}
