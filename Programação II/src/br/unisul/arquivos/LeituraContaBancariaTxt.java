package br.unisul.arquivos;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

import br.unisul.beans.ContaBancaria;
import br.unisul.interfaces.ILeituraContaBancaria;

public class LeituraContaBancariaTxt implements ILeituraContaBancaria<ContaBancaria> {

	@Override
	public ArrayList<ContaBancaria> lerArquivo() {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		
		try {
			file = new FileReader("c:/temp/contasBancarias.txt");
			try {
				buffer = new BufferedReader(file);
				String linha = "", nome = "";
				int codigo = 0, conta = 0;
				float saldo = 0;
				while ((linha = buffer.readLine()) != null) {
					String[] info = linha.split(";");
					codigo = Integer.parseInt(info[0]);
					conta = Integer.parseInt(info[1]);
					nome = info[2];
					saldo = Float.parseFloat(info[3]);
					contas.add(new ContaBancaria(codigo, conta, nome, saldo));
				}
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao manipular o arquivo");
		}
		return contas;
	}
}
