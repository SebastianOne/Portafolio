package modelo;

public abstract class Persona 
{
   protected String cedula;
   protected String nombre;
   protected String apellido;
   protected String telefono;
   protected String correo;
   protected String direccion;
   protected String a�o;
   protected String genero;
   protected double salario;
 
    
    
  
   
   public Persona(String cedula , String nombre , String apellido, String telefono, String correo, String direccion, String a�o, String genero) 
   {
	  

       this.cedula = cedula;
	   this.nombre = nombre;
	   this.apellido = apellido;
	   this.telefono = telefono ;
	   this.correo = correo;
       this.direccion = direccion;
       this.a�o = a�o;
       this.genero = genero;
       this.salario = 0;
     
   }
	
   
   public abstract double calcularSalario();


public String getCedula() {
	return cedula;
}


public void setCedula(String cedula) {
	this.cedula = cedula;
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


public String getTelefono() {
	return telefono;
}


public void setTelefono(String telefono) {
	this.telefono = telefono;
}


public String getCorreo() {
	return correo;
}


public void setCorreo(String correo) {
	this.correo = correo;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public String getA�o() {
	return a�o;
}


public void setA�o(String a�o) {
	this.a�o = a�o;
}


public String getGenero() {
	return genero;
}


public void setGenero(String genero) {
	this.genero = genero;
}





public double getSalario() {
	return salario;
}


public void setSalario(double salario) {
	this.salario = salario;
}



   
	
}
