package com.rueda.main.controller;

import com.rueda.main.dao.IDao;
import com.rueda.main.dao.impl.EstudianteDaoH2;
import com.rueda.main.dao.setting.ConfiguracionJdbc;
import com.rueda.main.model.Estudiante;
import com.rueda.main.service.EstudianteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    private EstudianteService  estudianteService = new EstudianteService(new EstudianteDaoH2(new ConfiguracionJdbc()));

    @GetMapping("/")
    public ResponseEntity<List> readAll() {
        List<Estudiante> respuesta = estudianteService.readAll();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> readOne(@PathVariable("id") Integer id) {
        Estudiante respuesta = estudianteService.readOne(id);
        if(respuesta != null)
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        Boolean respuesta = estudianteService.delete(id);
        if(respuesta)
            return new ResponseEntity<>("se elmino correctamente el estudiante", HttpStatus.OK);
        else
            return new ResponseEntity<>("no se elmino el estudiante", HttpStatus.BAD_REQUEST);
    }


    @PutMapping("/actualizar")
    public ResponseEntity<Estudiante>  update(@RequestBody Estudiante object) {
        Estudiante respuesta = estudianteService.update(object);
        if(respuesta != null)
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);

    }

    @PostMapping("/registrar")
    public ResponseEntity<Estudiante> insert(@RequestBody Estudiante object) {
        Estudiante respuesta = estudianteService.insert(object);
        if(respuesta != null)
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        else
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);


    }




}
