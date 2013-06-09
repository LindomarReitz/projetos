			<div id="content"><div class="inner_copy"><div class="inner_copy"> Need a website? <a href="http://www.websitetemplatesonline.com">Free website templates</a> by professional designers.</div></div>
				<div class="line-hor"></div>
				<div class="box">
					<div class="border-right">
						<div class="border-left">
							<div class="inner">
								<h3>Faça seu <span>Login</span></h3>
								<%
									Boolean logado = (Boolean) request.getSession().getAttribute("logado");
								
									if (logado != null && logado == false) {
								%>
									<p> Login/ Senha inválidos!</p>
								<% } %>
								
								<form action="Login" method="post">
									<input type="hidden" name="next" value="${param.next}">
									Login: <input type="text" name="login"/><br />
									Senha: <input type="password" name="senha"/><br />
									<hr />
									<input type="submit" value="Entrar"/>
								</form>
								
								<p>Se você não é cadastrado, <a href="cadastro_usuario.jsp">clique aqui</a> para se registrar.</p>
								
								
								
<!--								<p>Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat. Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis.</p>-->
<!--								 <ul class="login-list">-->
<!--									<li><a href="index.jsp">Home Page</a></li>-->
<!--									<li><a href="about-us.jsp">About</a></li>-->
<!--									<li><a href="artigos.jsp">artigos</a>-->
<!--										<ul>-->
<!--											<li><a href="artigo.jsp">artigo 1</a></li>-->
<!--											<li><a href="artigo.jsp">artigo 2</a></li>-->
<!--											<li><a href="artigo.jsp">artigo 3</a></li>-->
<!--										</ul>-->
<!--									</li>-->
<!--									<li><a href="contato.jsp">Contact Us</a></li>-->
<!--									<li><a href="login.jsp">Site Map</a></li>-->
<!--								 </ul>-->
<!--								 <p>Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat. Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequatuis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>-->
							</div>
						</div>
					</div>
				</div>
			</div>
