package controlador;

import java.io.IOException;
import java.util.Date;

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
		
        doGet(request, response);
		response.setContentType("text/html");
		
		String nombres = request.getParameter("nombres");
		request.setAttribute("nombres", nombres );
		String apellidos = request.getParameter("apellidos");
		request.setAttribute("apellidos", apellidos);
		String genero = request.getParameter("genero");
		request.setAttribute("genero", genero);
		
		String monitor = request.getParameter("lista1");
		request.setAttribute("lista1", monitor);
		String cantidadM = request.getParameter("producto1");
		request.setAttribute("producto1", cantidadM);
		String precioM = request.getParameter("producto11");
		request.setAttribute("producto11", precioM);
		double a = Double.parseDouble(cantidadM);
		double b = Double.parseDouble(precioM);
		double subtotal1 = a*b;
		request.setAttribute("subtotal1", subtotal1);
		
		String impresora = request.getParameter("lista2");
		request.setAttribute("lista2", impresora);
		String cantidadI = request.getParameter("producto2");
		request.setAttribute("producto2", cantidadI);
		String precioI = request.getParameter("producto22");
		request.setAttribute("producto22", precioI);
		double c = Double.parseDouble(cantidadI);
		double d = Double.parseDouble(precioI);
		double subtotal2 = c*d;
		request.setAttribute("subtotal2", subtotal2);
		
		String mouse = request.getParameter("lista3");
		request.setAttribute("lista3", mouse);
		String cantidadMo = request.getParameter("producto3");
		request.setAttribute("producto3", cantidadMo);
		String precioMo = request.getParameter("producto33");
		request.setAttribute("producto33", precioMo);
		double e = Double.parseDouble(cantidadMo);
		double f = Double.parseDouble(precioMo);
		double subtotal3 = e*f;
		request.setAttribute("subtotal3", subtotal3);
		
		String DiscoDuro = request.getParameter("lista4");
		request.setAttribute("lista4", DiscoDuro);
		String cantidadD = request.getParameter("producto4");
		request.setAttribute("producto4", cantidadD);
		String precioD = request.getParameter("producto44");
		request.setAttribute("producto44", precioD);
		double g = Double.parseDouble(cantidadD);
		double h = Double.parseDouble(precioD);
		double subtotal4 = g*h;
		request.setAttribute("subtotal4", subtotal4);
		
		String teclado = request.getParameter("lista5");
		request.setAttribute("lista5", teclado);
		String cantidadT = request.getParameter("producto5");
		request.setAttribute("producto5", cantidadT);
		String precioT = request.getParameter("producto55");
		request.setAttribute("producto55", precioT);
		double i = Double.parseDouble(cantidadT);
		double j = Double.parseDouble(precioT);
		double subtotal5 = i*j;
		request.setAttribute("subtotal5", subtotal5);
		
		String LectoraDVD = request.getParameter("lista6");
		request.setAttribute("lista6", LectoraDVD);
		String cantidadL = request.getParameter("producto6");
		request.setAttribute("producto6", cantidadL);
		String precioL = request.getParameter("producto66");
		request.setAttribute("producto66", precioL);
		double k = Double.parseDouble(cantidadL);
		double n = Double.parseDouble(precioL);
		double subtotal6 = k*n;
		request.setAttribute("subtotal6", subtotal6);
		
		String licenciaLo = request.getParameter("lista7");
		request.setAttribute("lista7", licenciaLo);
		String cantidadLo = request.getParameter("producto7");
		request.setAttribute("producto7", cantidadLo);
		String precioLo = request.getParameter("producto77");
		request.setAttribute("producto77", precioLo);
		double x = Double.parseDouble(cantidadLo);
		double z = Double.parseDouble(precioLo);
		double subtotal7 = x*z;
		request.setAttribute("subtotal7", subtotal7);
		
		String antivirus = request.getParameter("lista8");
		request.setAttribute("lista8", antivirus);
		String cantidadAA = request.getParameter("producto8");
		request.setAttribute("producto8", cantidadAA);
		String precioAA = request.getParameter("producto88");
		request.setAttribute("producto88", precioAA);
		double y = Double.parseDouble(cantidadAA);
		double v = Double.parseDouble(precioAA);
		double subtotal8 = y*v;
		request.setAttribute("subtotal8", subtotal8);
		
		String licenciaK = request.getParameter("lista9");
		request.setAttribute("lista9", licenciaK);
		String cantidadLk = request.getParameter("producto9");
		request.setAttribute("producto9", cantidadLk);
		String precioLk = request.getParameter("producto99");
		request.setAttribute("producto99", precioLk);
		double aa = Double.parseDouble(cantidadLk);
		double bb = Double.parseDouble(precioLk);
		double subtotal9 = aa*bb;
		request.setAttribute("subtotal9", subtotal9);
		
		String licenciaAn = request.getParameter("lista10");
		request.setAttribute("lista10", licenciaAn);
		String cantidadLA = request.getParameter("producto10");
		request.setAttribute("producto10", cantidadLA);
		String precioLA = request.getParameter("producto101");
		request.setAttribute("producto101", precioLA);
		double ab = Double.parseDouble(cantidadLA);
		double ba = Double.parseDouble(precioLA);
		double subtotal10 = ab*ba;
		request.setAttribute("subtotal10", subtotal10);
		
		double total = subtotal1 + subtotal2 + subtotal3 + subtotal4 + subtotal5 + subtotal6 + subtotal7 + subtotal8 + subtotal9 + subtotal10 ;
		request.setAttribute("total", total);
		
		double igv = (total/100)*18;
		request.setAttribute("igv", igv);
		
		double totalFinal = total + igv;
		request.setAttribute("totalFinal", totalFinal);
		
		String observaciones = request.getParameter("observaciones");
		request.setAttribute("observaciones", observaciones);
		
		Date fecha = new Date();
		request.setAttribute("fecha", fecha);
		
		request.getRequestDispatcher("/Vista2.jsp").forward(request, response);
		
	
	    
	}

}
