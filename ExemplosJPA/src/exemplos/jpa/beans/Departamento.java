package exemplos.jpa.beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQuery(name = "Departamento.findAll", query = "select d from Departamento d")
public class Departamento {
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "id", sequenceName = "id_departamento_seq")
	private Long id;
	private String nome;
	
	@OneToMany
	@JoinTable(name = "departamento_funcionario",
		joinColumns = @JoinColumn(name = "departamento_id"),
		inverseJoinColumns = @JoinColumn(name = "funcionario_id"))
	private Collection<Funcionario> funcionarios = new ArrayList<Funcionario>(); //Mapeamento um-para-muitos
	
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

	public Collection<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Collection<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
}