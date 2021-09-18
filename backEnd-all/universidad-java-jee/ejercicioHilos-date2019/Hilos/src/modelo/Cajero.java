package modelo;

public class Cajero implements Runnable
{
	 private String nombre;
     private String cedula;
     private Cliente cliente;
     private long initialTime ;
     private int tiempoTotal;
      
      public Cajero(String nombre, Cliente cliente,long initialTime)
      {
    	  this.cedula = "1815964587";
    	  this.nombre = nombre;
    	  this.cliente = cliente;
    	  this.initialTime = initialTime;
    	  tiempoTotal = 0;
    	  
      }

	@Override
	public void run() 
	{
		tiempoTotal = 0;
		int [] arg = cliente.getCarrito();
		
		for(int i = 0; i < arg.length;i++) 
		{
			int producto = i+1;
			
			System.out.println("registrado el producto " + producto + " del " + nombre + " tiempo : " + arg[i] + " seg ");
			tiempoTotal += arg[i];
		}
		
		System.out.println("el " + nombre +  ",  ha terinado de procesar al "+ cliente.getNombre()+ " en el tiempo de :" + tiempoTotal + " seg" );
		
		
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}
	
	
}
