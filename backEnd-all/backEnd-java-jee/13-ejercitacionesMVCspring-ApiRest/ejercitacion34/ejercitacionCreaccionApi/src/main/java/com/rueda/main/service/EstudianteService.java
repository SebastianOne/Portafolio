package com.rueda.main.service;

import com.rueda.main.dao.IDao;
import com.rueda.main.model.Estudiante;

import java.util.List;

public class EstudianteService {
    private IDao<Estudiante> estudianteIDao;

    public EstudianteService(IDao<Estudiante> estudianteIDao) {
        this.estudianteIDao = estudianteIDao;
    }

    public List<Estudiante> readAll() {
        return estudianteIDao.readAll();
    }


    public Estudiante readOne(Integer id) {
        return estudianteIDao.readOne(id);
    }



    public Boolean delete(Integer id) {
        return estudianteIDao.delete(id);
    }


    public Estudiante update(Estudiante object) {
        return estudianteIDao.update(object);
    }

    public Estudiante insert(Estudiante estudiante) {
        return estudianteIDao.insert(estudiante);
    }
}
