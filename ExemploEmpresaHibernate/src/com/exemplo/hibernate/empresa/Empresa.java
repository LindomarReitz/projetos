package com.exemplo.hibernate.empresa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "empresas")
public class Empresa implements Serializable {
	private static final long serialVersionUID = -1768724159219907961L;
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "id", sequenceName = "empresas_id_seq")
	private int id;
	private String nome;
	@NaturalId
	private int cnpj;
	private boolean capitalAberto;
	
	public Empresa(int id, String nome, int cnpj, boolean capitalAberto) {
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.capitalAberto = capitalAberto;
	}
	
	public Empresa() {
		
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

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public boolean isCapitalAberto() {
		return capitalAberto;
	}

	public void setCapitalAberto(boolean capitalAberto) {
		this.capitalAberto = capitalAberto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capitalAberto ? 1231 : 1237);
		result = prime * result + cnpj;
		result = prime * result + id;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Empresa other = (Empresa) obj;
		if (capitalAberto != other.capitalAberto)
			return false;
		if (cnpj != other.cnpj)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}