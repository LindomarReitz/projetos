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

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Filmes")
public class Filme {
	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	private Long id;
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(length = 30, nullable = false)	
	private String diretor;
	
	@Column(length = 140, nullable = false)
	private String elenco;
	
	@Column(length = 140, nullable = false)
	private String sinopse;
	
	@Column(length = 15, nullable = false)
	private String idioma;
	
	@Column(length = 10, nullable = false)
	private String legenda;

	@Column(length = 10, nullable = false)
	private String classificacao;
	
	@Column(name = "ano_lancamento", nullable = false)
	private int anoLancamento;
	
	private int duracao;
	
	@Column(length = 25, nullable = false)
	private String pais;
	
	@Column(name = "tipo_exibicao", length = 25, nullable = false)
	private String tipoExibicao;
	
	@Column(name = "data_Cadastro")
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Column(length = 255, nullable = false)
	private String url;
	
	@ManyToOne
	@JoinColumn(name = "id_genero")
	private Genero genero;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

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

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getLegenda() {
		return legenda;
	}

	public void setLegenda(String legenda) {
		this.legenda = legenda;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTipoExibicao() {
		return tipoExibicao;
	}

	public void setTipoExibicao(String tipoExibicao) {
		this.tipoExibicao = tipoExibicao;
	}
    
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}