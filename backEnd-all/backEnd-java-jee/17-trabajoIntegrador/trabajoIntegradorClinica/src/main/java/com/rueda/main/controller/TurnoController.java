package com.rueda.main.controller;


import com.rueda.main.entity.Turno;
import com.rueda.main.exceptions.IncompleteDataException;
import com.rueda.main.exceptions.ResourceNotFoundException;
import com.rueda.main.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/turno")
public class TurnoController {

    @Autowired
    @Qualifier("TurnoService")
    private ITurnoService turnoService;

    @GetMapping("/")
    public ResponseEntity<List<Turno>> readALl(){
        return new ResponseEntity<>(turnoService.readAll(), HttpStatus.OK);
    };

    @PostMapping("/")
    public  ResponseEntity<Turno> insert(@RequestBody Turno turno) throws IncompleteDataException {
        return new ResponseEntity<>(turnoService.insert(turno),HttpStatus.OK);
    };

    @DeleteMapping("/{id}")
    public  ResponseEntity<Boolean> delete(@PathVariable("id") Long id) throws ResourceNotFoundException {
        return new ResponseEntity<>(turnoService.delete(id),HttpStatus.OK);
    };

    @PutMapping("/")
    public  ResponseEntity<Boolean> update(@RequestBody Turno turno) throws IncompleteDataException, ResourceNotFoundException {
        return new ResponseEntity<>(turnoService.update(turno),HttpStatus.OK);
    };
















}
