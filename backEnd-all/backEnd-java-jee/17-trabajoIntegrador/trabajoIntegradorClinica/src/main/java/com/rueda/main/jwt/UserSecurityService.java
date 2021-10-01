package com.rueda.main.jwt;

import com.rueda.main.entity.Administrador;
import com.rueda.main.entity.Odontologo;
import com.rueda.main.entity.Paciente;
import com.rueda.main.repository.IAdminRepository;
import com.rueda.main.repository.IOdontologoRepository;
import com.rueda.main.repository.IPacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserSecurityService implements UserDetailsService {

    private final IOdontologoRepository odontologoRepository;


    private final IPacienteRepository pacienteRepository;

    private final IAdminRepository administradorRepository;

    @Autowired
    public UserSecurityService(IOdontologoRepository odontologoRepository, IPacienteRepository pacienteRepository, IAdminRepository administradorRepository) {
        this.odontologoRepository = odontologoRepository;
        this.pacienteRepository = pacienteRepository;
        this.administradorRepository = administradorRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException{

        Set<GrantedAuthority> autorizacionO = new HashSet<>();
        Set<GrantedAuthority> autorizacionP = new HashSet<>();
        Set<GrantedAuthority> autorizacionA = new HashSet<>();

        GrantedAuthority autorizacionOdontologo = new SimpleGrantedAuthority("ROLE_ODONTOLOGO");
        GrantedAuthority autorizacionPaciente = new SimpleGrantedAuthority("ROLE_PACIENTE");
        GrantedAuthority autorizacionAdmin = new SimpleGrantedAuthority("ROLE_ADMIN");

        autorizacionO.add(autorizacionOdontologo);
        autorizacionP.add(autorizacionPaciente);
        autorizacionA.add(autorizacionAdmin);

        Optional<Odontologo> odontologo = odontologoRepository.findByEmail(s);
        Optional<Paciente> paciente = pacienteRepository.findByEmail(s);
        Optional<Administrador> administrador = administradorRepository.findByEmail(s);


        if(odontologo.isPresent()){
            return new User(odontologo.get().getEmail(),odontologo.get().getPassword(),true,true,
                    true,true,autorizacionO);
        }
        else if(paciente.isPresent()){
            return new User(paciente.get().getEmail(),paciente.get().getPassword(),true,true,
                    true,true,autorizacionP);
        }else if(administrador.isPresent()){
            return new User(administrador.get().getEmail(),administrador.get().getPassword(),true,true,true,true,autorizacionA);

        }else{
            throw new UsernameNotFoundException("no se encontro al usuario con email: ");
        }

    }
}
