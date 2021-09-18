package com.rueda.main.model;

public class Odontologo {
    private Integer id;
    private String apellido;
    private String nombre;
    private String matricula;

    public Odontologo(Integer id, String apellido, String nombre, String matricula) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public Integer getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }
}

