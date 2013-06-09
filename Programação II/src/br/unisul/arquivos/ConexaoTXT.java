package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.Conexao;
import br.unisul.interfaces.IConexao;

public class ConexaoTXT implements IConexao {

	@Override
	public ArrayList<Conexao> lerArquivo() {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<Conexao> conexoes = new ArrayList<Conexao>();
		try {
			file = new FileReader("c:/temp/configuration.ini");
			try {
				buffer = new BufferedReader(file);
				String driver = "", url = "", linha = "";
				while ((linha = buffer.readLine()) != null) {
					String[] info = linha.split("=");
					if (linha.indexOf("driver") >= 0) {
						driver = info[1];
					} else if (linha.indexOf("url") >= 0) {
						url = info[1];
						conexoes.add(new Conexao(driver, url));
					}
				}
			} catch (IOException e) {
				System.out.println("Erro ao fazer leitura do arquivo");
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Arquivo não encontrado!");
		}
		return conexoes;
	}

	@Override
	public void escreverArquivo(ArrayList<Conexao> conexoes) {
		FileWriter file = null;
		BufferedWriter buffer = null;
		try { 
			file = new FileWriter("configuration.ini");
			try {
				buffer = new BufferedWriter(file);
				for (Conexao c : conexoes) {
					buffer.write("driver=" + c.getDriver());
					buffer.newLine();
					buffer.write("url=" + c.getUrl());
				}
			} catch (IOException e) {
				System.out.println("Erro ao realizar escrita no arquivo");
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Não foi possível escrever/manipular no arquivo");
		}
	}
}
