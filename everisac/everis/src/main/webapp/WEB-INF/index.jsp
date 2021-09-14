<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A</title>
</head>
<body>
	


	<h1>Primer jsp</h1>
	<h1><c:out value="${parametro1}"></c:out> </h1>
	<form action="/login" method="POST">
		<label for="email">Email</label>
		<input type="text" id="email" name="email" ><br><br>
		<label for="password">Password</label>
		<input type="text" id="password" name="password"><br><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>