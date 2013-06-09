<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Cadastro de Tarefa</title>
</head>
<body>
	<h3>Adicionar tarefas</h3>
	<form action="adicionarTarefa" method="post">
		ID: <input type="text" name="id" /><br />
		Descrição: <br />
		<textarea name="descricao" rows="5" cols="100"></textarea><br />
		<input type="submit" value="Adicionar" />
		<input type="reset" value="Limpar Campos"/>
	</form>
</body>
</html>