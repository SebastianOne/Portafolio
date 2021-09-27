package com.rueda.main.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="paciente")
@NoArgsConstructor
public class Paciente {

    @Id
    @Column(name="id_paciente")
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

    @Column(name = "dni", length =50 )
    @Getter
    @Setter
    private String dni;

    @Column(name = "fecha_alta")
    @Getter
    @Setter
    private Timestamp fecha_alta;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name ="id_domicilio", referencedColumnName = "id_domicilio")
    @Getter
    @Setter
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "paciente")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler","paciente"})
    @Getter
    private Set<Turno> turnos = new HashSet<>();

}
