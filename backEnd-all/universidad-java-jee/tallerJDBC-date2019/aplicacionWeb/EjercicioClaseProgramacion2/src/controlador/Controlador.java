package controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/Controlador")
public class Controlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		
		String nombres = request.getParameter("nombres");
		request.setAttribute("nombres", nombres);
		
		String apellidos = request.getParameter("apellidos");
		request.setAttribute("apellidos", apellidos);
		
		String usuarios = request.getParameter("usuarios");
		request.setAttribute("usuarios", usuarios);
		
		String genero = request.getParameter("genero");
		request.setAttribute("genero", genero);
		
		String resultado = "";
		
		if(!(nombres.equalsIgnoreCase("nombres")) && (usuarios.equalsIgnoreCase("usuarios")) && (genero.equalsIgnoreCase("genero")) && (apellidos.equalsIgnoreCase("apellidos"))) 
		{
			try {
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
						"8f0wbbcv5g", "cZuVQlLRYW");
				Statement miStatement = miConexion.createStatement();

				ResultSet miResultset = miStatement.executeQuery(
						"SELECT * FROM usuarios where first_name = '" + nombres+"'" );

				int i = 0;

				while (miResultset.next()) 
				{
					resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
							+ miResultset.getString("last_name") + " - " + miResultset.getString("gender") +" - "+  miResultset.getString("user_id")+" - "+miResultset.getString("status")+ "\n";
					i++;
				}

			} catch (Exception e) {
				System.out.println("NO SE PUDO CONECTAR" + e);
			}

		}
		
		
		
		
		if (!(nombres.equalsIgnoreCase("nombres")) && !(genero.equalsIgnoreCase("genero")) && (usuarios.equalsIgnoreCase("usuarios")) &&   (apellidos.equalsIgnoreCase("apellidos")) ) {
			
			try {
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
						"8f0wbbcv5g", "cZuVQlLRYW");
				Statement miStatement = miConexion.createStatement();

				ResultSet miResultset = miStatement.executeQuery(
						"SELECT * FROM usuarios where first_name = '" + nombres + "' and gender = '" + genero + "'");

				int i = 0;

				while (miResultset.next()) {
					resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
							+ miResultset.getString("last_name") + " - " + miResultset.getString("gender") +" - "+miResultset.getString("user_id")+" - "+miResultset.getString("status") +"\n";
					i++;
				}

				
			} catch (Exception e) {
				System.out.println("NO SE PUDO CONECTAR" + e);
			}


		}
		
		if (!(nombres.equalsIgnoreCase("nombres")) && !(genero.equalsIgnoreCase("genero")) && !(apellidos.equalsIgnoreCase("apellidos")) && (usuarios.equalsIgnoreCase("usuarios")) ) {
			
			try {
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
						"8f0wbbcv5g", "cZuVQlLRYW");
				Statement miStatement = miConexion.createStatement();

				ResultSet miResultset = miStatement.executeQuery(
						"SELECT * FROM usuarios where first_name = '" + nombres + "' and gender = '" + genero + "' and last_name = '"+apellidos+"'" );

				int i = 0;

				while (miResultset.next()) {
					resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
							+ miResultset.getString("last_name") + " - " + miResultset.getString("gender") + " - "+miResultset.getString("user_id")+" - "+miResultset.getString("status") +"\n";
					i++;
				}

				
			} catch (Exception e) {
				System.out.println("NO SE PUDO CONECTAR" + e);
			}


		}

		if (!(apellidos.equalsIgnoreCase("apellidos")) && (usuarios.equalsIgnoreCase("usuarios")) && (nombres.equalsIgnoreCase("nombres")) && (genero.equalsIgnoreCase("genero"))  )
		{
			
			try {
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
						"8f0wbbcv5g", "cZuVQlLRYW");
				Statement miStatement = miConexion.createStatement();

				ResultSet miResultset = miStatement
						.executeQuery("SELECT * FROM usuarios where last_name = '" + apellidos + "'");

				int i = 0;

				while (miResultset.next()) {
					resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
							+ miResultset.getString("last_name") + " - " + miResultset.getString("gender")  +" - "+miResultset.getString("user_id")+" - "+miResultset.getString("status") +"\n";
					i++;
				}

				
			} catch (Exception e) {
				System.out.println("NO SE PUDO CONECTAR" + e);
			}

		}

		
		
		if (!(genero.equalsIgnoreCase("genero")) && !(apellidos.equalsIgnoreCase("apellidos")) && (usuarios.equalsIgnoreCase("usuarios")) && (nombres.equalsIgnoreCase("nombres"))) {
			
			try {
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
						"8f0wbbcv5g", "cZuVQlLRYW");
				Statement miStatement = miConexion.createStatement();

				ResultSet miResultset = miStatement.executeQuery("SELECT * FROM usuarios where last_name = '"
						+ apellidos + "' and gender = '" + genero + "'");

				int i = 0;

				while (miResultset.next()) {
					resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
							+ miResultset.getString("last_name") + " - " + miResultset.getString("gender") + " - "+miResultset.getString("user_id")+" - "+miResultset.getString("status")+ "\n";
					i++;
				}

				
			} catch (Exception e) {
				System.out.println("NO SE PUDO CONECTAR" + e);
			}
		}
		
		
		if (!(usuarios.equalsIgnoreCase("usuarios")) && (nombres.equalsIgnoreCase("nombres")) &&(genero.equalsIgnoreCase("genero")) && (apellidos.equalsIgnoreCase("apellidos")))
		{
			
			try {
				Connection miConexion = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g",
						"8f0wbbcv5g", "cZuVQlLRYW");
				Statement miStatement = miConexion.createStatement();

				ResultSet miResultset = miStatement
						.executeQuery("SELECT * FROM usuarios where user_id = '" + usuarios + "'");

				int i = 0;

				while (miResultset.next()) {
					resultado += "REGISTRO " + (i + 1) + ": " + miResultset.getString("first_name") + " - "
							+ miResultset.getString("last_name") + " - " + miResultset.getString("gender")  +" - "+miResultset.getString("user_id")+" - "+miResultset.getString("status") +"\n";
					i++;
				}

			
			} catch (Exception e) {
				System.out.println("NO SE PUDO CONECTAR" + e);
			}
		}
		
		
		if (!(usuarios.equalsIgnoreCase("usuarios")) && !(nombres.equalsIgnoreCase("nombres")) && !(genero.equalsIgnoreCase("genero")) && !(apellidos.equalsIgnoreCase("apellidos")))
		{
			resultado = "no puede escoger un usuario con nombres, apellidos y genero seleccionados. Solo puede escoger el usuario deceado";
		}
		
		if (!(usuarios.equalsIgnoreCase("usuarios")) && !(nombres.equalsIgnoreCase("nombres")) && !(genero.equalsIgnoreCase("genero")) && (apellidos.equalsIgnoreCase("apellidos")))
		{
			resultado = "no puede escoger un usuario con nombres, apellidos y genero seleccionados. Solo puede escoger el usuario deceado";
		}
		
		if (!(usuarios.equalsIgnoreCase("usuarios")) && !(nombres.equalsIgnoreCase("nombres")) && (genero.equalsIgnoreCase("genero")) && (apellidos.equalsIgnoreCase("apellidos")))
		{
			resultado = "no puede escoger un usuario con nombres, apellidos y genero seleccionados. Solo puede escoger el usuario deceado";
		}
		
		
	
		

		request.setAttribute("resultado", resultado);
		
		request.getRequestDispatcher("/VentanaPrincipal.jsp").forward(request, response);
		
	}

}
