package com.rueda.main.repository;

import com.rueda.main.entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
}
