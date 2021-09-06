package com.rueda.service;

import com.rueda.dao.IDao;
import com.rueda.model.Odontologo;

import java.util.List;

public class OdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public List<Odontologo> readMany(){
        return odontologoIDao.readMany();

    }
    public Boolean insert(Odontologo object){
        return odontologoIDao.insert(object);
    }

    public Odontologo readOne(Integer id){
        return odontologoIDao.readOne(id);
    };
    public Boolean update(Odontologo object){
        return odontologoIDao.update(object);

    };
    public Boolean delete(Integer id){
        return odontologoIDao.delete(id);

    };

}
