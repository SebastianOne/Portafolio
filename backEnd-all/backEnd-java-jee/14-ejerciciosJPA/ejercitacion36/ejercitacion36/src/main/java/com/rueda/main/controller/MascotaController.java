package com.rueda.main.controller;


import com.rueda.main.entity.Mascota;
import com.rueda.main.service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/mascota")
public class MascotaController {

    private final IMascotaService<Mascota> mascotaService;



    @Autowired
    public MascotaController(IMascotaService mascotaService){
        this.mascotaService = mascotaService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Mascota>> readAll(){
        return new ResponseEntity<>(mascotaService.readAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Mascota>> readOne(@PathVariable("id") Long id){
        Optional<Mascota> mascota = mascotaService.readOne(id);
        if(mascota.isPresent())
            return new ResponseEntity<>(mascota, HttpStatus.OK);
        else
            return new ResponseEntity<>(mascota, HttpStatus.BAD_REQUEST);
    }
    @PostMapping("/insertar")
    public ResponseEntity<Mascota> insert(@RequestBody Mascota mascota) {
        Mascota respuesta = null;
        if(mascota != null) {
            respuesta = mascotaService.insert(mascota);
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(respuesta,HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        Boolean respuesta = mascotaService.delete(id);
        if(respuesta != false)
            return new ResponseEntity<>(respuesta, HttpStatus.OK);
        else
            return new ResponseEntity<>(respuesta,HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/actualizar")
    public ResponseEntity<Boolean> update(@RequestBody Mascota mascota) {
        Boolean respuesta = false;
        if(mascota != null) {
            if(mascota.getEdad() == null || mascota.getNombre() == null || mascota.getId() == null)
                return new ResponseEntity<>(respuesta,HttpStatus.BAD_REQUEST);
            else{
                respuesta = mascotaService.update(mascota);
                return new ResponseEntity<>(respuesta, HttpStatus.OK);
            }
        }
        else
            return new ResponseEntity<>(respuesta,HttpStatus.BAD_REQUEST);
    }



}
