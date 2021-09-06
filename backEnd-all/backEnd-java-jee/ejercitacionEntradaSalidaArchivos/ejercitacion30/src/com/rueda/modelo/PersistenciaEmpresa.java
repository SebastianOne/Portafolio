// juan sebastian rueda rodriguez
package com.rueda.modelo;

import java.io.*;

public class PersistenciaEmpresa {

    public Boolean guardar(Empresa empresa){

        FileOutputStream file = null;
        try{
            file = new FileOutputStream("./src/com/rueda/resources/empresa.txt");
            ObjectOutputStream object = new ObjectOutputStream(file);
            object.writeObject(empresa);
            object.close();
            file.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }


    public Empresa leer(){

        FileInputStream file = null;
        Empresa respuesta = null;
        try{
            file = new FileInputStream("./src/com/rueda/resources/empresa.txt");
            ObjectInputStream object = new ObjectInputStream(file);
            respuesta = (Empresa)object.readObject();
            object.close();
            file.close();

        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return respuesta;
    }


}
