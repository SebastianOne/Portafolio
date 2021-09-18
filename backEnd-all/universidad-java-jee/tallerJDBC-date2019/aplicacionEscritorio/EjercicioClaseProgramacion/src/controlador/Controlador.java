
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import modelo.Mundo;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener, ItemListener
{
	private VentanaPrincipal in;
	private Mundo mu;

	
	public Controlador() 
	{

		mu = new Mundo();
		mu.llenarUsuario();
		mu.llenarNombres();
		mu.llenarApellidos();
		mu.llenarNombres2();
		mu.llenarApellidos2();
		in = new VentanaPrincipal(this, mu.getNombres(),mu.getApellidos(), mu.getUsuario());
		in.setVisible(true);
		
	}

	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		  String usuario = (String)in.getPanel().getUsuario_id().getSelectedItem();
		  
		  if (usuario != "Usuarios")
		  { 
			  in.getPanel().getFirts_name().setEnabled(false); 
			  in.getPanel().getLast_name().setEnabled(false);
			  in.getPanel().getGender().setEnabled(false); 
		 
		  }
		  
		  if (usuario == "Usuarios")
		  { 
			  in.getPanel().getFirts_name().setEnabled(true); 
			  in.getPanel().getLast_name().setEnabled(true);
			  in.getPanel().getGender().setEnabled(true); 
		 
		  }
		 
		  
		  
		 

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub

		if (evento.getActionCommand().equals(in.getPanel2().CONSULTA)) {

			String apellido = (String) in.getPanel().getLast_name().getSelectedItem();
			String nombre = (String) in.getPanel().getFirts_name().getSelectedItem();
			String genero = (String) in.getPanel().getGender().getSelectedItem();
			String usuario = (String) in.getPanel().getUsuario_id().getSelectedItem();

			if(!(nombre.equalsIgnoreCase("nombres")) && (usuario.equalsIgnoreCase("usuarios")) && (genero.equalsIgnoreCase("genero")) && (apellido.equalsIgnoreCase("apellidos"))){
				String resultado = "";

				try {
					Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
							"8f0wbbcv5g", "cZuVQlLRYW");
					Statement miStatement = miConexion.createStatement();

					ResultSet miResultset = miStatement.executeQuery(
							"SELECT * FROM usuarios where first_name = '" + nombre + "' and gender = '" + genero + "'");

					int i = 0;

					while (miResultset.next()) 
					{
						resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
								+ miResultset.getString("last_name") + " - " + miResultset.getString("gender") + " - "+miResultset.getString("user_id")+" - "+miResultset.getString("status")+ "\n";
						i++;
					}

					in.mensaje("el numero de usuarios encontrados fue: " + i);
				} catch (Exception e) {
					System.out.println("NO SE PUDO CONECTAR" + e);
				}

				in.getPanel2().getResultados().setText(resultado);

				
			}

			if (!(nombre.equalsIgnoreCase("nombres")) && !(genero.equalsIgnoreCase("genero")) && (usuario.equalsIgnoreCase("usuarios")) &&   (apellido.equalsIgnoreCase("apellidos")) ) {
				String resultado = "";
				try {
					Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
							"8f0wbbcv5g", "cZuVQlLRYW");
					Statement miStatement = miConexion.createStatement();

					ResultSet miResultset = miStatement.executeQuery(
							"SELECT * FROM usuarios where first_name = '" + nombre + "' and gender = '" + genero + "'");

					int i = 0;

					while (miResultset.next()) {
						resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
								+ miResultset.getString("last_name") + " - " + miResultset.getString("gender") +" - "+miResultset.getString("user_id")+" - "+miResultset.getString("status") +"\n";
						i++;
					}

					in.mensaje("el numero de usuarios encontrados fue: " + i);
				} catch (Exception e) {
					System.out.println("NO SE PUDO CONECTAR" + e);
				}

				in.getPanel2().getResultados().setText(resultado);

			}
			
			if (!(nombre.equalsIgnoreCase("nombres")) && !(genero.equalsIgnoreCase("genero")) && !(apellido.equalsIgnoreCase("apellidos")) && (usuario.equalsIgnoreCase("usuarios")) ) {
				String resultado = "";
				try {
					Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
							"8f0wbbcv5g", "cZuVQlLRYW");
					Statement miStatement = miConexion.createStatement();

					ResultSet miResultset = miStatement.executeQuery(
							"SELECT * FROM usuarios where first_name = '" + nombre + "' and gender = '" + genero + "' and last_name = '"+apellido+"'" );

					int i = 0;

					while (miResultset.next()) {
						resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
								+ miResultset.getString("last_name") + " - " + miResultset.getString("gender") +" - "+miResultset.getString("user_id")+" - "+miResultset.getString("status") +"\n";
						i++;
					}

					in.mensaje("el numero de usuarios encontrados fue: " + i);
				} catch (Exception e) {
					System.out.println("NO SE PUDO CONECTAR" + e);
				}

				in.getPanel2().getResultados().setText(resultado);

			}

			if (!(apellido.equalsIgnoreCase("apellidos")) && (usuario.equalsIgnoreCase("usuarios")) && (nombre.equalsIgnoreCase("nombres")) && (genero.equalsIgnoreCase("genero")) )
			{
				String resultado = "";
				try {
					Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
							"8f0wbbcv5g", "cZuVQlLRYW");
					Statement miStatement = miConexion.createStatement();

					ResultSet miResultset = miStatement
							.executeQuery("SELECT * FROM usuarios where last_name = '" + apellido + "'");

					int i = 0;

					while (miResultset.next()) {
						resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
								+ miResultset.getString("last_name") + " - " + miResultset.getString("gender")  +" - "+miResultset.getString("user_id")+" - "+miResultset.getString("status") +"\n";
						i++;
					}

					in.mensaje("el numero de usuarios encontrados fue: " + i);
				} catch (Exception e) {
					System.out.println("NO SE PUDO CONECTAR" + e);
				}

				in.getPanel2().getResultados().setText(resultado);

			}

			if (!(genero.equalsIgnoreCase("genero")) && !(apellido.equalsIgnoreCase("apellidos")) && (usuario.equalsIgnoreCase("usuarios")) && (nombre.equalsIgnoreCase("nombres"))) {
				String resultado = "";
				try {
					Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
							"8f0wbbcv5g", "cZuVQlLRYW");
					Statement miStatement = miConexion.createStatement();

					ResultSet miResultset = miStatement.executeQuery("SELECT * FROM usuarios where last_name = '"
							+ apellido + "' and gender = '" + genero + "'");

					int i = 0;

					while (miResultset.next()) {
						resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
								+ miResultset.getString("last_name") + " - " + miResultset.getString("gender") +" - "+miResultset.getString("user_id")+" - "+miResultset.getString("status")+ "\n";
						i++;
					}

					in.mensaje("el numero de usuarios encontrados fue: " + i);
				} catch (Exception e) {
					System.out.println("NO SE PUDO CONECTAR" + e);
				}

				in.getPanel2().getResultados().setText(resultado);

			}
			
			
			if (!(usuario.equalsIgnoreCase("usuarios")) && (nombre.equalsIgnoreCase("nombres")) &&(genero.equalsIgnoreCase("genero")) && (apellido.equalsIgnoreCase("apellidos")))
			{
				String resultado = "";
				try {
					Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
							"8f0wbbcv5g", "cZuVQlLRYW");
					Statement miStatement = miConexion.createStatement();

					ResultSet miResultset = miStatement
							.executeQuery("SELECT * FROM usuarios where user_id = '" + usuario + "'");

					int i = 0;

					while (miResultset.next()) {
						resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
								+ miResultset.getString("last_name") + " - " + miResultset.getString("gender")  +" - "+miResultset.getString("user_id")+" - "+miResultset.getString("status") +"\n";
						i++;
					}

					in.mensaje("el numero de usuarios encontrados fue: " + i);
				} catch (Exception e) {
					System.out.println("NO SE PUDO CONECTAR" + e);
				}

				in.getPanel2().getResultados().setText(resultado);

			}

		}
	}



}
