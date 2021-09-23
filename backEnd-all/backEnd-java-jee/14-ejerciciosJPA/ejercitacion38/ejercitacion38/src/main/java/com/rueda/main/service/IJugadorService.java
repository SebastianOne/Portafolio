package com.rueda.main.service;
import com.rueda.main.entity.Jugador;
import java.util.List;
import java.util.Optional;

public interface IJugadorService {
    public abstract List<Jugador> readALl();
    public abstract Optional<Jugador> readOne(Long id);
    public abstract Optional<Jugador> insert(Jugador jugador);
    public abstract Boolean delete(Long id);
    public abstract Boolean update(Jugador id);
}
