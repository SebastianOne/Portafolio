package com.rueda.main.service;

import com.rueda.main.entity.Mascota;
import com.rueda.main.repository.IMascotaRepository;

import java.util.List;
import java.util.Optional;

public interface IMascotaService<T>{

    public List<T> readAll();
    public Optional<T> readOne(Long id);
    public T insert(T object);
    public Boolean delete(Long id);
    public Boolean update(T object);
}
