package com.rueda.main.service;

import com.rueda.main.entity.Mascota;
import com.rueda.main.repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.Optional;

@Service
public class MascotaService implements IMascotaService<Mascota>{

    private IMascotaRepository mascotaRepository;

    @Autowired
    public MascotaService(IMascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    public List<Mascota> readAll(){
        return mascotaRepository.findAll();
    }

    public Optional<Mascota> readOne(Long id){
        return mascotaRepository.findById(id);
    }

    /*cuando guardo devuelvo el el objeto*/
    public Mascota insert(Mascota mascota){
        if(mascota != null)
            mascotaRepository.save(mascota);
        return mascota;
    }

    public Boolean delete(Long id){
        if(mascotaRepository.findById(id).isPresent()) {
            mascotaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Boolean update(Mascota mascota) {
        if (mascota != null) {
            if (mascotaRepository.findById(mascota.getId()).isPresent()) {
                mascotaRepository.save(mascota);
                return true;
            }
        }
        return false;

    }

}
