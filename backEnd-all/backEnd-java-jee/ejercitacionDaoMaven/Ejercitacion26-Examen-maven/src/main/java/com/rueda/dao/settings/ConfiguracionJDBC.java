package com.rueda.dao.settings;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracionJDBC {
    private String url;
    private String user;
    private String password;
    private static final Logger logguer = Logger.getLogger(ConfiguracionJDBC.class);

    public ConfiguracionJDBC(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Connection coneccion(){
        Connection coneccion = null;
        try{
            coneccion = DriverManager.getConnection(url,user,password);

        }catch (SQLException e){
            logguer.error("error al realizar la coneccion: ", e);
        }
        return coneccion;

    }
}
