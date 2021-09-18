<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="script.js"></script>
<meta charset="ISO-8859-1">
<title>CAJERO</title>
</head>
<body>
	<form action="Controlador" name="formulario" id="formulario" method="post"  >
	<table>
		<tr>
			<td colspan="3"><h1><b><label>COMPROBANTE DE VENTA</label></b></h1></td>
		</tr>
		<tr>
			<td><label>Nombres:</label></td>
			<td colspan="2"><input type="text" name="nombres" id="nombres" size="50" required autofocus placeholder="escriba nombres" ></td>
		</tr>

		<tr>
			<td><label>Apellidos:</label></td>
			<td colspan="2"><input type="text" name="apellidos" id="apellidos" size="50" required autofocus placeholder="escriba apellidos"></td>
		</tr>

		<tr>
			<td colspan="3">Genero:</td>
		</tr>

		<tr>
			<td><input type="radio" name="genero" id="genero" value="masculino">Masculino</td>
			<td><input type="radio" name="genero" id="genero" value="femenino">Femenino</td>
		</tr>

		<tr>
			<td colspan="3"><label>Tipo de productos a comprar:</label></td>
		</tr>

		<tr>
			<td><label><input type="checkbox" name="caja1" id="caja1" >Hadware</label></td>
			<td><label><input type="checkbox" name="caja2" id="caja2" >Software</label></td>

		</tr>

		<tr>
			<td><label>PRODUCTO</label></td>
			<td><label>CANTIDAD</label></td>
			<td><label>PRECIO UNIT $</label></td>
		</tr>

		<tr >
			<td><select name="lista1" id="lista1" ><option selected>Monitor</option></select></td>
			<td><input type="number" size="20" name="producto1" id="producto1" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto11" id="producto11" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		<tr >
			<td><select name="lista2" id="lista2" ><option selected>Impresora</option></select></td>
			<td><input type="number" size="20" name="producto2"id="producto2" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" id="producto22" name="producto22" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		<tr  >
			<td><select name="lista3" id="lista3"><option selected>Mouse</option></select></td>
			<td><input type="number" size="20" name="producto3" id="producto3" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto33" id="producto33" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		<tr >
			<td><select name="lista4" id="lista4" ><option selected>Disco duro</option></select></td>
			<td><input type="number" size="20" name="producto4" id="producto4" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto44" id="producto44" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		<tr >
			<td><select name="lista5" id="lista5"><option selected>Teclado</option></select></td>
			<td><input type="number" size="20" name="producto5" id="producto5" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto55" id="producto55" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		<tr >
			<td><select name="lista6" id="lista6" ><option selected>Lectora DVD</option></select></td>
			<td><input type="number" size="20" name="producto6" id="producto6" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto66" id="producto66" required autofocus placeholder="escriba precio" ></td>
		</tr>
		
		<tr>
			<td><select name="lista7" id="lista7" ><option selected>Licencia office 365</option></select></td>
			<td><input type="number" size="20" name="producto7" id="producto7" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto77" id="producto77" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		<tr >
			<td><select name="lista8" id="lista8"><option selected>Antivirus Mcaffe LiveSafe</option></select></td>
			<td><input type="number" size="20"  name="producto8" id="producto8" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto88" id="producto88" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		<tr >
			<td><select name="lista9" id="lista9"><option selected>Licencia Kaspersky</option></select></td>
			<td><input type="number" size="20" name="producto9" id="producto9" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto99" id="producto99" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		<tr >
			<td><select name="lista10" id="lista10" ><option selected>Licencia Avast</option></select></td>
			<td><input type="number" size="20" name="producto10" id="producto10" required autofocus placeholder="escriba cantidad"></td>
			<td><input type="number" size="20" name="producto101" id="producto101" required autofocus placeholder="escriba precio"></td>
		</tr>
		
		
		<tr>
			<td><label>Tipo de comprobante de pago:</label></td>
			
		</tr>
		
		<tr>
			<td><input type="radio" name="pago" value="boleta" id="boleta">Boleta</td>
			<td><input type="radio" name="pago" value="factura" id="factura">Factura</td>
		</tr>
		
		<tr>
			<td><label>Observaciones:</label></td>
			<td><input type="text" name="observaciones"  id="observaciones" required autofocus placeholder="escriba observaciones"></td>
		</tr>
		
		<tr>
			<td><input type="submit"   value="enviar" ></td>
			<td><button onclick="limpiar()">Reestablecer</button></td>
		</tr>

	</table>
</form>
</body>
</html>