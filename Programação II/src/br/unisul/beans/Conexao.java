package br.unisul.beans;

public class Conexao {
	private String driver, url;
	
	public Conexao() {
		
	}
	
	public Conexao(String driver, String url) {
		this.driver = driver;
		this.url = url;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
