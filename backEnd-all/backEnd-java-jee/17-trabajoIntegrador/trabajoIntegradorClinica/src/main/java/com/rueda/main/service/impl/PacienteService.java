package com.rueda.main.service.impl;

import com.rueda.main.entity.Domicilio;
import com.rueda.main.entity.Paciente;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;
import com.rueda.main.repository.IDomicilioRepository;
import com.rueda.main.repository.IPacienteRepository;
import com.rueda.main.service.IDomicilioService;
import com.rueda.main.service.IOdontologoService;
import com.rueda.main.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("PacienteService")
public class PacienteService implements IPacienteService {
    @Autowired
    private IPacienteRepository pacienteRepository;

    @Autowired
    private IDomicilioService domicilioService;

    @Override
    public List<Paciente> readALl() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> readOne(Long id) throws ResourceNotFoundException {
        Optional<Paciente> respuesta = pacienteRepository.findById(id);
        if(!(respuesta.isPresent()))
            throw new ResourceNotFoundException("no existe el paciente con id: " + id+", porque no existe");
        return respuesta;
    }

    @Override
    public Paciente insert(Paciente paciente)throws IncompleteDataException{
        System.out.println(paciente.getPassword()+ "soy el passwordddedddddddddddddddddddddddd");
        if(paciente.getNombre() == null || paciente.getApellido() == null || paciente.getFecha_alta() == null || paciente.getPassword() == null ||  paciente.getEmail() == null)
            throw new IncompleteDataException("falta por ingresar  datos obligatorios o debe corregir los datos proporcionados\ncomo datos obligatorios esta: nombre, apellido y fecha_alta ");
        domicilioService.insert(paciente.getDomicilio());
        return pacienteRepository.save(paciente);
    }

    @Override
    public Boolean delete(Long id) throws ResourceNotFoundException {
        if(readOne(id).isPresent())
           pacienteRepository.deleteById(id);
        return true;
    }

    @Override
    public Boolean update(Paciente paciente) throws IncompleteDataException, ResourceNotFoundException {
        if(paciente.getNombre() == null || paciente.getApellido() == null || paciente.getFecha_alta() == null || paciente.getId() == null)
            throw new IncompleteDataException("falta por ingresar  datos obligatorios o debe corregir los datos proporcionados \ncomo datos obligatorios esta: id, nombre, apellido y fecha_alta ");
        else if(readOne(paciente.getId()).isPresent())
            domicilioService.update(paciente.getDomicilio());
            pacienteRepository.save(paciente);
        return true;
    }
    /*
    *https://egghead.io/lessons/react-handle-multiple-state-values-when-using-usestate-react-hook
    * */
}
