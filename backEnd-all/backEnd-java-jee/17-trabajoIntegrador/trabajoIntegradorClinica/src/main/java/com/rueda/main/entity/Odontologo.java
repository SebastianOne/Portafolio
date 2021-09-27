package com.rueda.main.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "odontologo")
@NoArgsConstructor
public class Odontologo {

    @Id
    @Column(name="id_odontologo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column(name = "apellido", length = 30)
    @Getter
    @Setter
    private String apellido;

    @Column(name = "nombre", length = 40 )
    @Getter
    @Setter
    private String nombre;

    @Column(name = "matricula", length = 40)
    @Getter
    @Setter
    private String matricula;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "odontologo")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler","odontologo"})
    @Getter
    private Set<Turno> turnos = new HashSet<>();
}
