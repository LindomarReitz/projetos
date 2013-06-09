package com.exemplo.hibernate.funcionario;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario implements Serializable {
	private static final long serialVersionUID = 2705069881292585392L;
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "id", sequenceName = "funcionarios_id_seq")
	private int id;
	private String nome;
	private int idade;
	private double salario;
	private boolean autonomo;
	
	public Funcionario() {
		
	}
	
	public Funcionario(int id, String nome, int idade, double salario, boolean autonomo) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.autonomo = autonomo;
	}

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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public boolean isAutonomo() {
		return autonomo;
	}

	public void setAutonomo(boolean autonomo) {
		this.autonomo = autonomo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (autonomo ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (autonomo != other.autonomo)
			return false;
		if (id != other.id)
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double
				.doubleToLongBits(other.salario))
			return false;
		return true;
	}
}