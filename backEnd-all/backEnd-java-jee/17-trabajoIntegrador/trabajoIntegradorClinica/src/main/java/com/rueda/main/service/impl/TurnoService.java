package com.rueda.main.service.impl;

import com.rueda.main.entity.Odontologo;
import com.rueda.main.entity.Turno;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;
import com.rueda.main.repository.ITurnoRepository;
import com.rueda.main.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("TurnoService")
public class TurnoService implements ITurnoService {

    @Autowired
    private ITurnoRepository turnoRepository;

    @Override
    public List<Turno> readAll() {
        return turnoRepository.findAll();
    }

    @Override
    public Optional<Turno> readOne(Long id) throws ResourceNotFoundException {
        Optional<Turno> respuesta = turnoRepository.findById(id);
        if(!(respuesta.isPresent()))
            throw new ResourceNotFoundException("no existe el turno con: " + id+"");
        return respuesta;
    }


    @Override
    public Turno insert(Turno turno) throws IncompleteDataException {
        if(turno.getOdontologo().getId() == null || turno.getFecha_turno() == null)
            throw new IncompleteDataException("falta por ingresar  datos obligatorios o debe corregir los datos proporcionados\ncomo datos obligatorios esta: id del paciente, id del odontologo y la fecha del turno");
        return turnoRepository.save(turno);
    }

    @Override
    public Boolean delete(Long id) throws ResourceNotFoundException {
        if(readOne(id).isPresent())
            turnoRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean update(Turno turno) throws IncompleteDataException, ResourceNotFoundException {
        if(turno.getId() == null ||turno.getOdontologo().getId() == null || turno.getOdontologo().getId() == null || turno.getFecha_turno() == null)
            throw new IncompleteDataException("falta por ingresar  datos obligatorios o debe corregir los datos proporcionados\ncomo datos obligatorios esta: como datos obligatorios esta: id del turno, id del paciente, id del odontologo y la fecha del turno");
        else if(readOne(turno.getId()).isPresent())
            turnoRepository.save(turno);
        return true;
    }
}
