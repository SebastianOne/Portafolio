package modelo;

public abstract class SalarioFijo extends Persona
{

	protected final double  salario1;
	
	public SalarioFijo(String cedula, String nombre, String apellido, String telefono, String correo, String direccion,
			String año, String genero)
	{
		super( cedula , nombre , apellido,  telefono,  correo,  direccion, año, genero);
		// TODO Auto-generated constructor stub
		
		salario1 = 3500000;
		
	}

public abstract double calcularSalario();
	
	public abstract double calcularSalrioFinal();
	 
	

}
