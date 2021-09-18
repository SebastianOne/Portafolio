package modelo;

public class modelo 
{
	private String articulo;
	  private int cantidad;
	  private double precio;
	  private String nombre;
	  private String apellido;
	  private String tarjetaCredito;
	  private String numTarjeta;
	  private String fecha;
	  
	  public modelo()
	  {
	  	articulo = "";
	  	cantidad = 0;
	  	precio = 0;
	  	nombre ="";
	  	apellido = "";
	  	tarjetaCredito = "";
	  	numTarjeta="";
	  	fecha="";
	  	
	  }
	  
	  public double calculo() 
	  {
		  
		  double respuesta = cantidad*precio;
		  return respuesta;
	  }

	public String getArticulo() {
		return articulo;
	}

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTarjetaCredito() {
		return tarjetaCredito;
	}

	public void setTarjetaCredito(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}



	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
}
