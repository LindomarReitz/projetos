package br.unisul.exercicios.arquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.unisul.beans.ContaBancaria;
import br.unisul.exception.AgenciaInvalidaException;
import br.unisul.exception.BancoInvalidoException;
import br.unisul.exception.CampoVazioException;
import br.unisul.exception.ClienteInvalidoException;
import br.unisul.exception.CodigoInvalidoException;
import br.unisul.exception.ContaInvalidaException;
import br.unisul.exception.DataAberturaInvalidaException;
import br.unisul.exception.SaldoInvalidoException;

public class Exercicio14 {
	
	private static final String ARQUIVO = "c:/temp/contasBancarias.txt";
	private static final String BANCO1 = "SANTANDER";
	private static final String BANCO2 = "BANCO DO BRASIL";
	
	public ArrayList<ContaBancaria> lerArquivo() throws FileNotFoundException, IOException, CampoVazioException {
		FileReader file = null;
		BufferedReader buffer = null;
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		try {
			file = new FileReader(ARQUIVO);
			try {
				buffer = new BufferedReader(file);
				String linha = "", nome, banco;
				boolean digito1, digito3;
				int codigo = 0, numConta = 0, numAgencia = 0; 
				Date data = null, hoje = null;
				float saldo = 0;
				while ((linha = buffer.readLine()) != null) {
					String[] info = linha.split(";");
					
					System.out.println("Código: " + info[0]);
					if (info[0].isEmpty()) 
						throw new CodigoInvalidoException("Código inválido, preencha com valor maior do que zero");
					codigo = Integer.parseInt(info[0]);
					
					System.out.println("Nome: " + info[1]);
					nome = info[1];
					if (nome.isEmpty()) 
						throw new ClienteInvalidoException("Cliente não pode ter nome vazio");
					
					System.out.println("Conta: " + info[2]);
					digito1 = info[2].startsWith("1");
					digito3 = info[2].startsWith("3");
					if (info[2].isEmpty()) 
						throw new ContaInvalidaException("Número da conta não pode estar vazio");
					numConta = Integer.parseInt(info[2]);
					if (numConta < 0) 
						throw new ContaInvalidaException("Número da conta não pode ser menor do que zero");
					
					System.out.println("Agência: " + info[3]);
					if (info[3].isEmpty()) 
						throw new AgenciaInvalidaException("Agência inválida, preencha com valor maior do que zero");
					numAgencia = Integer.parseInt(info[3]);
					if (numAgencia < 1) {
						throw new AgenciaInvalidaException("O número da agencia não pode ser menor do que 1");
					}
					
					System.out.println("Banco: " + info[4]);
					banco = info[4];
					if (banco.equalsIgnoreCase(BANCO1) && !digito1) {
						throw new BancoInvalidoException("Banco inválido, o banco correto é SANTANDER " +
								"com o primeiro dígito da conta 1");
					} else if (banco.equalsIgnoreCase(BANCO2) && !digito3) {
						throw new BancoInvalidoException("Banco inválido, o banco correto é BANCO DO BRASIL " +
								"com o primeiro dígito da conta 3");
					} else 
						if (!banco.equals(BANCO1) && !banco.equals(BANCO2)) {
						throw new BancoInvalidoException("Banco inválido, preencha o nome, sendo somente válidos SANTANDER ou BANCO DO BRASIL");
					}
					
					System.out.println("Saldo: " + info[5]);
					if(info[5].isEmpty()) 
						throw new SaldoInvalidoException("O saldo não pode vazio");
					saldo = Float.parseFloat(info[5]);
					
					System.out.println("Data de abertura: " + info[6]);
					hoje = parseDate("19/09/2011");
					data = parseDate(info[6]);
					if (info[6].isEmpty() || data.before(hoje) || data.after(hoje))
						throw new DataAberturaInvalidaException("Data inválida, deve ser a data atual: " + 
								new SimpleDateFormat("dd/MM/yyyy").format(hoje));
					
					contas.add(new ContaBancaria(codigo, nome, numConta, numAgencia, banco, saldo, data));
				}
			}finally {
				buffer.close();
			}
		} finally {
			file.close();
		}
		return contas;
	}
	
	private Date parseDate(String data) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = (Date)sdf.parse(data);
		} catch (Exception e) {
			
		}
		return date;
	}
	
	public static void main(String[] args) {
		Exercicio14 ex14 = new Exercicio14();
		ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
		try {
			contas = ex14.lerArquivo();
			for (ContaBancaria conta : contas) {
				System.out.println("Código: " + conta.getCodigo());
				System.out.println("Cliente: " + conta.getNome());
				System.out.println("Número da conta: " + conta.getNumConta());
				System.out.println("Número da agência: " + conta.getNumAgencia());
				System.out.println("Banco: " + conta.getBanco());
				System.out.println("Data de abertura: " + new SimpleDateFormat("dd/MM/yyyy").format(conta.getData()));
				System.out.println("------------------------------------");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CampoVazioException e) {
			e.printStackTrace();
		}	
	}
}