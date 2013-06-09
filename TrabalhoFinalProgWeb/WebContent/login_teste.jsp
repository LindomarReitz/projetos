<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Authentication and Authorization Using Filters</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	Bem-vindo a área de login do sistema!
	<br>
	<br>
	<font color="red"><c:out value="${ERROR}"></c:out></font>

	<form action="UserLogin" method="POST">
		<input type="hidden" name="next" value="${param.next}">
		Login: <input type="text" name="login"/> <br>
		Senha: <input type="password" name="passwd" /> 
		<input type="submit" value="Enviar">
	</form>
</body>
</html>