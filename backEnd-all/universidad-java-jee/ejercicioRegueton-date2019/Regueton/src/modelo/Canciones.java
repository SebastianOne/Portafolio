package modelo;
// importamos las clases persistencia y la clase archivo
import modelo.Persistencia;
import modelo.Archivo;

public class Canciones 
{
  //  se crearon objeros de las clases que importamos
	private Persistencia pe;
	private Archivo ar;
	
	
	public Canciones() 
	
	{
		// instanciamos los objetos que creamos de las clases que importamos
		pe = new Persistencia();
		ar = new Archivo();
		
		// se instancio un objeto de la clase archivo para que la clase archivo
		//pueda ser utilizada despues en el controlador llamando la clase cancion
		
		
	}
	
	
	// este metodo crea la canción , pide dos parametros de tipo entero el pNumero1 es para que la persona escoja
	// las estrofas que desea y el pNumero2 es para que escoja los renglones
	
	public String palabra1( int pNumero1, int pNumero2) 
	{
	
		// la variable palabra es donde se va a guardar la palabra que se crea aleatoria.
		// y la variable posicion es donde tambien se va a guardar la palabra que se crea aleatoria.
		// donde mas adelante palabra1 = posicion. y asi sucedivamente con las demas variables creadas
		String palabra1 = "";
		String posicion = "";
		
		String palabra2 = "";
		String posicion2 = "";
		
		String palabra3 = "";
		String posicion3 = "";
		
		String palabra4 = "";
		String posicion4 = "";
		
		String palabra5 = "";
		String posicion5 = "";
		
		String palabra6 = "";
		String posicion6 = "";
		
		// cree una bariable cancion la cual esta vacia 
		// para que en el primer for cree el salto de linea para separar los renglones y crear las estrofas
		String cancion = "";
		
		
		

		
		
			for( int i = 0; i < pNumero1; i++) 
			{
				
			    String parrafo = " \n";
				if( i > 0 && i< pNumero1) 
				{
					cancion += parrafo;
				}
				
				/*
				 * 
				 */
			    for(int j = 0; j < pNumero2; j++) 
			    {
			    	
			    	/* 
			    	 * creee 6 variables para guardar 6 numeros aleatorios diferentes uno para cada arreglo
			    	 */
			    	int respuesta = (int)(Math.random()*5);
					int respuesta1 = (int)(Math.random()*5);
					int respuesta2 = (int)(Math.random()*5);
					int respuesta3 = (int)(Math.random()*5);
					int respuesta4 = (int)(Math.random()*5);
					int respuesta5 = (int)(Math.random()*5);
					
					/*
					 * se creo la varible String posicion1  para que hay se guardara la primera palabra del primer arreglo
					 * y despues lo que hice fue que la variable "posicion" que tenemos fuera de los for declarada tomara el valor de posicion1. y asi sucesiva mente 
					 * hice esto porque String posicion1 es una variable que se creo dentro del for al momento de de que queramos que nos devuelva algo fuera de los for 
					 * no lo hara porque no existe fuera de los for.
					 */
					
					String  posicion1 = pe.letra[respuesta];
					posicion = posicion1;
					
					String  posicion11 = pe.letra1[respuesta1];
				    posicion2 = posicion11;
				    
				    String  posicion111 = pe.letra2[respuesta2];
				    posicion3 = posicion111;
				    
				    String  posicion112 = pe.letra3[respuesta3];
				    posicion4 = posicion112;
				    
				    String  posicion113 = pe.letra4[respuesta4];
				    posicion5 = posicion113;
				    
				    String  posicion114 = pe.letra5[respuesta5];
				    posicion6 = posicion114;
				    
				    /* 
				     * y la  variable posicion luego la guarde en palabra 1 esto con el fin de  saber bien y no confundirme cual es la palabra 1 y la 2.....etc
				     */
				    
				    palabra1 = posicion;
					palabra2 = posicion2;
					palabra3 = posicion3;
					palabra4 = posicion4;
					palabra5 = posicion5;
					palabra6 = posicion6;
					
					// aca en la variable cancion le dimos el valor de la concaatenacion de las palabras con el salto de linea
					
					cancion += palabra1 + palabra2 + palabra3 +" ,"+ palabra4 + palabra5 + palabra6  + "\n";
			    		
			       }
			    	
			      
			      
				
			}
			
			// retorna la cancion.
	   return cancion;
  }


	public Persistencia getPe() {
		return pe;
	}


	public void setPe(Persistencia pe) {
		this.pe = pe;
	}
 
	/* 
	 * se crean los getters y setters del objeto "ar" que se creo .
	 */

	public Archivo getAr() {
		return ar;
	}


	public void setAr(Archivo ar) {
		this.ar = ar;
	}
	
	
	
	
}
