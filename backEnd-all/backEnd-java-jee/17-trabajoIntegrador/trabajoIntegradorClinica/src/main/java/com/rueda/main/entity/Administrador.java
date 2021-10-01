package com.rueda.main.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "administrador")
@NoArgsConstructor
public class Administrador {

    @Id
    @Column(name="id_administrador")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;



    @Column(name = "email", length = 100, unique = true)
    @Getter
    private String Email;

    @Column(name = "password", length = 200)
    @Getter
    private String password;

}
