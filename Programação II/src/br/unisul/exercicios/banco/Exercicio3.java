package br.unisul.exercicios.banco;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.unisul.arquivos.EmpresasTxtReader;
import br.unisul.beans.Empresa;
import br.unisul.dao.ConexaoDAO;

public class Exercicio3 {

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
					System.out.println("O código " + e.getCodigo() + " foi inserido");
					ps.setString(2, e.getNome());
					System.out.println("O nome " + e.getNome() + " foi inserido");
					ps.executeUpdate();
				}
			} finally {
				con.close();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Erro ao conectar com driver do banco");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro ao fazer insert no banco");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Exercicio3 ex3 = new Exercicio3();
		EmpresasTxtReader txt = new EmpresasTxtReader();
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		try {
			empresas = txt.lerArquivo();
			ex3.inserir(empresas);
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro ao fazer leitura no arquivo");
			e.printStackTrace();
		}
	}
}

