package com.rueda.main.service;

import com.rueda.main.entity.Turno;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface ITurnoService{

    public abstract List<Turno> readAll();
    public abstract Optional<Turno> readOne(Long id) throws ResourceNotFoundException;
    public abstract Turno insert(Turno turno) throws IncompleteDataException;
    public abstract Boolean delete(Long id) throws ResourceNotFoundException;
    public abstract Boolean update(Turno turno) throws IncompleteDataException, ResourceNotFoundException;
}
