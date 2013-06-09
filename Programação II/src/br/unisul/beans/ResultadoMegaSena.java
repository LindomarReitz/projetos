package br.unisul.beans;

import java.util.Date;

public class ResultadoMegaSena {
	
	private String acumulado;
	private int numJogo, dezenas[], numMegaSena, numQuina, numQuadra;
	private double pagoMegaSena, pagoQuina, pagoQuadra, valorAcumulado;
	private Date data;

	public ResultadoMegaSena() {
		
	}
	
	public ResultadoMegaSena(int numJogo, Date data, int[] dezenas, int numMegaSena, 
			double pagoMegaSena, int numQuina, double pagoQuina, int numQuadra, 
			double pagoQuadra, String acumulado, double valorAcumulado) {
		this.numJogo = numJogo;
		this.data = data;
		this.dezenas = dezenas;
		this.numMegaSena = numMegaSena;
		this.pagoMegaSena = pagoMegaSena;
		this.numQuina = numQuina;
		this.pagoQuina = pagoQuina;
		this.numQuadra = numQuadra;
		this.acumulado = acumulado;
		this.valorAcumulado = valorAcumulado;	
	}
	
	public ResultadoMegaSena(int numJogo, int[] dezenas) {
		this.numJogo = numJogo;
		this.dezenas = dezenas;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getNumJogo() {
		return numJogo;
	}

	public void setNumJogo(int numJogo) {
		this.numJogo = numJogo;
	}

	public int[] getDezenas() {
		return dezenas;
	}

	public void setDezenas(int[] dezenas) {
		this.dezenas = dezenas;
	}

	public int getNumMegaSena() {
		return numMegaSena;
	}

	public void setNumMegaSena(int numMegaSena) {
		this.numMegaSena = numMegaSena;
	}

	public int getNumQuina() {
		return numQuina;
	}

	public void setNumQuina(int numQuina) {
		this.numQuina = numQuina;
	}

	public int getNumQuadra() {
		return numQuadra;
	}

	public void setNumQuadra(int numQuadra) {
		this.numQuadra = numQuadra;
	}

	public double getPagoMegaSena() {
		return pagoMegaSena;
	}

	public void setPagoMegaSena(double pagoMegaSena) {
		this.pagoMegaSena = pagoMegaSena;
	}

	public double getPagoQuina() {
		return pagoQuina;
	}

	public void setPagoQuina(double pagoQuina) {
		this.pagoQuina = pagoQuina;
	}

	public double getPagoQuadra() {
		return pagoQuadra;
	}

	public void setPagoQuadra(double pagoQuadra) {
		this.pagoQuadra = pagoQuadra;
	}

	public String getAcumulado() {
		return acumulado;
	}

	public void setAcumulado(String acumulado) {
		this.acumulado = acumulado;
	}

	public double getValorAcumulado() {
		return valorAcumulado;
	}

	public void setValorAcumulado(double valorAcumulado) {
		this.valorAcumulado = valorAcumulado;
	}
}
