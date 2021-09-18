<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table>
		<tr>
			<td colspan="4"><center><h1><b>Documento de pago</b></h1></center></td>
		</tr>
		
		<tr>
			<td colspan="4"><c:out value="${fecha}"></c:out></td>
		</tr>
		
		<tr>
          <td colspane="2"><label>Sr o Sr.es :</label></td>
          <td colspane="2"><c:out value="${nombres}"></c:out><c:out value="${apellidos}"></c:out></td>
          </tr>

		<tr>
              <td  colspane="4"><label>solicita producto : Hardware-Software</label></td>
               </tr>

		<tr>
			<td colspan="3">Genero:</td>
			<td><c:out value="${genero}"></c:out></td>
		</tr>

		

		<tr>
			<td colspan="3"><label>Tipo de productos a comprar:</label></td>
		</tr>

		<tr>
           <td><label>Producto</label></td>
           <td><label>Cantidad</label></td>
            <td><label>Precio Unit</label></td>
           <td><label>Subtotal</label></td>
        </tr>

		<tr>
             <td><c:out value="${lista1}"></c:out></td>
             <td><c:out value="${producto1}"></c:out></td>
             <td><c:out value="${producto11}"></c:out></td>
             <td><c:out value="${subtotal1}"></c:out></td>
             
         </tr>
         
         <tr>
             <td><c:out value="${lista2}"></c:out></td>
             <td><c:out value="${producto2}"></c:out></td>
             <td><c:out value="${producto22}"></c:out></td>
              <td><c:out value="${subtotal2}"></c:out></td>
             
         </tr>
         
         <tr>
             <td><c:out value="${lista3}"></c:out></td>
             <td><c:out value="${producto3}"></c:out></td>
             <td><c:out value="${producto33}"></c:out></td>
              <td><c:out value="${subtotal3}"></c:out></td>
             
         </tr>
         
         <tr>
             <td><c:out value="${lista4}"></c:out></td>
             <td><c:out value="${producto4}"></c:out></td>
             <td><c:out value="${producto44}"></c:out></td>
              <td><c:out value="${subtotal4}"></c:out></td>
             
         </tr>
         
         <tr>
             <td><c:out value="${lista5}"></c:out></td>
             <td><c:out value="${producto5}"></c:out></td>
             <td><c:out value="${producto55}"></c:out></td>
             <td><c:out value="${subtotal5}"></c:out></td>
             
         </tr>
         
         <tr>
             <td><c:out value="${lista6}"></c:out></td>
             <td><c:out value="${producto6}"></c:out></td>
             <td><c:out value="${producto66}"></c:out></td>
              <td><c:out value="${subtotal6}"></c:out></td>
             
         </tr>
         
         <tr>
             <td><c:out value="${lista7}"></c:out></td>
             <td><c:out value="${producto7}"></c:out></td>
             <td><c:out value="${producto77}"></c:out></td>
              <td><c:out value="${subtotal7}"></c:out></td>
             
         </tr>
         
         
         <tr>
             <td><c:out value="${lista8}"></c:out></td>
             <td><c:out value="${producto8}"></c:out></td>
             <td><c:out value="${producto88}"></c:out></td>
              <td><c:out value="${subtotal8}"></c:out></td>
             
         </tr>
         
         <tr>
             <td><c:out value="${lista9}"></c:out></td>
             <td><c:out value="${producto9}"></c:out></td>
             <td><c:out value="${producto99}"></c:out></td>
              <td><c:out value="${subtotal9}"></c:out></td>
             
         </tr>
         
         
         <tr>
             <td><c:out value="${lista10}"></c:out></td>
             <td><c:out value="${producto10}"></c:out></td>
             <td><c:out value="${producto101}"></c:out></td>
              <td><c:out value="${subtotal10}"></c:out></td>
             
         </tr>
		
		
		 <tr>
		     <td></td>
		     <td></td>
             <td ><label>total=</label></td>
             <td ><c:out value="${total}"></c:out></td>
             
             
         </tr>
         
          <tr>
              <td></td>
		     <td></td>
             <td colspane="2"><label>IGV 18%=</label></td>
             <td colspane="2"><c:out value="${igv}"></c:out></td>
             
             
         </tr>
         
         
          <tr>
             <td></td>
		     <td></td>
             <td colspane="2"><label>Neto a pagar=</label></td>
             <td colspane="2"><c:out value="${totalFinal}"></c:out></td>
             
             
         </tr>
         
         <tr>
             <td colspane="2"><label>Observaciones:</label></td>
             <td colspane="2"><c:out value="${observaciones}"></c:out></td>
         </tr>
         
         <tr>
             <td colspane="2"><button class="enlace" role="link" onclick="window.location='http://localhost:8081/parcialPractico2.1/Vista1.jsp'">Terminar y regresar</button></td>
             <td colspane="2"><input type="button" name="imprimir" value="imprimir" onclick="window.print(); "></td>
         </tr>
	

</table>

</body>
</html>