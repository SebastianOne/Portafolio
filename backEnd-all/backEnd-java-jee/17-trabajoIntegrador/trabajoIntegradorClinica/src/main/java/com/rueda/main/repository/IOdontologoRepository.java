package com.rueda.main.repository;

import com.rueda.main.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Long> {
    @Query("select u from Odontologo u where u.Email = ?1")
    Optional<Odontologo> findByEmail(String email);
}
