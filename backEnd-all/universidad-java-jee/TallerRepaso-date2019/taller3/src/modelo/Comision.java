package modelo;

public class Comision extends Persona
{
	private final double salario1;
	private int clientesCaptados;
	private double monto;
	private double salario2;
	
    public Comision(String cedula, String nombre, String apellido, String telefono, String correo, String direccion,String año, String genero, int clientesCaptados, double monto , double salario)
    {
		super(cedula , nombre , apellido,  telefono,  correo,  direccion, año, genero);
		// TODO Auto-generated constructor stub
		
		this.salario =  salario;
		salario1 = 1100000;
		this.clientesCaptados = clientesCaptados;
		this.monto = monto;
		
		salario2 = 0;
		
			
	}

	
	@Override
	public double calcularSalario() 
	{
		salario2 = monto*clientesCaptados;
		
		if (salario2 < salario1)
		{
			salario = salario2 + salario1;
		}
		else 
		{
			salario = salario2;
		}
		// TODO Auto-generated method stub
		return salario;
	}




	

	public int getClientesCaptados() {
		return clientesCaptados;
	}



	public void setClientesCaptados(int clientesCaptados) {
		this.clientesCaptados = clientesCaptados;
	}



	public double getMonto() {
		return monto;
	}



	public void setMonto(double monto) {
		this.monto = monto;
	}



	public double getSalario2() {
		return salario2;
	}



	public void setSalario2(double salario2) {
		this.salario2 = salario2;
	}



	public double getSalario1() {
		return salario1;
	}
	
	
    
}