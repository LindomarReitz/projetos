package exemplo.polimorfismo.inteface;

public class Aluno extends Pessoa {

	private int id;
	private String curso;
	
	public Aluno(int id, String nome, int idade, char sexo, String curso) {
		super(nome, idade, sexo);
		this.id = id;
		this.curso = curso;
	}
	
	@Override
	public void cadastrar() {
		
	}

	@Override
	public String listar() {
		String saida = "";
		
		saida += "ID: " + getId() + "\n";
		saida += "Nome: " + getNome() + "\n";
		saida += "Idade: " + getIdade() + "\n";  
		saida += "Sexo: " + getSexo() + "\n";
		saida += "Curso: " + getCurso() + "\n";
		
		return saida;
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
}
