package com.rueda.main.service;

import com.rueda.main.entity.Domicilio;
import com.rueda.main.entity.Turno;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface IDomicilioService {

    public abstract Optional<Domicilio> readOne(Long id) throws ResourceNotFoundException;
    public abstract Domicilio insert(Domicilio domiclio) throws IncompleteDataException;
    public abstract Boolean delete(Long id) throws ResourceNotFoundException;
    public abstract Boolean update(Domicilio domicilio) throws IncompleteDataException, ResourceNotFoundException;
}
