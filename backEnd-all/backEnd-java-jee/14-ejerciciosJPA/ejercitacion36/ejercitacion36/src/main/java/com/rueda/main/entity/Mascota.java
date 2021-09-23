package com.rueda.main.entity;
import javax.persistence.*;

@Entity
@Table(name = "Mascota")
public class Mascota {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private Integer edad;



    public Mascota() {
    }


    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }
}
