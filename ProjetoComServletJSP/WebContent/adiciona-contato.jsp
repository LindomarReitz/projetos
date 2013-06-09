<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="calendario"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link type="text/css"
	href="css/custom-theme/jquery-ui-1.8.21.custom.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="js/jquery-ui-1.8.21.custom.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Adiconar Contatos</title>
</head>
<body>
	<c:import url="cabecalho.jsp" />

	 Criando um simples formulário para a gravação de contatos 
		<form action="adicionaContato" method="post">
			Nome: <input type="text" name="nome"/><br />
			E-mail: <input type="text" name="email"/><br />
			Endereço: <input type="text" name="endereco"/><br />
			Data Nascimento: <input type="text" name="dataNascimento"/><br />
<!--	 Trocando o input pela tag personalizada para mostrar um calendário -->
			Data Nascimento: <calendario:campoData id="dataNascimento"/>
			
			<input type="submit" value="Gravar"/>
		</form>
	
<!--	<script>-->
<!--			$(function() {-->
<!--				$(".demo button:first" ).button({-->
<!--		            icons: {-->
<!--		                primary: "ui-icon-locked"-->
<!--		            },-->
<!--		            text: false-->
<!--		        }).next().button({-->
<!--		            icons: {-->
<!--		                primary: "ui-icon-star"-->
<!--		            },-->
<!--		            text: false-->
<!--		        }).next().button({-->
<!--		            icons: {-->
<!--		                primary: "ui-icon-gear",-->
<!--		                secondary: "ui-icon-triangle-1-s"-->
<!--		            }-->
<!--		        }).next().button({-->
<!--		            icons: {-->
<!--		                primary: "ui-icon-gear",-->
<!--		                secondary: "ui-icon-triangle-1-s"-->
<!--		            },-->
<!--		            text: false-->
<!--		        });-->
<!--			});-->
<!--	</script>-->
<!--	<form action="">-->
<!--		<div class="demo">-->
<!--			<table>-->
<!--				<tr>-->
<!--					<td><button style="size: 10px">Button with icon only</button></td>-->
<!--					<td><button>Favorito</button></td>-->
<!--					<td><button>Button with two icons</button></td>-->
<!--					<td><button>Button with two icons</button></td>-->
<!--				</tr>-->
<!--			-->
<!--			</table>-->
<!--			<button>Button with two icons and no text</button>-->
<!--	</div>-->
<!--	</form>-->
		<script>
			$(function(){
				$("#dialog").dialog({
					modal: true
				});
			});
		</script>
		
		<div id="dialog" title="Caixa comum">
			Uma caixa de diálogo qualquer.
		</div>
<!--	<c:import url="rodape.jsp" />-->
</body>
</html>