package com.rueda.main.service;

import com.rueda.main.model.Domicilio;
import com.rueda.main.model.Odontologo;
import com.rueda.main.model.Paciente;

import java.util.Arrays;
import java.util.List;

public class OdontologoService {

    public Odontologo readOne(Integer id)
    {
        Odontologo odontologo1 = new Odontologo(1, "Perez","Pepito", "matricula1");
        Odontologo odontologo2 = new Odontologo(2, "Pardo","Pepito", "matricula2");
        Odontologo odontologo3 = new Odontologo(3, "Perdomo","Pepito", "matricula3");
        Odontologo odontologo4 = new Odontologo(4, "Pirela","Pepito", "matricula4");
        Odontologo odontologo5 = new Odontologo(5, "Garzon","Pepito", "matricula5");

        List<Odontologo>  odontologos = Arrays.asList(odontologo1,odontologo2,odontologo3,odontologo4,odontologo5);
        Odontologo respuesta = null;
        for (Odontologo odontologo: odontologos) {
            if(odontologo.getId().equals(id)) {
                respuesta = odontologo;
                break;
            }

        }
        return respuesta;
    }

    public List<Odontologo> readAll(){

        Odontologo odontologo1 = new Odontologo(1, "Perez","Pepito", "matricula1");
        Odontologo odontologo2 = new Odontologo(2, "Pardo","Pepito", "matricula2");
        Odontologo odontologo3 = new Odontologo(3, "Perdomo","Pepito", "matricula3");
        Odontologo odontologo4 = new Odontologo(4, "Pirela","Pepito", "matricula4");
        Odontologo odontologo5 = new Odontologo(5, "Garzon","Pepito", "matricula5");

        List<Odontologo>  odontologos = Arrays.asList(odontologo1,odontologo2,odontologo3,odontologo4,odontologo5);
        return  odontologos;
    }

}
