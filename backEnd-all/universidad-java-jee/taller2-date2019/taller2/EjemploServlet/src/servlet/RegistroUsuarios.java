package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.modelo;

/**
 * Servlet implementation class RegistroUsuarios
 */
@WebServlet("/RegistroUsuarios")
public class RegistroUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html;charset=ISO-8859-1");
		
		
        modelo obj = new modelo();
       
		String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		obj.setNombre(request.getParameter("nombres"));
		obj.getNombre();
		obj.setApellido(request.getParameter("apellidos"));
		obj.setArticulo(request.getParameter("articulos"));
		obj.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
		obj.setPrecio(Double.parseDouble(request.getParameter("precio")));
		obj.setTarjetaCredito(request.getParameter("tarjeta"));
		obj.setNumTarjeta(request.getParameter("numero"));
		obj.setFecha(fecha);
		obj.calculo();
		request.setAttribute("objeto", obj);
		
		RequestDispatcher a = request.getRequestDispatcher("/RegistroUsuarios2.jsp");
		a.forward(request, response);
		
		
	}

}
