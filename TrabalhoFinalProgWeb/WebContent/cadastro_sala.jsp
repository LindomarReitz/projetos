			<%@page import="br.unisul.beans.Usuario"%>
<div id="content"><div class="inner_copy"><div class="inner_copy"> Need a website? <a href="http://www.websitetemplatesonline.com">Free website templates</a> by professional designers.</div></div>
				<div class="line-hor"></div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
							<%
								Usuario usuario = (Usuario) request.getSession().getAttribute("user");
								
								if (usuario == null) { 
							%>	
									<p>Você não está logado, <a href="login_teste.jsp">clique aqui</a> para ser redirecionado a página de login.</p>
							<% } %>
							<%
								if (usuario != null && !usuario.hasRules("Usuario Comum")) {		
							%>
								<p>Acesso não autorizado, <a href="restrict/index.jsp">clique aqui</a> para ser redirecionado a página principal.</p>
							<% } else if (usuario != null) { %>
							
								<h3>Cadastro de <span>Salas</span></h3>
								<form action="CadastroSala" method="post">
									Nome: <input type="text" name="nome"/><br />
									Capacidade: <input type="text" name="capacidade"><br />
									<hr />	
									<input type="submit" value="Cadastrar"/>
								</form>
							<% } %>	
							</div>
						</div>
					</div>
				</div>
			</div>