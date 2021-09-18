package modelo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades 
{
    private Properties prop ;
    private String archivoprop ;
    private String a;
    private String b;
    private String c;
    private String d;
    
    public Propiedades() 
    {
    	archivoprop = "C:\\Program Files (x86)\\Z8Games\\archivo.properties";
    	prop = new Properties();
    	a = "";
    	b = "";
    	c = "";
    	d = "";
    	
    }
    
    public void escribirPropiedades() 
    {
    	try 
    	{
    		prop.setProperty("nombreArchivo", "C:\\Program Files (x86)\\Z8Games\\archivo.properties");
    		prop.setProperty("archivoProp", "C:\\Program Files (x86)\\Z8Games\\archivo.properties");
    		prop.setProperty("nombreCodigo", "Propiedades.java");
    		prop.store(new FileOutputStream(archivoprop), null);
    	}
    	catch(IOException ex) 
    	{
    		ex.printStackTrace();
    	}
    }
    
    
    public String leerPropiedades()
    {
    	try 
    	{
    		prop.load(new FileInputStream(archivoprop));
    		prop.list(System.out);
    		
    		 a = prop.getProperty(prop.getProperty("nombreArchivo"));
    		 b = prop.getProperty(prop.getProperty("archivoProp"));
    		 c = prop.getProperty("nombreCodigo");
    		
    	}
    	catch(IOException ex){
    		ex.printStackTrace();
    	}
    	{
    		
    	}
    	
    	return d = a + b + c;
    }

}
