package com.exemplo.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Carro {
	private String marca;
	private String cor;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Bean(name = "criarCarro")
	public Carro criarCarro(String marca, String cor) {
		Carro carro = new Carro();
		carro.setMarca(marca);
		carro.setCor(cor);
		
		return carro;
	}
}