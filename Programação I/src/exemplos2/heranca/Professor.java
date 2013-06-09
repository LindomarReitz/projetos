package exemplos2.heranca;

public class Professor extends Funcionario {
	private String [] disciplinas;
	private String graduacao;
	private boolean orientador;
	
	public Professor(int id, String nome, int idade, char sexo, float salario, boolean contratado,
			String [] disciplinas, String graduacao, boolean orientador) {
		super(id, nome, idade, sexo, salario, contratado);
		this.disciplinas = disciplinas;
		this.graduacao = graduacao;
		this.orientador = orientador;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public boolean isOrientador() {
		return orientador;
	}

	public void setOrientador(boolean orientador) {
		this.orientador = orientador;
	}
	
	public String toString() {
		String saida=  "";
		
		super.toString();
		saida += "Disciplinas que leciona: " + getDisciplinas() + ", " + "\n";
		saida += "Graduação em: " + getGraduacao() + "\n";
		saida += "Orientador: " + isOrientador() + "\n";
		
		return saida;
	}
}
