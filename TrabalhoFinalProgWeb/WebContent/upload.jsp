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
	<form action="login_teste.jsp" method="post" enctype="multipart/form-data">
		Nome: <input type="text" name="nome"/><br />
		Imagem: <input type="file" id="imagem" name="imagem" accept="image/jpeg; image/gif; image/bmp; image/png"/><br />
		<input type="submit" value="Enviar"/>
	</form>
</body>
</html>