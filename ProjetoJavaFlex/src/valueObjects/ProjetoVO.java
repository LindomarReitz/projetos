package valueObjects;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "projetos")
public class ProjetoVO {
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "id", sequenceName = "projetos_id_seq")
	private int id;
	private String descricao;
	@Temporal(TemporalType.DATE)
	private Calendar dataInicio;
	@Temporal(TemporalType.DATE)
	private Calendar dataFim;
	private boolean atrasado;
	
	@ManyToMany //Relacionamento muitos-para-muitos
	@JoinTable(name = "projetos_funcionarios",
			joinColumns = @JoinColumn(name = "projetos_id"),
			inverseJoinColumns = @JoinColumn(name = "funcionarios_id"))
	private List<FuncionarioVO> funcionarios = new ArrayList<FuncionarioVO>();
	
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
	
	public Calendar getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Calendar getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	
	public boolean isAtrasado() {
		return atrasado;
	}
	
	public void setAtrasado(boolean atrasado) {
		this.atrasado = atrasado;
	}

	public List<FuncionarioVO> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionarioVO> funcionarios) {
		this.funcionarios = funcionarios;
	}
}