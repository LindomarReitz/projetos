package com.exemplo.hibernate.main;

import java.util.Calendar;

import com.exemplo.hibernate.empresa.Empresa;
import com.exemplo.hibernate.empresa.EmpresaDAO;
import com.exemplo.hibernate.funcionario.Funcionario;
import com.exemplo.hibernate.funcionario.FuncionarioDAO;
import com.exemplo.hibernate.projeto.Projeto;
import com.exemplo.hibernate.projeto.ProjetoDAO;

public class Main {
	public void cadastrarEmpresa() {
		Empresa e = new Empresa();
		e.setNome("Making");
		e.setCnpj(123);
		e.setCapitalAberto(false);
		
		EmpresaDAO dao = new EmpresaDAO();
		dao.salvar(e);
	}
	
	public void cadastrarFuncionario() {
		Funcionario f = new Funcionario();
		f.setNome("Lindomar");
		f.setIdade(19);
		f.setSalario(500);
		f.setAutonomo(false);
		
		FuncionarioDAO dao = new FuncionarioDAO();
		dao.salvar(f);
	}
	
	public void cadastrarProjeto() {
		Projeto p = new Projeto();
		p.setDescricao("Projeto Java");
		p.setDataInicio(Calendar.getInstance());
		p.setDataFim(Calendar.getInstance());
		p.setAtrasado(false);
		
		ProjetoDAO dao = new ProjetoDAO();
		dao.salvar(p);
	}
	
	public static void main(String[] args) {
		ProjetoDAO dao = new ProjetoDAO();
		
		for (Projeto p : dao.listar()) {
			System.out.println("Id: " + p.getId());
			System.out.println("Descrição: " + p.getDescricao());
			System.out.println("Data Ínicio: " + p.getDataInicio());
			System.out.println("Data Fim: " + p.getDataFim());
			System.out.println("Atrasado: " + p.isAtrasado());
		}
	}
}