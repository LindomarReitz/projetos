package financeiro.web;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import financeiro.categoria.Categoria;
import financeiro.categoria.CategoriaRN;
import financeiro.web.util.ContextoUtil;

@ManagedBean(name = "categoriaBean")
@RequestScoped
public class CategoriaBean {
	private TreeNode categoriasTree;
	private Categoria editada = new Categoria();
	private List<SelectItem> categoriasSelect;
	private boolean mostraEdicao = false;
	
	public void novo() {
		Categoria pai = null;
		if (this.editada.getCodigo() != null) {
			CategoriaRN categoriaRN = new CategoriaRN();
			pai = categoriaRN.carregar(this.editada.getCodigo());
		}
		this.editada = new Categoria();
		this.editada.setPai(pai);
		this.mostraEdicao = true;
	}
	
	public void selecionar(NodeSelectEvent event) {
		this.editada = (Categoria) event.getTreeNode().getData();
		Categoria pai = this.editada.getPai();
		if (this.editada != null && pai != null && pai.getCodigo() != null) {
			this.mostraEdicao = true;
		} else {
			this.mostraEdicao = false;
		}
	}
	
	public void salvar() {
		ContextoBean contextoBean = ContextoUtil.getContextoBean();
		CategoriaRN categoriaRN = new CategoriaRN();
		this.editada.setUsuario(contextoBean.getUsuarioLogado());
		categoriaRN.salvar(this.editada);
		
		this.editada = null;
		this.mostraEdicao = false;
		this.categoriasTree = null;
		this.categoriasSelect = null;
	}
	
	public void excluir() {
		CategoriaRN categoriaRN = new CategoriaRN();
		categoriaRN.excluir(this.editada);
		
		this.editada = null;
		this.mostraEdicao = false;
		this.categoriasTree = null;
		this.categoriasSelect = null;		
	}
	
	public TreeNode getCategoriasTree() {
		if (this.categoriasTree == null) {
			ContextoBean contextoBean = ContextoUtil.getContextoBean();
			CategoriaRN categoriaRN = new CategoriaRN();
			List<Categoria> categorias = categoriaRN.listar(contextoBean.getUsuarioLogado());
			this.categoriasTree = new DefaultTreeNode(null, null);
			this.mostraDadosTree(this.categoriasTree, categorias);
		}
		return this.categoriasTree;
	}
	
	private void mostraDadosTree(TreeNode pai, List<Categoria> lista) {
		if (lista != null && lista.size() > 0) {
			TreeNode filho = null;
			for (Categoria categoria : lista) {
				filho = new DefaultTreeNode(categoria, pai);
				this.mostraDadosTree(filho, categoria.getFilhos());
			}
		}
	}
	
	public List<SelectItem> getCategoriasSelect() {
		if (this.categoriasSelect == null) {
			ContextoBean contextoBean = ContextoUtil.getContextoBean();
			CategoriaRN categoriaRN = new CategoriaRN();
			List<Categoria> categorias = categoriaRN.listar(contextoBean.getUsuarioLogado());
			this.categoriasTree = new DefaultTreeNode(null, null);
			this.mostraDadosSelect(this.categoriasSelect, categorias, "");
		}
		return this.categoriasSelect;
	}
	
	private void mostraDadosSelect(List<SelectItem> select , List<Categoria> categorias, String prefixo) {
		SelectItem item = null;
		if (categorias != null) {
			for (Categoria categoria : categorias) {
				item = new SelectItem(categoria, prefixo + categoria.getDescricao());
				item.setEscape(false);
				select.add(item);
				this.mostraDadosSelect(select, categoria.getFilhos(), prefixo + "&nbsp;&nbsp");
			}
		}
	}

	public Categoria getEditada() {
		return editada;
	}

	public void setEditada(Categoria editada) {
		this.editada = editada;
	}

	public boolean isMostraEdicao() {
		return mostraEdicao;
	}

	public void setMostraEdicao(boolean mostraEdicao) {
		this.mostraEdicao = mostraEdicao;
	}

	public void setCategoriasTree(TreeNode categoriasTree) {
		this.categoriasTree = categoriasTree;
	}

	public void setCategoriasSelect(List<SelectItem> categoriasSelect) {
		this.categoriasSelect = categoriasSelect;
	}
}
