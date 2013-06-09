<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Exemplo de Página JSP</title>
</head>
<body>
	<%-- Comentário em JSP: criando algumas mensagens --%>
	<% 
		String mensagem = "Alguma coisa...";
	%>
	
	<% out.println(mensagem); %>

	<%
		String desenvolvido = "Por mim mesmo.";
	%>
	
	<%-- Mensagem que aparece no console do Servidor --%>
	<% System.out.println("Tudo foi executado!"); %>
</body>
</html>