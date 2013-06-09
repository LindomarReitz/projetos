package tdd.problem.URLsplitting;

public class URLSplitting {
	private static final String PROTOCOLO_HTTP = "http",
				    PROTOCOLO_HTTPS = "https",
				    PROTOCOLO_FTP = "ftp";
	
	private String endereco;
	
	public URLSplitting(String endereco) {
		this.endereco = endereco;
	}
	
	private String[] getURL() {
		if (this.endereco != null)
			return this.endereco.split("://");
		else
			return null;
	}
	
	public String getDominio(String dominio) {
		return this.endereco.replace(dominio + "://", "");
	}
	
	public String getProtocolo() {
		String[] url = getURL();
		
		protocoloIniciandoCom(url[0]);
		
		return url[0];
	}
	
	private boolean protocoloIniciandoCom(String protocolo) {
		if (!protocolo.startsWith(PROTOCOLO_HTTP) && 
				!protocolo.startsWith(PROTOCOLO_HTTPS) &&
				!protocolo.startsWith(PROTOCOLO_FTP)) 
			throw new ProtocoloURLException("Esse protocolo não permitido!");
		else
			return protocolo.startsWith(protocolo);
	}

	public String getCaminho(String caminho) {
		String[] url = caminho.split("/"); 
		
		return caminho.replace(url[0] + "/", "");
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
