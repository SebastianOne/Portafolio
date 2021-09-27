package com.rueda.main.service;

import com.rueda.main.entity.Paciente;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;

import java.util.List;
import java.util.Optional;

public interface IPacienteService {

    public abstract List<Paciente> readALl();
    public abstract Optional<Paciente> readOne(Long id) throws ResourceNotFoundException;
    public abstract Paciente insert(Paciente paciente) throws IncompleteDataException;
    public abstract Boolean delete(Long id) throws ResourceNotFoundException;
    public abstract Boolean update(Paciente paciente) throws IncompleteDataException, ResourceNotFoundException;
}
