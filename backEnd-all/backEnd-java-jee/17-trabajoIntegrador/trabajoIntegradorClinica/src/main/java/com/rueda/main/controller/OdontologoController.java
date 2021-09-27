package com.rueda.main.controller;

import com.rueda.main.entity.Odontologo;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;
import com.rueda.main.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    @Qualifier("OdontologoService")
    private IOdontologoService odontologoService;

    @GetMapping("/")
    public ResponseEntity<List<Odontologo>> readALl(){
        return new ResponseEntity<>(odontologoService.readALl(),HttpStatus.OK);
    };

    @GetMapping("/{id}")
    public  ResponseEntity<Odontologo> readOne(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return new ResponseEntity<>(odontologoService.readOne(id).get(),HttpStatus.OK);
    };
    @PostMapping("/")
    public  ResponseEntity<Odontologo> insert(@RequestBody Odontologo odontologo) throws IncompleteDataException {
        return new ResponseEntity<>(odontologoService.insert(odontologo),HttpStatus.OK);
    };

    @DeleteMapping("/{id}")
    public  ResponseEntity<Boolean> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return new ResponseEntity<>(odontologoService.delete(id),HttpStatus.OK);
    };

    @PutMapping("/")
    public  ResponseEntity<Boolean> update(Odontologo odontologo) throws IncompleteDataException {
        return new ResponseEntity<>(odontologoService.update(odontologo),HttpStatus.OK);
    };
}
