package br.unisul.exercicios.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Empresa;
import br.unisul.dao.ConexaoDAO;

public class Exercicio1 {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/Exemplo";
	private static final String LOGIN = "postgres";
	private static final String SENHA = "kamup92";
	
	public void inserir(ArrayList<Empresa> empresas) {
		Connection con = null;
		try {
			con = ConexaoDAO.getConnectionPostgreSQL(URL, LOGIN, SENHA);
			String sql = "insert into empresas(codigo, nome) values(?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				for (Empresa e : empresas) {
					ps.setInt(1, e.getCodigo());
					ps.setString(2, e.getNome());
				}
				ps.executeUpdate();
			} finally{ 
				con.close();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao conectar com o driver do banco");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir dados");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Exercicio1 ex1 = new Exercicio1();
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		String nome;
		int id;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
		nome = JOptionPane.showInputDialog("Nome:");
	
		empresas.add(new Empresa(id, nome));
		ex1.inserir(empresas);
	}
}
