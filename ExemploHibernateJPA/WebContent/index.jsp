<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="eventDAO" class="br.unisul.dao.EventDAO" />
	<table border="1" cellpadding="2" cellspacing="2">
		<tr bgcolor="green">
			<th colspan="3"><fmt:message key="tabela.titulo" />
			</th>
		</tr>
		<tr bgcolor="yellow">
			<th><fmt:message key="tabela.event" />
			</th>
			<th><fmt:message key="tabela.date" />
			</th>
			<th><fmt:message key="tabela.formated" />
			</th>
		</tr>
		<c:forEach var="event" items="${eventDAO.list}">
			<tr>
				<td>${event.title}</td>
				<td>${event.data}</td>
				<td align="center" bgcolor="cyan"><fmt:formatDate
						value="${event.data}" pattern="dd/MM/yyyy" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>