package exemplo.polimorfismo1;

public class Aluno extends Pessoa {

	private int id, fase;
	private String curso;
	
	public Aluno(int id, String nome, int idade, char sexo, String curso, int fase) {
		super(nome, idade, sexo);
		this.id = id;
		this.curso = curso;
		this.fase = fase;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String toString() {
		String saida = "";
		
		saida += "ID: " + getId() + "\n";
		saida += "Nome: " + getNome() + "\n";
		saida += "Idade: " + getIdade() + "\n";
		saida += "Sexo: " + getSexo() + "\n";
		saida += "Curso: " + getCurso() + "\n";
		saida += "Fase: " + getFase() + "\n";
		
		return saida;
	}
}
