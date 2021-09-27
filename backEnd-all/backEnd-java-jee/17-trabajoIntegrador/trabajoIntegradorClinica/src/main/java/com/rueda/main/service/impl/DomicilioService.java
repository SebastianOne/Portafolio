package com.rueda.main.service.impl;

import com.rueda.main.entity.Domicilio;
import com.rueda.main.entity.Paciente;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;
import com.rueda.main.repository.IDomicilioRepository;
import com.rueda.main.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("DomiclioService")
public class DomicilioService implements IDomicilioService {

    @Autowired
    private IDomicilioRepository domicilioRepository;


    @Override
    public Optional<Domicilio> readOne(Long id) throws ResourceNotFoundException {
        Optional<Domicilio> respuesta = domicilioRepository.findById(id);
        if(!(respuesta.isPresent()))
            throw new ResourceNotFoundException("no existe el paciente con id: " + id+", porque no existe");
        return respuesta;
    }

    @Override
    public Domicilio insert(Domicilio domicilio) throws IncompleteDataException {
        if(domicilio.getCalle() == null || domicilio.getNumero() == null || domicilio.getLocalidad() == null || domicilio.getProvincia() == null)
            throw new IncompleteDataException("falta por ingresar  datos obligatorios o debe corregir los datos proporcionados \ncomo datos obligatorios esta: calle, el numero, la localidad y la provincia");
        return domicilioRepository.save(domicilio);
    }

    @Override
    public Boolean delete(Long id) throws ResourceNotFoundException {
        if(readOne(id).isPresent())
            domicilioRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean update(Domicilio domicilio) throws IncompleteDataException, ResourceNotFoundException {
        if(domicilio.getId() == null || domicilio.getCalle() == null || domicilio.getNumero() == null || domicilio.getLocalidad() == null || domicilio.getProvincia() == null)
            throw new IncompleteDataException("falta por ingresar  datos obligatorios o debe corregir los datos proporcionados\ncomo datos obligatorios esta: id, calle, el numero, la localidad y la provincia");
        else if(readOne(domicilio.getId()).isPresent())
            domicilioRepository.save(domicilio);
        return true;
    }
}
