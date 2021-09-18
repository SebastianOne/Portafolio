<%@page import="modelo.modelo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compra validada</title>
</head>
<body>
<%
   modelo obj=new modelo();
   obj=(modelo)request.getAttribute("objeto");
      
   if(obj != null){
	   out.println("señor usuario:" + obj.getNombre()+" " + obj.getApellido()+"<br>");
	   out.println("");
	   out.println("su compra fue realizada satisfactoriamente por el valor de $"+obj.calculo()+" correspondiente a " + obj.getCantidad()+" "+ obj.getArticulo()+"<br>");
	   out.println("");
	   out.println("el precio por unidad fue de: $" + obj.getPrecio()+"<br>");
	   out.println("");
	   out.println("la compra fue realizada con la tarjeta de credito numero: " + obj.getNumTarjeta()+ "de la franquicia "+ obj.getTarjetaCredito()+"."+ "fecha de la compra :"+obj.getFecha() + "<br>");
	   out.println("<a href=\"http://localhost:8081/taller2/RegistroUsuarios.jsp\"> Realizar otra compra</a>");
	   
	  
	   
   }
   
   %>
   

</body>
</html>