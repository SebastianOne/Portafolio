package com.rueda.main.controller;

import com.rueda.main.entity.Odontologo;
import com.rueda.main.entity.Paciente;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;
import com.rueda.main.service.IOdontologoService;
import com.rueda.main.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    @Qualifier("PacienteService")
    private IPacienteService pacienteService;

    @GetMapping("/")
    public ResponseEntity<List<Paciente>> readALl(){
        return new ResponseEntity<>(pacienteService.readALl(), HttpStatus.OK);
    };

    @GetMapping("/{id}")
    public  ResponseEntity<Paciente> readOne(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return new ResponseEntity<>(pacienteService.readOne(id).get(),HttpStatus.OK);
    };
    @PostMapping("/")
    public  ResponseEntity<Paciente> insert(@RequestBody Paciente paciente) throws IncompleteDataException {
        return new ResponseEntity<>(pacienteService.insert(paciente),HttpStatus.OK);
    };

    @DeleteMapping("/{id}")
    public  ResponseEntity<Boolean> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return new ResponseEntity<>(pacienteService.delete(id),HttpStatus.OK);
    };

    @PutMapping("/")
    public  ResponseEntity<Boolean> update(@RequestBody Paciente paciente) throws IncompleteDataException {
        return new ResponseEntity<>(pacienteService.update(paciente),HttpStatus.OK);
    };

}
