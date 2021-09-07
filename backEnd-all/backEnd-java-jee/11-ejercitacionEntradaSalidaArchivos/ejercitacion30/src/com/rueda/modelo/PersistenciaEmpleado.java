// juan sebastian rueda rodriguez
package com.rueda.modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PersistenciaEmpleado {

    public Boolean guardar(List<Empleado> empleados){

        File file = new File("./src/com/rueda/resources/empleados.txt");
        try{
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter print = new PrintWriter(fileWriter);
            empleados.forEach(e-> print.println(e.getNombre()+";" + e.getApellido()+";" +e.getLegajo()+";" +e.getSueldo()));
            print.close();
            fileWriter.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }


    public List<Empleado> leer(){

        List<Empleado> empleados = new ArrayList<>();
        File file = new File("./src/com/rueda/resources/empleados.txt");
        try{
            FileReader fileReader = new FileReader(file);
            BufferedReader br = new BufferedReader(fileReader);
            String linea = br.readLine();
            while(linea != null){
                StringTokenizer linea2 = new StringTokenizer(linea, ";");
                while(linea2.hasMoreElements()){
                    empleados.add(new Empleado(linea2.nextElement().toString(),linea2.nextElement().toString(),linea2.nextElement().toString(),Double.parseDouble(linea2.nextElement().toString())));
                }
                linea = br.readLine();

            }

        }catch (IOException e) {
            e.printStackTrace();
        }

        return empleados;
    }
}
