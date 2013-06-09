package br.unisul.exercicios.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.unisul.beans.Empresa;
import br.unisul.dao.ConexaoDAO;

public class Exercicio2 {
	
	private static final String URL = "jdbc:postgresql://localhost:5432/Exemplo";
	private static final String LOGIN = "postgres";
	private static final String SENHA = "kamup92";
	
	public void atualizar(ArrayList<Empresa> empresas) {
		Connection con = null;
		
		try {
			con = ConexaoDAO.getConnectionPostgreSQL(URL, LOGIN , SENHA);
			String sql = "update empresas set codigo = ?, nome = ? where codigo = 1";
			try {
				 PreparedStatement ps = con.prepareStatement(sql);
				 for (Empresa e : empresas) {
					 ps.setInt(1, e.getCodigo());
					 ps.setString(2, e.getNome());
				 }
				 ps.executeUpdate();
			} finally {
				con.close();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao conectar com o driver do banco");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro ao fazer update no banco");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Exercicio2 ex2 = new Exercicio2();
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		String nome;
		int id;
		
		id = Integer.parseInt(JOptionPane.showInputDialog("ID:"));
		nome = JOptionPane.showInputDialog("Nome:");
		
		empresas.add(new Empresa(id, nome));
		ex2.atualizar(empresas);
	}
}
