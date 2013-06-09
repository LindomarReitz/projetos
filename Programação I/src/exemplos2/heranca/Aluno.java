package exemplos2.heranca;

public class Aluno extends Pessoa{
	private int id;
	private String curso;
	private boolean matriculado;
	private float [] notas;
	
	public Aluno(int id,String nome, int idade, char sexo, String curso, boolean matriculado, float[] notas) {
		super(nome, idade, sexo);
		this.id = id;
		this.curso = curso;
		this.matriculado = matriculado;
		this.notas = notas;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public float[] getNotas() {
		return notas;
	}

	public void setNotas(float[] notas) {
		this.notas = notas;
	}	
	
	public String toString() {
		String saida = "";
		
		saida += "ID: " + getId() + "\n";
		saida += "Nome: " + getNome() + "\n";
		saida += "Idade: " + getIdade() + "\n";
		saida += "Sexo: " + getSexo() + "\n";
		saida += "Curso: " + getNotas() + "\n";
		for (int i = 0; i < getNotas().length; i++) {
			saida += "Notas: " + getNotas()[i];	
		}
		return saida;
	}
}
