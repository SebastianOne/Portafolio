<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="matrix.gif">

<%
Connection miConexion;
String url="jdbc:mysql://remotemysql.com:3306/8f0wbbcv5g";
String driver="com.mysql.jdbc.Driver";
String usuario="8f0wbbcv5g";
String clave="cZuVQlLRYW";
Class.forName(driver);
miConexion= DriverManager.getConnection(url,usuario,clave);
PreparedStatement miStatement;
ResultSet miResulset;
miStatement=miConexion.prepareStatement("SELECT * FROM usuarios");
miResulset = miStatement.executeQuery();
%>
<%!ArrayList<String> apellidos = new ArrayList<String>(); %>
<%!ArrayList<String> nombres = new ArrayList<String>(); %>
<%!ArrayList<String> usuarios = new ArrayList<String>();%>

<%while (miResulset.next()) 
{
%>
	<%nombres.add(miResulset.getString("first_name"));%>
	<%usuarios.add(miResulset.getString("user_id"));%>
	<%apellidos.add(miResulset.getString("last_name"));%>
<%} %>

<%for (int i = 0; i < nombres.size(); i++) {%>
			<%for (int j = nombres.size() - 1; j > 0; j--) {%>
				<%if (i != j) {%>
					<%if (nombres.get(i).equalsIgnoreCase(nombres.get(j))) {%>
						<%nombres.remove(j);%>
					<%}%>
				<%}%>

			<%}%>

		<%}%>
		
		
<%for (int i = 0; i < apellidos.size(); i++) {%>
			<%for (int j = apellidos.size() - 1; j > 0; j--) {%>
				<%if (i != j) {%>
					<%if (apellidos.get(i).equalsIgnoreCase(apellidos.get(j))) {%>
						<%apellidos.remove(j);%>
					<%}%>
				<%}%>

			<%}%>

		<%}%>

	<form action="Controlador" name="Formulario"  id="Formulario" method="post">


    <h2 style="color:MEDIUMSEAGREEN;"><center>PROYECTO JUAN SEBASTIAN RUEDA RODRIGUEZ</h2>
    <h3 style="color:MEDIUMSEAGREEN;"><center>Consulta De La Base De Datos</h3>
    <br>
	<table align="center">
		
         
		<tr>
		    
		    <td><select name="usuarios" id="usuarios">
		    <option>Usuarios</option>
		    <% for(int i = 0; i<usuarios.size(); i++){ %>
			<option><%=usuarios.get(i)%></option>
            <%} %>
		    </select></td>
		    
		     <td><select name="nombres" id="nombres" >
		      <option>Nombres</option>
		    <% for(int i = 0; i<nombres.size(); i++){ %>
			<option ><%=nombres.get(i)%></option>
            <%} %>
		    </select></td>
		    
			
			<td><select name="apellidos" id="apellidos">
			 <option>Apellidos</option>
			<% for(int i = 0; i<apellidos.size(); i++){ %>
			<option><%=apellidos.get(i)%></option>
            <%} %>
			
			</select></td>
			
			<td><select name="genero" id="genero">
			 <option>Genero</option>
			<option>Female</option>
			<option>Male</option>
			</select></td>
		
			</tr>  
			
			<tr><td></td> <td></td> <td></td> <td></td> </tr>
			<tr><td></td> <td></td> <td></td> <td></td> </tr>
			<tr><td></td> <td></td> <td></td> <td></td> </tr>
			
			<tr>
            <td colspan="4"><center><textarea cols="60"rows="5"><c:out value="${resultado}"></c:out></textarea></center></td>
		    </tr>
		    
		    <tr><td></td> <td></td> <td></td> <td></td> </tr>
			<tr><td></td> <td></td> <td></td> <td></td> </tr>
			<tr><td></td> <td></td> <td></td> <td></td> </tr>
			
		<tr>
			<td colspan="4"><center><input type="submit" value="consultar"></center></td>
		</tr>

	</table>
</form>
</body>
</html>


