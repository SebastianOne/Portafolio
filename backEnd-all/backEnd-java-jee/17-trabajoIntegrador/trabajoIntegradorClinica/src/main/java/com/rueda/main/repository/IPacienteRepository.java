package com.rueda.main.repository;

import com.rueda.main.entity.Odontologo;
import com.rueda.main.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
    @Query("select u from Paciente u where u.email = ?1")
    Optional<Paciente> findByEmail(String email);
}
