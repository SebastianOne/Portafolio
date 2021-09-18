package com.rueda.main.service;

import com.rueda.main.model.Domicilio;
import com.rueda.main.model.Paciente;

import java.util.Arrays;
import java.util.List;

public class PacienteService {

    public Paciente readOne(String email)
    {
        Domicilio domicilio = new Domicilio("calle meri",12, "localidad1","alicante");
        Domicilio domicilio2 = new Domicilio("calle meri",12, "localidad1","alicante");
        Domicilio domicilio3 = new Domicilio("calle meri",12, "localidad1","alicante");
        Domicilio domicilio4 = new Domicilio("calle meri",12, "localidad1","alicante");
        Paciente paciente1 = new Paciente(1,"rodriguez", "juan","juan@gmail.com", "12-01-2021",domicilio,"dn1");
        Paciente paciente2 = new Paciente(2,"rodriguez2", "juan2","juan2@gmail.com", "12-01-2021",domicilio2,"dn2");
        Paciente paciente3 = new Paciente(3,"rodriguez3", "juan3","juan3@gmail.com", "12-01-2021",domicilio3,"dn3");
        Paciente paciente4 = new Paciente(4,"rodriguez4", "juan4","juan4@gmail.com", "12-01-2021",domicilio4,"dn4");
        List<Paciente> pacientes = Arrays.asList(paciente1,paciente2,paciente3,paciente4);
        Paciente respuesta = null;
        for (Paciente paciente: pacientes) {
            if(paciente.getEmail().equals(email)) {
                respuesta = paciente;
                break;
            }

        }
        return respuesta;
    }

    public List<Paciente> readAll(){
        Domicilio domicilio = new Domicilio("calle meri",12, "localidad1","alicante");
        Domicilio domicilio2 = new Domicilio("calle meri",12, "localidad1","alicante");
        Domicilio domicilio3 = new Domicilio("calle meri",12, "localidad1","alicante");
        Domicilio domicilio4 = new Domicilio("calle meri",12, "localidad1","alicante");
        Paciente paciente1 = new Paciente(1,"rodriguez", "juan","juan@gamil.com", "12-01-2021",domicilio,"dn1");
        Paciente paciente2 = new Paciente(2,"rodriguez2", "juan2","juan2@gamil.com", "12-01-2021",domicilio,"dn1");
        Paciente paciente3 = new Paciente(3,"rodriguez3", "juan3","juan3@gamil.com", "12-01-2021",domicilio,"dn1");
        Paciente paciente4 = new Paciente(4,"rodriguez4", "juan4","juan4@gamil.com", "12-01-2021",domicilio,"dn1");
        List<Paciente> pacientes = Arrays.asList(paciente1,paciente2,paciente3,paciente4);
        return  pacientes;
    }


}
