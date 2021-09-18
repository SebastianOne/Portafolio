package com.rueda.main.dao.setting;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfiguracionJdbc {

    private String url;
    private String user;
    private String password;
/*
    este constructor es para cuandomusameos otro tipo de base de datos como mysql y tendriamos que generar
    la conexion con los datos correspondientes.

 */
    public ConfiguracionJdbc(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    // aca se realiza la configuracion con los datos por defecto de la base de datos de h2
    public ConfiguracionJdbc() {
        this.url = "jdbc:h2:tcp://localhost/~/test";
        this.user = "root";
        this.password = "123456789";
    }

    public Connection coneccion(){
        Connection coneccion = null;
        try{
            coneccion = DriverManager.getConnection(url,user,password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return coneccion;
    }
}
