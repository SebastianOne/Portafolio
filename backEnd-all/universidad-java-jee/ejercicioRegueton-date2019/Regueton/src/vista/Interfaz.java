package vista;

import javax.swing.JOptionPane;

public class Interfaz 
{

	public Interfaz()
	{
		
	}
	// este metodo no se usa en el programa
	public String pedirDato() 
	{
		return (JOptionPane.showInputDialog(null,"Ingrese un dato","Titulo del InputDialog",JOptionPane.INFORMATION_MESSAGE));
	}
	// este metodo muestra la cancion.
	public void escribirDato(String dato) 
	{
		JOptionPane.showMessageDialog(null, dato, "Título del Message Dialog", JOptionPane.INFORMATION_MESSAGE);
	}
	// este metodo  le pide al usuario cuantos parrafo quiere en la cancion
	// retorna un dato de tipo int

	public int cuantosParrafos() 
	{
		String respuesta = JOptionPane.showInputDialog("cuantas estrofas quiere");
		int respuesta1 = Integer.parseInt(respuesta);
		return respuesta1;
	}
	// este metodo  le pide al usuario cuantos renglones quiere en la cancion
	// retorna un dato de tipo int
	public int cuantosRenglones() 
	{
		String respuesta = JOptionPane.showInputDialog("cuantas renglones  quiere");
		int respuesta1 = Integer.parseInt(respuesta);
		return respuesta1;
	}

	
}
