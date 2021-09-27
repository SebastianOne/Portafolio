package com.rueda.main.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "turno")
@NoArgsConstructor
public class Turno {

    @Id
    @Column(name = "id_turno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_paciente", referencedColumnName = "id_paciente")
    @JsonIgnoreProperties({"turnos"})
    @Getter
    private Paciente paciente;


    @Column(name = "fecha_hora_turno")
    @Getter
    @Setter
    private Timestamp fecha_turno;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_odontologo", referencedColumnName = "id_odontologo")
    @JsonIgnoreProperties({"turnos"})
    @Getter
    private Odontologo odontologo;

}
