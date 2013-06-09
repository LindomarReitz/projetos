package patterns.criacao.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype<Campanha> {
	private String nome;
	private Calendar vencimento;
	private Set<String> palavrasChave;
	
	public Campanha(String nome, Calendar vencimento, Set<String> palavrasChave) {
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavrasChave = palavrasChave;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Calendar getVencimento() {
		return vencimento;
	}
	
	public void setVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
	}

	public Set<String> getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(Set<String> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
	
	public Campanha clone() {
		String nome = "Cópia da campanha: " + this.nome;
		Calendar vencimento = (Calendar) this.vencimento.clone();
		Set<String> palavrasChave = new HashSet<String>(this.palavrasChave);
		
		return new Campanha(nome, vencimento, palavrasChave);
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("-----------------------");
		buffer.append("\n");
		buffer.append("Nome da campanha: ");
		buffer.append(this.nome);
		buffer.append("\n");
		
		String format = new SimpleDateFormat("dd/MM/yyyy").format(this.vencimento.getTime());
		buffer.append("Vencimento: " + format);
		buffer.append("\n");
		buffer.append("Palavras-chave: \n");
		for (String palavraChave : this.palavrasChave) {
			buffer.append(" - " + palavraChave);
			buffer.append("\n");
		}
		buffer.append("-----------------------");
		buffer.append("\n");
		
		return buffer.toString();
	}
}