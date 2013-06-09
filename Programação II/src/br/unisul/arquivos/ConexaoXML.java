package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.Conexao;
import br.unisul.interfaces.IConexao;

public class ConexaoXML implements IConexao {
	
	public ArrayList<Conexao> lerArquivo() {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<Conexao> conexoes = new ArrayList<Conexao>();
		try {
			file = new FileReader("c:/temp/configuration.xml");
			try {
				buffer = new BufferedReader(file);
				String driver = "", url = "", linha = "";
				while ((linha = buffer.readLine()) != null) {
					if (linha.indexOf("<driver>") >= 0) {
						driver = parseTag(linha, "driver");
					} else if (linha.indexOf("<url>") >= 0) {
						url = parseTag(linha, "url");
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
			System.out.println("Arquivo não encontrado");
		}
		return conexoes;
	}
	
	@Override
	public void escreverArquivo(ArrayList<Conexao> conexoes) {
		FileWriter file = null;
		BufferedWriter buffer = null;
		try { 
			file = new FileWriter("configuration.xml");
			try {
				buffer = new BufferedWriter(file);
				for (Conexao c : conexoes) {
					buffer.write("<conexao>");
					buffer.newLine();
					buffer.write("  <driver>" + c.getDriver() + "</driver>");
					buffer.newLine();
					buffer.write("  <url>" + c.getUrl() + "</url>");
					buffer.newLine();
					buffer.write("</conexao>");
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
	
	public String parseTag(String linha, String tag) {
		String[] info = linha.split("<" + tag + ">");
		String[] dados = info[1].split("</" + tag + ">");
		return dados[0];
	}
}
