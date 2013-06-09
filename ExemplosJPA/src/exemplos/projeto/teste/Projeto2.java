package exemplos.projeto.teste;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Projeto2 implements Serializable {
	private static final long serialVersionUID = -6224683866851730327L;
	
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "id", sequenceName = "id_projeto_seq")
	private int id;
	private String descricao;
	
	@Temporal(TemporalType.DATE)
	private Calendar prazoEntrega;
	private boolean atrasado;
	
	@OneToMany
	@JoinTable(name = "projeto2_funcionario3",
			joinColumns = @JoinColumn(name = "projeto2_id"),
			inverseJoinColumns = @JoinColumn(name = "funcionario3_id"))
	private List<Funcionario3> funcionarios = new ArrayList<Funcionario3>();
	
	public Projeto2() {
		
	}

	public Projeto2(int id, String descricao, Calendar prazoEntrega, boolean atrasado) {
		this.id = id;
		this.descricao = descricao;
		this.prazoEntrega = prazoEntrega;
		this.atrasado = atrasado;
	}

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

	public Calendar getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(Calendar prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

	public boolean isAtrasado() {
		return atrasado;
	}

	public void setAtrasado(boolean atrasado) {
		this.atrasado = atrasado;
	}
	
	public List<Funcionario3> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario3> funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (atrasado ? 1231 : 1237);
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((prazoEntrega == null) ? 0 : prazoEntrega.hashCode());
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
		Projeto2 other = (Projeto2) obj;
		if (atrasado != other.atrasado)
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id != other.id)
			return false;
		if (prazoEntrega == null) {
			if (other.prazoEntrega != null)
				return false;
		} else if (!prazoEntrega.equals(other.prazoEntrega))
			return false;
		return true;
	}
}