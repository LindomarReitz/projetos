package teste.relacionamento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios2")
public class Funcionario2 {
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "id", sequenceName = "id_funcionarios2_seq")
	private int id;
	private String nome;
	private double salario;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}