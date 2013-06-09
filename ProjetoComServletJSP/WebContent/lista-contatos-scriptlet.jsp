<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.caelum.contato.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title></title>
</head>
<body>
	<table title="Lista de contatos" border="2" align="center">
		<%
			Contato contato = new Contato();
			contato.setNome("Lindomar");
			contato.setEmail("lindomar@making.com.br");
			contato.setEndereco("rua 13, lote 2, quadra P");
			
			String dataTexto = "19/01/1992";
			Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataTexto);
			Calendar nascimento = Calendar.getInstance();
			nascimento.setTime(data);
			
			contato.setDataNascimento(nascimento);
		%>
		
		<tr>
			<td><%= contato.getNome() %></td>
		</tr>
		
		<tr title="E-Mail">
			<td><%= contato.getEmail() %></td>
		</tr>
		
		<tr title="Endereco">
			<td><%= contato.getEndereco() %></td>
		</tr>
		
		<tr title="Data de nascimento">
			<td><%= contato.getDataNascimento() %></td>
		</tr>
	</table>
</body>
</html>