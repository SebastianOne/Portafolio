package com.rueda.main.service.impl;

import com.rueda.main.entity.Odontologo;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;
import com.rueda.main.repository.IOdontologoRepository;
import com.rueda.main.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("OdontologoService")
public class OdontologoService implements IOdontologoService {
    @Autowired
    private IOdontologoRepository odontologoRepository;

    @Override
    public List<Odontologo> readALl() {
        return odontologoRepository.findAll();
    }

    @Override
    public Optional<Odontologo> readOne(Long id) throws ResourceNotFoundException {
        Optional<Odontologo> respuesta = odontologoRepository.findById(id);
        if(!(respuesta.isPresent()))
            throw new ResourceNotFoundException("no existe el odontologo con id: " + id);
        return respuesta;
    }

    @Override
    public Odontologo insert(Odontologo odontologo) throws IncompleteDataException {
        if(odontologo.getNombre() == null || odontologo.getApellido() == null || odontologo.getMatricula() == null)
            throw new IncompleteDataException("falta por ingresar  datos obligatorios o debe corregir los datos proporcionados\ncomo datos obligatorios esta: nombre, apellido y la matricula");
        return odontologoRepository.save(odontologo);
    }

    @Override
    public Boolean delete(Long id) throws ResourceNotFoundException {
        if(readOne(id).isPresent())
            odontologoRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean update(Odontologo odontologo) throws IncompleteDataException, ResourceNotFoundException {
        if(odontologo.getId() == null || odontologo.getNombre() == null || odontologo.getApellido() == null || odontologo.getMatricula() == null)
            throw new IncompleteDataException("falta por ingresar  datos obligatorios o debe corregir los datos proporcionados\ncomo datos obligatorios esta: id, nombre, apellido y la matricula");
        else if(readOne(odontologo.getId()).isPresent())
            odontologoRepository.save(odontologo);
        return true;
    }
}
