package br.unisul.servlets;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import br.unisul.beans.Filme;
import br.unisul.beans.Genero;
import br.unisul.beans.Usuario;
import br.unisul.dao.FilmeDAO;
import br.unisul.dao.GeneroDAO;

public class CadastroFilmeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		Filme filme = new Filme();
		filme.setNome(request.getParameter("nome"));
		System.out.println(filme.getNome());
		filme.setDiretor(request.getParameter("diretor"));
		filme.setElenco(request.getParameter("elenco"));
		filme.setSinopse(request.getParameter("sinopse"));
		filme.setIdioma(request.getParameter("idioma"));
		filme.setLegenda(request.getParameter("legenda"));
		filme.setClassificacao(request.getParameter("classificacao"));
		filme.setAnoLancamento(Integer.parseInt(request.getParameter("anoLancamento")));
		filme.setDuracao(Integer.parseInt(request.getParameter("duracao")));
		filme.setPais(request.getParameter("pais"));
		filme.setTipoExibicao(request.getParameter("tipoExibicao"));
		filme.setDataCadastro(new Date());
		
		boolean isMultiPart = FileUpload.isMultipartContent(request);
		if (isMultiPart) {
			FileItemFactory factory = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(factory);
			// Tamanho máximo do upload: 50MB
			upload.setSizeMax(50 * 1024 * 1024);
			
			try {
				List items = upload.parseRequest(request);
				
				Iterator it = items.iterator();
				while (it.hasNext()) {
					FileItem fitem = (FileItem) it.next();
					if (fitem.getFieldName().equals("imagem")) {
						StringBuffer buffer = new StringBuffer();
						buffer.append("c:/temp/");
						buffer.append(fitem.getName());
						System.out.println(buffer.toString());
						File file = new File(buffer.toString());
						fitem.write(file);
						filme.setUrl(buffer.toString());
						System.out.println(buffer.toString());
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}		
		}	
		
		String descricaoGenero = request.getParameter("genero");
		List<Genero> generos = new GeneroDAO().getList();
		for (Genero genero : generos) {
			if (descricaoGenero.equals(genero.getDescricao())) 
				filme.setGenero(genero);
		}		
		filme.setUsuario((Usuario) request.getSession().getAttribute("usuario"));
		
		FilmeDAO dao = new FilmeDAO();
		dao.save(filme);
	}
}