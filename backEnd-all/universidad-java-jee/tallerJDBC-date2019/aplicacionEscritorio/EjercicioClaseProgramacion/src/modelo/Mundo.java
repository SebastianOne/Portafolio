package modelo;

import java.sql.*;
import java.util.ArrayList;

public class Mundo {
	private ArrayList<String> apellidos;
	private ArrayList<String> nombres;
	private ArrayList<String> usuario;

	public Mundo() {
		nombres = new ArrayList<String>();
		apellidos = new ArrayList<String>();
		usuario = new ArrayList<String>();

	}
	public void llenarUsuario() 
	{
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
					"8f0wbbcv5g", "cZuVQlLRYW");
			Statement miStatement = miConexion.createStatement();

			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM usuarios");

			while (miResultset.next())
			{

				usuario.add(miResultset.getString("user_id"));
			}
		} catch (Exception e) {
			System.out.println("NO SE PUDO CONECTAR" + e);
		}

	}

	public void llenarNombres() 
	{
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
					"8f0wbbcv5g", "cZuVQlLRYW");
			Statement miStatement = miConexion.createStatement();

			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM usuarios");

			while (miResultset.next()) {

				nombres.add(miResultset.getString("first_name"));
			}
		} catch (Exception e) {
			System.out.println("NO SE PUDO CONECTAR" + e);
		}

	}

	public void llenarApellidos() {
		try {
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
					"8f0wbbcv5g", "cZuVQlLRYW");
			Statement miStatement = miConexion.createStatement();

			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM usuarios");

			while (miResultset.next()) {
				apellidos.add(miResultset.getString("last_name"));

			}
		} catch (Exception e) {
			System.out.println("NO SE PUDO CONECTAR" + e);
		}

	}

	public void llenarNombres2() {

		for (int i = 0; i < nombres.size(); i++) {
			for (int j = nombres.size() - 1; j > 0; j--) {
				if (i != j) {
					if (nombres.get(i).equalsIgnoreCase(nombres.get(j))) {
						nombres.remove(j);
					}
				}

			}

		}
	}

	public void llenarApellidos2() {
		for (int i = 0; i < apellidos.size(); i++) {
			for (int j = apellidos.size() - 1; j > 0; j--) {
				if (i != j) {
					if (apellidos.get(i).equalsIgnoreCase(apellidos.get(j))) {
						apellidos.remove(j);
					}
				}

			}

		}
	}
	
	public int contadorNombres() 
	{
		return nombres.size();
	}
	
	public int contadorApellidos() 
	{
		return apellidos.size();
	}

	public ArrayList<String> getApellidos() {
		return apellidos;
	}

	public void setApellidos(ArrayList<String> apellidos) {
		this.apellidos = apellidos;
	}

	public ArrayList<String> getNombres() {
		return nombres;
	}

	public void setNombres(ArrayList<String> nombres) {
		this.nombres = nombres;
	}
	public ArrayList<String> getUsuario() {
		return usuario;
	}
	public void setUsuario(ArrayList<String> usuario) {
		this.usuario = usuario;
	}
/*
 * <td colspan="2"><select name="apellidos"></select></td>
			<% for(int i = 0; i<apellidos.size(); i++){ %>
			<option><%apellidos.get(i); %></option>
			<%} %>
			 
			<td><select name="usuarios"></select></td>
			<% for(int i = 0; i<usuarios.size(); i++){ %>
			<option><%usuarios.get(i);%></option>
			<%} %>
		</tr>
		
		<tr>
			 
			<td colspan="2"><select name="usuarios"></select></td>
			<% for(int i = 0; i<usuarios.size(); i++){ %>
			<option><%nombres.get(i);%></option>
			<%} %>
			
			<td colspan="2"><select name="genero"></select></td>
			<option>Female</option>
			<option>Male</option>
			
		</tr>
		
 */
	
}
