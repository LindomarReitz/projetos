			<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
			<div id="content"><div class="inner_copy"><div class="inner_copy"> Need a website? <a href="http://www.websitetemplatesonline.com">Free website templates</a> by professional designers.</div></div>
				<div class="line-hor"></div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Cadastro de <span>Filmes</span></h3>
								<form action="CadastroFilme" method="post">
									Nome: <input type="text" name="nome"/><br />
									Diretor: <input type="text" name="diretor"/><br />
									Elenco: <textarea name="elenco"></textarea><br />
									Sinopse: <textarea name="sinopse"></textarea><br />
									Idioma: <input type="text" name="idioma"><br />
									Legenda: <select name="legenda">
												<option>Dublado</option>
												<option>Legendado</option>
												<option>Nacional</option>
									         </select><br />
									Classificação: <input type="text" name="classificacao"/><br />
									Ano de Lançamento: <input type="text" name="anoLancamento"/><br />
									Duração: <input type="text" name="duracao"><br />
									País: <input type="text" name="pais"><br />
									Tipo de Exibição: <select name="tipoExibicao">
														<option>2D</option>
														<option>3D</option>
									                  </select><br />
									Gênero: <select name="genero" onfocus="${generoDAO.list}">
												<jsp:useBean id="generoDAO" class="br.unisul.dao.GeneroDAO"/>
												<c:set value="${generoDAO.list}" var="dao"/>
												<c:forEach var="genero" items="${dao}">
													<option>${genero.descricao}</option>
												</c:forEach>
											</select><br />
									Imagem: <input type="file" id="imagem" name="imagem" accept="image/jpeg; image/gif; image/bmp; image/png"/><br />
									<hr />
									<input type="submit" value="Cadastrar"/>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>