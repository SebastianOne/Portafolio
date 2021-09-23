package com.rueda.main.repository;

import com.rueda.main.entity.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJugadorRepository extends JpaRepository<Jugador, Long> {
}
