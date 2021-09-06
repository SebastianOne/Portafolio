package com.rueda.service;

import com.rueda.dao.impl.OdontologoDaoH2;
import com.rueda.dao.settings.ConfiguracionJDBC;
import com.rueda.model.Odontologo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
public class OdontologoServiceTest {


    Odontologo odontologo1;
    Odontologo odontologo2;
    Odontologo odontologo3;
    OdontologoService odontologoService;


    @BeforeEach
    public void init(){
        odontologo1 = new Odontologo("Carmen" , "Garcia", "matricula5");
        odontologo2 = new Odontologo("Carmen" , "Garcia", "matricula5");
        odontologo3 = new Odontologo("Fabian" , "Barboza", "matricula6");;
        odontologoService = new OdontologoService(new OdontologoDaoH2(new ConfiguracionJDBC("jdbc:h2:tcp://localhost/~/test", "root", "123456789")));
    }

    @Test
    public void insert(){
        assertTrue(odontologoService.insert(odontologo1));
        assertTrue(odontologoService.insert(odontologo2));
        assertTrue(odontologoService.insert(odontologo3));
    }

    @Test
    public void readMany(){
        assertNotNull(odontologoService.readMany());
        assertTrue(odontologoService.readMany().size()>0);
    }

    @Test
    public void readOne(){
        assertNotNull(odontologoService.readOne(3));
        assertEquals(3, odontologoService.readOne(3).getId());
        assertEquals("Raul", odontologoService.readOne(1).getNombre());
        assertEquals("raul@gamil.com", odontologoService.readOne(1).getMatricula());
    };


    @Test
    public void update(){
        Odontologo odontologoPrueba = odontologoService.readOne(2);
        odontologoPrueba.setApellido("Machado");
        odontologoPrueba.setMatricula("miMatricula43");
        assertTrue(odontologoService.update(odontologoPrueba));
        assertEquals("Machado",odontologoService.readOne(2).getApellido());
        assertEquals("miMatricula43",odontologoService.readOne(2).getMatricula());

    };

    @Test
    public void delete(){
        assertTrue(odontologoService.delete(1));
    };
}
