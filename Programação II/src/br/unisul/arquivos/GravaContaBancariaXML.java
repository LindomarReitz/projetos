package br.unisul.arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import br.unisul.beans.ContaBancaria;
import br.unisul.interfaces.IGravaContaBancaria;

public class GravaContaBancariaXML implements IGravaContaBancaria<ContaBancaria> {

	@Override
	public void escreverArquivo(ArrayList<ContaBancaria> contas) {
		FileWriter file = null;
		BufferedWriter buffer = null;
		try {
			file = new FileWriter("c:/temp/contasBancarias.xml");
			try {
				buffer = new BufferedWriter(file);
				for (ContaBancaria c : contas) {
					buffer.write("<contas>");
					buffer.newLine();
					buffer.write("  <conta>");
					buffer.newLine();
					buffer.write("    <codigo>" + c.getCodigo() + "</codigo>");
					buffer.newLine();
					buffer.write("    <numero>" + c.getNumConta() + "</numero>");
					buffer.newLine();
					buffer.write("    <cliente>" + c.getNome() + "</cliente>");
					buffer.newLine();
					buffer.write("    <digito-verificador>" + modulo11(c.getNumConta()) + "</digito-verificador>");
					buffer.newLine();
					buffer.write("    <saldo>" + c.getSaldo() + "</saldo>");
					buffer.newLine();
					buffer.write("  <conta>");
					buffer.newLine();
					buffer.write("</contas>");
					buffer.newLine();
				}
			} finally {
				buffer.close();
				file.close();
			}
		} catch (Exception e) {
			System.out.println("Erro ao gravar dados no arquivo");
		}
	}

	@Override
	public String modulo11(int conta) {
		if (conta == 10) {
			return "0";
		} else if (conta > 10) {
			return "X";
		}
		return null;
	}
}
