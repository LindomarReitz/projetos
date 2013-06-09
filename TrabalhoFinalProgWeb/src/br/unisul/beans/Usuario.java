package br.unisul.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Usuarios")
public class Usuario {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(name = "data_nascimento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(length = 30, nullable = false)
	private String email;
	
	@Column(length = 10, nullable = false)
	private String login;
	
	@Column(length = 20, nullable = false)
	private String senha;
	
	@ManyToOne
	@JoinColumn(name = "id_perfil")
	private Perfil perfil;
	
	@Transient
	private String testePerfil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public String getTestePerfil() {
		return testePerfil;
	}

	public void setTestePerfil(String testePerfil) {
		this.testePerfil = testePerfil;
	}

	public boolean hasRules(String rules) {
		return rules.contains(this.testePerfil);
	}
}