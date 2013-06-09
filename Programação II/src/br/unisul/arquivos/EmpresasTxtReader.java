package br.unisul.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import br.unisul.beans.Empresa;

public class EmpresasTxtReader {
	
	private static final String ARQUIVO = "c://temp//empresas.txt";
	
	public ArrayList<Empresa> lerArquivo() throws FileNotFoundException, IOException {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		try {
			file = new FileReader(ARQUIVO);
			try {
				buffer = new BufferedReader(file);
				String linha = "", nome = "";
				int codigo = 0;
				while ((linha = buffer.readLine()) != null) {
					String[] info = linha.split(";");
					codigo = Integer.parseInt(info[0]);
					nome = info[1];
					
					empresas.add(new Empresa(codigo, nome));
				}
			}finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
		return empresas;
	}
}
