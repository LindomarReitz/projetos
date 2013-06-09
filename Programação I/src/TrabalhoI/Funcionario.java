package TrabalhoI;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	protected List<Funcionario> lista = new ArrayList<Funcionario>();
	private String nome, area;
	private int id, idade;
	private char sexo;
	private float salario;

	public Funcionario(int id, String nome, int idade, char sexo, float salario, String area) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.salario = salario;
		this.area = area;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getSexo() {
		return this.sexo;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public float getSalario() {
		this.salario -= (salario * 8f / 100); //Desconto do INSS
		return this.salario;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return this.area;
	}

	public void cadastrar() throws IdadeException, SalarioException {

	}

	public void excluir(int id) {

	}

	public void atualizar(int id1) throws IdadeException, SalarioException {

	}

	public String toString() {
		String saida = "";

		return saida;
	}
}

