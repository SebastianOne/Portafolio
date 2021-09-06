package com.rueda.dao.impl;

import com.rueda.dao.IDao;
import com.rueda.dao.settings.ConfiguracionJDBC;
import com.rueda.model.Odontologo;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDaoH2 implements IDao<Odontologo> {

    private static final Logger logguer = Logger.getLogger(OdontologoDaoH2.class);
    private ConfiguracionJDBC coneccion;


    public OdontologoDaoH2(ConfiguracionJDBC coneccion) {
        this.coneccion = coneccion;
    }

    public List<Odontologo> readMany(){

        List<Odontologo> arreglo = new ArrayList<>();
        Connection coneccion2 = coneccion.coneccion();
        try {
            Statement miStatement = coneccion2.createStatement();
            ResultSet miResulset = miStatement.executeQuery("select * from odontologo");
            while (miResulset.next()){
                arreglo.add(new Odontologo(miResulset.getInt("id"),miResulset.getString("nombre"),miResulset.getString("apellido") ,miResulset.getString("matricula")));
            }
            logguer.info("se realizo la busqueda de todos los odontologos de forma satisfactoria");
            coneccion2.close();
        } catch (SQLException e) {
            e.printStackTrace();
            logguer.error("se genero un error al realizar la busqueda de todos los odontologos");
        }
        return arreglo;

    }

    @Override
    public Odontologo readOne(Integer id) {
        Odontologo odontologo = null;
        Connection coneccion1 = coneccion.coneccion();
        String query = String.format("select * from odontologo where id=%s",id);
        try{
            Statement miStatement = coneccion1.createStatement();
            ResultSet miResulset = miStatement.executeQuery(query);
            while(miResulset.next()){
                odontologo = new Odontologo(miResulset.getInt("id"), miResulset.getString("nombre"),miResulset.getString("apellido"),miResulset.getString("matricula"));
            }
            logguer.info("se encontro a el: "+ odontologo);
            miStatement.close();
            coneccion1.close();
        }catch(SQLException e){
            logguer.error("se genero un error al realizar la busqueda del odontologo", e);
        }
        return odontologo;
    }

    @Override
    public Boolean update(Odontologo object) {
        Boolean respuesta = false;
        Connection coneccion1 = coneccion.coneccion();
        try{
            Statement miStatement = coneccion1.createStatement();
            miStatement.execute("update odontologo set nombre='"+object.getNombre()+"', apellido='"+object.getApellido()+"', matricula='"+object.getMatricula()+"' where id="+object.getId()+"");
            logguer.info("se actualizo al odontologo" + object);
            respuesta = true;
            miStatement.close();
            coneccion1.close();
        }catch (SQLException e){
            logguer.error("se genero un error al realizar la actualizacion de odontologo", e);
        }
        return respuesta;
    }

    @Override
    public Boolean delete(Integer id) {
        Boolean respuesta = false;
        Connection coneccion1 = coneccion.coneccion();
        try{
            coneccion1.setAutoCommit(false);
            PreparedStatement miPrepared = coneccion1.prepareStatement("delete from odontologo where id=?");
            miPrepared.setInt(1,id);
            miPrepared.execute();
            coneccion1.commit();
            coneccion1.setAutoCommit(true);
            logguer.info("se elimino al odontologo");
            respuesta = true;

        }catch (SQLException e){
            try {
                coneccion1.rollback();

            }catch (SQLException a){
                logguer.error("se genero un error al realizar el rollback: " , a);
            }

            logguer.error("se genero un error al realizar la eliminacion del odontologo: " , e);
        }
        return respuesta;
    }


    public Boolean insert(Odontologo odontologo){
        Boolean respuesta = false;
        Connection coneccion2 = coneccion.coneccion();
        try {
            Statement miStatement = coneccion2.createStatement();
            try{
                miStatement.execute("insert into odontologo(nombre, apellido, matricula) values ('" + odontologo.getNombre() + "','" + odontologo.getApellido() + "','" + odontologo.getMatricula() + "')");
                coneccion2.commit();
                logguer.info("se logro insertar al: " + odontologo);
                respuesta = true;
            }catch (SQLException e){
                logguer.error("se genero un error al insertar al: " + odontologo, e);
            }
            coneccion2.close();
        } catch (SQLException e) {
            e.printStackTrace();
            logguer.error("se genero un error al insertar al: " + odontologo, e);
        }
        return respuesta;

    }

}
