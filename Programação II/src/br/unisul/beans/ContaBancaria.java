package br.unisul.beans;

import java.util.Date;

public class ContaBancaria {

	private int codigo, numConta, numAgencia;
	private String nome, banco;
	private float saldo;
	private Date data;
	
	public ContaBancaria() {
		
	}

	public ContaBancaria(int codigo, int numConta, String nome, float saldo) {
		this.codigo = codigo;
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public ContaBancaria(int codigo, String nome, int numConta, 
			int numAgencia, String banco, float saldo, Date data) {
		this.codigo = codigo;
		this.nome = nome;
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.banco = banco;
		this.saldo = saldo;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
