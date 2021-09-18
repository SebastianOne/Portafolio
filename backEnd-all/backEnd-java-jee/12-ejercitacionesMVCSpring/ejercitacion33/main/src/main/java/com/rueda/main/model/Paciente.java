package com.rueda.main.model;

public class Paciente {
    private Integer id;
    private String dni;
    private String apellido;
    private String nombre;
    private String email;
    private String fechaIngreso;
    private Domicilio domicilio;

    public Paciente(Integer id, String apellido, String nombre, String email, String fechaIngreso, Domicilio domicilio,String dni) {
        this.id = id;
        this.dni=dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilio;
    }

    public String getDni() {
        return dni;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
}
