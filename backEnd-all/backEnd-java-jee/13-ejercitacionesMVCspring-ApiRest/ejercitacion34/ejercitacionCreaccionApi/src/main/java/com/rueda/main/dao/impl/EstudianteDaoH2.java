package com.rueda.main.dao.impl;

import com.rueda.main.dao.IDao;
import com.rueda.main.dao.setting.ConfiguracionJdbc;
import com.rueda.main.model.Estudiante;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoH2 implements IDao<Estudiante> {
    private ConfiguracionJdbc coneccion ;
    public EstudianteDaoH2(ConfiguracionJdbc coneccion){
        this.coneccion = coneccion;
    }

    @Override
    public List<Estudiante> readAll() {
        Connection coneccionPrincipal = coneccion.coneccion();
        List<Estudiante> estudiantes = new ArrayList<>();
        try{
            try {
                Statement miStatement = coneccionPrincipal.createStatement();
                ResultSet miResulset = miStatement.executeQuery("select * from estudiante");
                while (miResulset.next()) {
                    estudiantes.add(new Estudiante(miResulset.getInt("id"), miResulset.getString("nombre"), miResulset.getString("apellido"), miResulset.getString("profesor"), miResulset.getDouble("promedio_notas")));
                }
                miStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            coneccionPrincipal.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return estudiantes;
    }

    @Override
    public Estudiante readOne(Integer id) {
        Estudiante estudiante1 = null;
        Connection coneccionPrincipal = coneccion.coneccion();
        String query = String.format("select * from estudiante where id=%s",id);
        try{
            try {
                Statement miStatement = coneccionPrincipal.createStatement();
                ResultSet miResulset = miStatement.executeQuery(query);
                while (miResulset.next()) {
                    estudiante1 = new Estudiante(miResulset.getInt("id"), miResulset.getString("nombre"), miResulset.getString("apellido"), miResulset.getString("profesor"), miResulset.getDouble("promedio_notas"));

                }
                miStatement.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
            coneccionPrincipal.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return estudiante1;
    }

    @Override
    public Estudiante insert(Estudiante estudiante) {
        Estudiante estudiante1 = null;
        Connection coneccionPrincipal = coneccion.coneccion();
        try {
            Statement miStatement = coneccionPrincipal.createStatement();
            try{
                String query = String.format("insert into estudiante(nombre, apellido, profesor, promedio_notas) values ('%s','%s','%s',%s)",estudiante.getNombre(),estudiante.getApellido(),estudiante.getProfesor(),estudiante.getPromedioNotas());
                //"insert into estudiante(nombre, apellido, profesor, promedio_notas) values ('" + estudiante.getNombre() + "','" +estudiante.getApellido() + "','" + estudiante.getProfesor() + "',  "+estudiante.getPromedioNotas()+" )"
                miStatement.execute(query);
                estudiante1 = estudiante;
            }catch (SQLException e){
                e.printStackTrace();
            }
            coneccionPrincipal.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return estudiante1;
    }

    @Override
    public Boolean delete(Integer id) {
        Boolean respuesta = false;
        Connection coneccionPrincipal = coneccion.coneccion();
        try {
            PreparedStatement miPrepared = coneccionPrincipal.prepareStatement("delete from estudiante where id=?");
            miPrepared.setInt(1,id);
            try{
                miPrepared.execute();
                respuesta = true;
            }catch (SQLException e){
                e.printStackTrace();
            }
            coneccionPrincipal.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return respuesta;
    }

    @Override
    public Estudiante update(Estudiante object) {
        Estudiante respuesta = null;
        Connection coneccionPrincipal = coneccion.coneccion();
        try {
            PreparedStatement miPrepared = coneccionPrincipal.prepareStatement("update estudiante set nombre=?, apellido=? , profesor=?, PROMEDIO_NOTAS=? where id=?");
            miPrepared.setString(1,object.getNombre());
            miPrepared.setString(2,object.getApellido());
            miPrepared.setString(3,object.getProfesor());
            miPrepared.setDouble(4,object.getPromedioNotas());
            miPrepared.setInt(5,object.getId());
            try{
                miPrepared.execute();
                respuesta = object;
            }catch (SQLException e){
                e.printStackTrace();
            }
            coneccionPrincipal.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return respuesta;
    }

}
