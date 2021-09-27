package com.rueda.main.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Domicilio")
@NoArgsConstructor
public class Domicilio {

    @Id
    @Column(name="id_domicilio")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Column(name="calle", length = 20)
    @Getter
    @Setter
    private String calle;

    @Column(name="numero")
    @Getter
    @Setter
    private Integer numero;

    @Column(name="localidad", length = 30)
    @Getter
    @Setter
    private String localidad;

    @Column(name="provincia", length = 30)
    @Getter
    @Setter
    private String provincia;



}
