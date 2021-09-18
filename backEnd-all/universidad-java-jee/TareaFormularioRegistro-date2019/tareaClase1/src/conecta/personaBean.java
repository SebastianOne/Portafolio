package conecta;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean

public class personaBean 
{
	
	private String nombre;
	private String apellido;
	private double telefono;
	private int edad;
	private ArrayList<personaBean> listapersonas;
	
	
	public personaBean() 
	{
		
	}
	
	
	@PostConstruct
	public String guardar() 
	{
		
	
		try 
		{
			
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Et2TOlpOqO", "Et2TOlpOqO", "sLEW6YuUCO");
			
			PreparedStatement ps = miConexion.prepareStatement("INSERT INTO tablaEjercicio2 (nombre,apellido,telefono,edad) VALUES('"+nombre+"','"+apellido+"','"+telefono+"','"+edad+"')");
		
		}
		catch(Exception e)
		{
			System.out.println("NO SE PUDO CONECTAR"+e);
		}
		
		return null;
		
		
	}
	
	public void doGet() 
	{
		listapersonas = new ArrayList<personaBean>();
		FacesContext context = FacesContext.getCurrentInstance();
		
		HttpSession session= (HttpSession) context.getExternalContext().getSession(true);
		listapersonas = (ArrayList<personaBean>) session.getAttribute("listapersonas");

		if (listapersonas == null) {
			listapersonas = new ArrayList<personaBean>();
			
	
		try 
		{
			
			
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/Et2TOlpOqO", "Et2TOlpOqO", "sLEW6YuUCO");
			Statement miStatement = miConexion.createStatement();
			
			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM tablaEjercicio2 ");
			
			
			while(miResultset.next())
			{
				personaBean per = new personaBean();
				per.setNombre(miResultset.getString("nombre"));
				per.setApellido(miResultset.getString("apellido"));
				per.setTelefono(miResultset.getDouble("telefono"));
				per.setEdad(miResultset.getInt("edad"));
				listapersonas.add(per);
			}
			
		
			
		}
		catch(Exception e)
		{
			System.out.println("NO SE PUDO CONECTAR"+e);
		}
		
		
		session.setAttribute("listapersonas", listapersonas);
		}
		listapersonas.add(this);
		
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




	public double getTelefono() {
		return telefono;
	}




	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}




	public int getEdad() {
		return edad;
	}




	public void setEdad(int edad) {
		this.edad = edad;
	}




	public ArrayList<personaBean> getListapersonas() {
		return listapersonas;
	}




	public void setListapersonas(ArrayList<personaBean> listapersonas) {
		this.listapersonas = listapersonas;
	}
	
	
	
}
