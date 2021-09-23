package com.rueda.main.service.impl;

import com.rueda.main.entity.Jugador;
import com.rueda.main.repository.IJugadorRepository;
import com.rueda.main.service.IJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("JugadorServiceImpl")
public class JugadorServiceImpl implements IJugadorService {

    @Autowired
    private IJugadorRepository jugadorRepository;


    @Override
    public List<Jugador> readALl() {
        return jugadorRepository.findAll();
    }

    @Override
    public Optional<Jugador> readOne(Long id) {
        return jugadorRepository.findById(id);
    }

    @Override
    public Optional<Jugador> insert(Jugador jugador) {
        Jugador respuesta = null;
        if(jugador.getNombre() != null && jugador.getNombre() != null&& jugador.getPuesto() != null && jugador.getNumero() != null ){
            respuesta = jugadorRepository.save(jugador);
        }
        return Optional.ofNullable(respuesta);
    }

    @Override
    public Boolean delete(Long id){
        Boolean respuesta = false;
        if(jugadorRepository.existsById(id)){
            respuesta = true;
            jugadorRepository.deleteById(id);
        }
        return respuesta;
    }

    @Override
    public Boolean update(Jugador jugador) {
        Boolean respuesta = false;
        if(jugadorRepository.existsById(jugador.getId()) && jugador.getNombre() != null && jugador.getNombre() != null&& jugador.getPuesto() != null && jugador.getNumero() != null && jugador.getEquipo() != null ){
            respuesta = true;
            jugadorRepository.save(jugador);
        }
        return respuesta;
    }
}
