<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<title>Actividad Formativa</title>
</head>
<body>

	<hr>
	<h3>Formulario de Actividad</h3>
	<form action="/formulario" method="POST">
	  <label for="nombre">Nombre:</label>
	  <input type="text" id="nombre" name="nombre" value="<c:out value="${nombre}"></c:out>" ><br><br>
	  <span><c:out value="${mensajeNombre}"></c:out></span><br><br>
	  
	  <label for="apellido">Apellido</label>
	  <input type="text" id="apellido" name="apellido" value="<c:out value="${apellido}"></c:out>" ><br><br>
	  <span><c:out value="${mensajeApellido}"></c:out></span><br><br>
	  
	  <label for="limite">Límite</label>
	  <input type="text" id="limite" name="limite" value="<c:out value="${limite}"></c:out>"><br><br>
	  <span><c:out value="${mensajeLimite}"></c:out></span><br><br>
	  
	  <label for="limite">Código Postal</label>
	  <input type="text" id="codigopostal" name="codigopostal" value="<c:out value="${codigopostal}"></c:out>"><br><br>
	  <span><c:out value="${mensajeCodigopostal}"></c:out></span><br><br><br>
	  <hr>
	  <input type="submit" value="Enviar">
	</form>
</body>
</html>