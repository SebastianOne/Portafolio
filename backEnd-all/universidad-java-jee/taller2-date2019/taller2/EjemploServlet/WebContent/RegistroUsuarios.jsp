
<%@page import="modelo.modelo"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>validacion compra</title>
</head>
<body>

<form action="RegistroUsuarios" method="post">

	
<table>
		<tr>
			<td><label>Articulo:</label></td>
			<td><select name="articulos">
		        <option selected value="0">Elige una opcion</option>
		        <option value="1">zapatos</option>
		        <option value="2">camisa</option>
		        <option value="3">reloj</option>
		        <option value="4">libro</option>
		        <option value="5">computadora</option>
                </select>
            </td>
        </tr>

        <tr>
        	<td><label>Cantidad:</label></td>
        	<td><input type="text" name="cantidad" size="20" required autofocus placeholder="escribe numeros"></td>
        </tr>

        <tr>
        	<td><label>Precio por unidad:</label></td>
        	<td><input type="text" name="precio" size="20" required autofocus placeholder="escribe numeros"></td>
        	
        </tr>

        <tr>
        	<td><label>Nombres del cliente:</label></td>
        	<td><input type="text" name="nombres" size="20"></td>
        	
        </tr>


        <tr>
        	<td><label>Apellidos del cliente:</label></td>
        	<td><input type="text" name="apellidos" size="20"></td>
        	
        </tr>


        <tr>
        	<td colspan="2">
        		<label>Tarjeta de credito:</label><br>                
                <input type="radio" name="tarjeta" value="visa">Visa<br>
                <input type="radio" name="tarjeta" value="MasterCard">MasterCard<br>
                <input type="radio" name="tarjeta" value="American">American Express<br>
        	</td>
        </tr>


        <tr>
        	<td><label>Numero de tarjeta de credito:</label></td>
        	<td><input type="text" name="numero" id="valor1" size="40" required autofocus placeholder="escribe numeros"></td>
        	
        </tr>

        <tr>
        	<td><label>Confirmar numero  de tarjeta de credito:</label></td>
        	<td><input type="text" name="numero1" id="valor2" size="40" required autofocus placeholder="escribe numeros">
</td>
        	
        </tr>

       
         

       

        <tr>
        	<td ><input type="submit" value="Confirmar compra"></td>  
        	      
        </tr>


	</table>
	

    
 
	
	
</form>

</body>
</html>