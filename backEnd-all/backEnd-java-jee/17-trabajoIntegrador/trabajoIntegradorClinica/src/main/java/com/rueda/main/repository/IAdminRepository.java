package com.rueda.main.repository;

import com.rueda.main.entity.Administrador;
import com.rueda.main.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IAdminRepository extends JpaRepository<Administrador, Long> {
    @Query("select u from Administrador u where u.Email = ?1")
    Optional<Administrador> findByEmail(String email);
}
