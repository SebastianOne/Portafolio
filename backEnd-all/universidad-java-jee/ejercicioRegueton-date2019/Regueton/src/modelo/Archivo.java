package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.*;

/* 
 * esta clase esta en el pdf del profesor, lo unico que hice fue copiar todo aca es en esta clase
 */

public class Archivo {
	private File f;

	public Archivo() {
	
		// f -->carga el archivo
	}

	public String leerArchivo() {

		//C:\\Program Files (x86)\\Z8Games    aca esta la carpeta donde esta el archivo txt que se llama numeros
		String cadena = "";
		File f = new File("C:\\Program Files (x86)\\Z8Games\\numeros.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			
			while (linea != null) {
				// y se modifico aca para que devolviera un string por esos se creo la variable cadena
		
                cadena = cadena + linea + "\n";
				System.out.println(linea);
				linea = br.readLine();
			}
			fr.close();
		}

		catch (IOException e) {
			System.out.println("error");
		}
		return cadena;
	}

	public void escribirArchivo(String pCancion)
	{
		File f = new File("C:\\Program Files (x86)\\Z8Games\\numeros.txt");
		
		try
		{
			 FileWriter fw = new FileWriter(f);
			 PrintWriter pw = new PrintWriter(fw);
			 
			 // este metodo escribe la cancion se quito el if y solo se dejo pw.print(pcancion)
			 // recibe de parametro un string porque este sera la cancion que se creee y que se escribira en este metodo.
			 // el cual se guardara en la carpeta antes mencionada.
					 
				 pw.print(pCancion);
			 
			 fw.close();
		}
      catch(IOException e)
      {
    	  System.out.println("error");
      }
	}

	
}
