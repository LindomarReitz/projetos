			<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
			<div id="content"><div class="inner_copy"><div class="inner_copy"> Need a website? <a href="http://www.websitetemplatesonline.com">Free website templates</a> by professional designers.</div></div>
				<div class="line-hor"></div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Cadastro de <span>Sess�es</span></h3>
								<form action="CadastroSessao" method="post">
									Per�odo: <select name="periodo">
												<option>Segunda � Sexta</option>
												<option>Sexta � Domingo</option>
												<option>Todos os dias</option>
											 </select><br />
									Data �nicio: <input type="text" name="dataInicio"><br />
									Data fim: <input type="text" name="dataFim"><br />
									Sala: <select name="sala">
									     	<jsp:useBean id="salaDAO" class="br.unisul.dao.SalaDAO"/>
									     	<c:set var="dao" value="${salaDAO.list}"/>
									 		<c:forEach var="sala" items="${dao}">
									 			<option>${sala.nome}</option>
									 		</c:forEach>
									      </select>
									<hr />	
									<input type="submit" value="Cadastrar"/>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>