			<%@page import="java.io.File"%>
<%@page import="javax.imageio.ImageIO"%>
<%@page import="java.awt.image.BufferedImage"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
			<div id="content"><div class="inner_copy"><div class="inner_copy"> Need a website? <a href="http://www.websitetemplatesonline.com">Free website templates</a> by professional designers.</div></div>
				<div class="line-hor"></div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
							<form action="" enctype="multipart/form-data">
									Filme: <select name="filme">
												<jsp:useBean id="filmeDAO" class="br.unisul.dao.FilmeDAO"/>
												<c:set value="${filmeDAO.list}" var="dao"/>
												<c:forEach var="filme" items="${dao}">
													<option>${filme.nome}</option>
													Clique <a href="/TrabalhoFinalProgWeb/CadastroFilme?filme=${filme}">aqui.</a>
												</c:forEach>
											</select><br />
											Upload: <input type="file" name="teste">
										
										<% BufferedImage imagem = ImageIO.read(new File("/images/icon1.gif")); %>
									<hr />
							</form>			
							</div>
						</div>
					</div>
				</div>
			</div>