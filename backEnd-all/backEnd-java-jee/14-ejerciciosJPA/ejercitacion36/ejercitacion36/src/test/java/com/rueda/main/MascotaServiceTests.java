package com.rueda.main;
import com.rueda.main.entity.Mascota;
import com.rueda.main.service.MascotaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class MascotaServiceTests {

    @Autowired
    private MascotaService mascotaService;


    @Test
    public void readAll(){
        List<Mascota> respuesta = mascotaService.readAll();
        Assertions.assertTrue(respuesta.size()>0);
    }

    @Test
    public void readOne(){
        Long id = 1L;
        Optional<Mascota> respuesta = mascotaService.readOne(id);
        Assertions.assertNotNull(respuesta);
    }
    @Test
    public void insert(){
        Mascota mascota = new Mascota();
        mascota.setNombre("marcos");
        mascota.setEdad(11);
        Mascota respuesta = mascotaService.insert(mascota);
        Assertions.assertNotNull(respuesta);

    }
    @Test
    public void delete(){
        Long id = 1L;
        Boolean respuesta = mascotaService.delete(id);
        Assertions.assertTrue(respuesta);
    }
    @Test
    public void update(){
        Long id = 1L;
        Optional<Mascota> mascota = mascotaService.readOne(id);
        mascota.get().setNombre("pepito el gatito");
        Boolean update = mascotaService.update(mascota.get());
        Assertions.assertTrue(update);
    }

}
