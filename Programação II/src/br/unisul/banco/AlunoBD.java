package br.unisul.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.unisul.beans.Aluno;
import br.unisul.dao.ConexaoDAO;

public class AlunoBD {
	private static final String URL = "jdbc:postgresql://localhost:5432/Exemplo";
	private static final String LOGIN = "postgres";
	private static final String SENHA = "kamup92";
	
	public void incluir(Aluno aluno) {
		Connection con;
		try {
			con = ConexaoDAO.getConnectionPostgreSQL(URL, LOGIN, SENHA);
			String sql = "insert into alunos2(codigo, nome, nota1, nota2, nota3) values(?,?,?,?,?)";	
			try { 
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, aluno.getId());
				ps.setString(2, aluno.getNome());
				int num = 3;
				for (int i = 0; i < 3; i++) {
					ps.setFloat(num, aluno.getNotas()[i]);
					num++;
				}
				ps.executeUpdate();
			} finally {
				con.close();
			}
		} catch (ClassNotFoundException e) {
			System.err.println("Erro ao conectar com o banco.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Erro ao fazer operação insert.");
			e.printStackTrace();
		}
	}
	
	public void excluir(int id) {
		Connection con;
		try {
			con = ConexaoDAO.getConnectionPostgreSQL(URL, LOGIN, SENHA);
			String sql = "delete from alunos2 where codigo = ?";	
			PreparedStatement ps = con.prepareStatement(sql);
			try { 
				ps.setInt(1, id);
				ps.executeUpdate();
			} finally {
				con.close();
			}
		} catch (ClassNotFoundException e) {
			System.err.println("Erro ao conectar com o banco.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Erro ao fazer operação delete.");
			e.printStackTrace();
		}
	}
	
	public ArrayList<Aluno> listar() {
		Connection con;
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		try {
			con = ConexaoDAO.getConnectionPostgreSQL(URL, LOGIN, SENHA);
			try { 
				String sql = "select * from alunos2";
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(sql);
				while(rs.next()) {
					int id = rs.getInt("codigo");
					String nome = rs.getString("nome");
					float nota1 = rs.getFloat("nota1");
					float nota2 = rs.getFloat("nota2");
					float nota3 = rs.getFloat("nota3");	
					alunos.add(new Aluno(id, nome, new float[]{nota1, nota2, nota3}));
				}
			} finally {
				con.close();
			}
		} catch (ClassNotFoundException e) {
			System.err.println("Erro ao conectar com o banco.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Erro ao fazer operação select.");
			e.printStackTrace();
		}
		return alunos;
	}
	
	public static void main(String[] args) {
		AlunoBD banco = new AlunoBD();
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
//		String nome = "Lindomar";
//		int id = 452625;
//		float[] notas = new float[]{10,8,9};
//		banco.incluir(new Aluno(id, nome, notas));
//		banco.excluir(id);
		alunos = banco.listar();
		for (Aluno a : alunos) {
			System.out.println("ID: " + a.getId());
			System.out.println("Nome: " + a.getNome());
			int num = 1;
			for (int i =0 ; i < 3; i++) {
				System.out.println("Nota " + num + ": " + a.getNotas()[i]);
			}
			System.out.println("----------------------------------------");
		}
	}
}
