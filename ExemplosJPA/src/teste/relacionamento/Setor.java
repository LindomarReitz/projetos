package teste.relacionamento;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "setores")
public class Setor {
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "id", sequenceName = "id_setores_seq")
	private int id;
	private String descricao;
	
	@OneToMany
	@JoinColumn(name = "setores_id")
	private List<Funcionario2> funcionarios = new ArrayList<Funcionario2>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Funcionario2> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario2> funcionarios) {
		this.funcionarios = funcionarios;
	}
}