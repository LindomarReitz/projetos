package patterns.estrutural.bridge;

public class Recibo implements IDocumento {
	private String emissor;
	private String favorecido;
	private double valor;
	private IGeradorDeArquivo geradorDeArquivo;
	
	public Recibo(String emissor, String favorecido, double valor,
			IGeradorDeArquivo geradorDeArquivo) {
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorDeArquivo = geradorDeArquivo;
	}

	@Override
	public void gerarArquivo() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Recibo: \n");
		buffer.append("Empresa: " + getEmissor());
		buffer.append("\n");
		buffer.append("Cliente: " + getFavorecido());
		buffer.append("\n");
		buffer.append("Valor: " + getValor());
		buffer.append("\n");
		this.geradorDeArquivo.gerar(buffer.toString());
	}

	public String getEmissor() {
		return emissor;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public String getFavorecido() {
		return favorecido;
	}

	public void setFavorecido(String favorecido) {
		this.favorecido = favorecido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}