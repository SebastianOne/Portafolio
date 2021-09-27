package com.rueda.main.service;

import com.rueda.main.entity.Odontologo;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface IOdontologoService {

    public abstract List<Odontologo> readALl();
    public abstract Optional<Odontologo> readOne(Long id) throws ResourceNotFoundException;
    public abstract Odontologo insert(Odontologo odontologo) throws IncompleteDataException;
    public abstract Boolean delete(Long id) throws ResourceNotFoundException;
    public abstract Boolean update(Odontologo odontologo) throws IncompleteDataException, ResourceNotFoundException;
}
