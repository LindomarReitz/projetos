<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />	

	<jsp:useBean id="contato" class="br.com.caelum.contato.Contato" />
	
	<table border="2" align="center">
		<tr>
			<td>${contato.nome}</td>
			<!-- Verificar se o E-Mail não está vazio -->
<!--			<c:if test="${not empty contato.email}">-->
<!--				<a href="mailto:${contato.email}">${contato.email}</a>-->
<!--			</c:if>-->
			
			<!-- Semelhante ao switch/case no Java, onde otherwise é o default -->
			<c:choose>
				<c:when test="${not empty contato.email}">
					<a href="mailto:${contato.email}">${contato.email}</a>
				</c:when>
				<c:otherwise>
					E-mail não informado.
				</c:otherwise>
			</c:choose>
			
			<td>${contato.email}</td>
			<td>${contato.endereco}</td>
			<!-- Formatando a data, o time na EL representa o método getTime() -->
			<fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" />
		</tr>
	</table>
	
	<c:import url="rodape.jsp" />
</body>
</html>