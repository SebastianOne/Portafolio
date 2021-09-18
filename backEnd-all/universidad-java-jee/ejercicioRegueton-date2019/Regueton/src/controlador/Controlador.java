package controlador;
import modelo.Canciones;
import vista.Interfaz;

import modelo.Propiedades;
// se importan las clases que vamos a utilizar
public class Controlador
{
     private Canciones ca;
     private Interfaz in;
     private Propiedades pro;
     
     private String cancion;
     
     public Controlador() 
     {
    	 
    	 // se instancian 4 objetos de cada clase que importamos para poder utilizar los metodos que
    	 //7 cada clase tiene
    	 pro = new Propiedades();
    	 ca = new Canciones();
    	 in = new Interfaz();
    	 
    	 // se crea una variable de tipo String que se llama cancion para hay guardar la cancion que se crea
    	 cancion = " ";
    	 
    	 /*
    	  * ca.palabra1 es el metodo que crea la cancion el cual recibe dos parametros de tipo entero el 
    	  * el primer parametro es para saber el usuario cuantos parrafos tiene y el segun es para saber cuantos renglones
    	  * desde el controlador conectadmos el modelo con la interfaz.
    	  * en el primer parametro se puso in.cuantosParrafos(),  es el metodo de la clase interfaz 
    	  * donde se le pregunta al usuario cuantos parrafos quiere y devulve un int. lo mismo en el segundo parametro.
    	  * ya con estos dos valores ca.palabra1 creara la cancion  la cual devuelve un string que se guardara en la variable de tipo cancion
    	  * luego, ca.getAr().escribirArchivo(cancion); esto lo que hace es guardar ese String en el archivo que tenemos 
    	  * en el blog de notas.
    	  * y con el in.escribir dato mostramos con Joptionpane la cancion.
    	  * 
    	  */
    	 cancion = ca.palabra1(in.cuantosParrafos(), in.cuantosRenglones());
     
    	 // el getar  se utiliza para llamar el metodo de leer y escrbir archivo de la clase archivo. todo eso desde la clase cancion
    	 ca.getAr().escribirArchivo(cancion);
    	 in.escribirDato(ca.getAr().leerArchivo());
    	 
    	 
    	 
    	 
    	 
    	 // esto es lo que se hizo en la ultima clase de programacion no funciona todavia
    	 pro.escribirPropiedades();
    	 pro.leerPropiedades();
    	 
    	 
    	
    	
    	
     }
     
    
    
     
 
}
