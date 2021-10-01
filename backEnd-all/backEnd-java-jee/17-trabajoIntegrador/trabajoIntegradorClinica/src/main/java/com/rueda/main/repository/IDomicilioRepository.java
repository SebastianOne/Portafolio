package com.rueda.main.repository;

import com.rueda.main.entity.Domicilio;
import com.rueda.main.entity.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IDomicilioRepository extends JpaRepository<Domicilio, Long> {


}
