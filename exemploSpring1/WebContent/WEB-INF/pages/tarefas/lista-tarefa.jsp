<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>ID</th>
			<th>Descrição</th>
			<th>Finalizado?</th>
			<th>Data Finalização</th>
		</tr>
		<tr>
			<td>${tarefa.id}</td>
			<td>${tarefa.descricao}</td>
			<td>${tarefa.finalizado}</td>
			<td>${tarefa.dataFinalizacao}</td>
			<td><a href="mostrarTarefa?id=${tarefa.id}">Atualizar</a></td>
		</tr>
	</table>
</body>
</html>