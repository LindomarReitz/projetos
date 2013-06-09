package exemplos.jpa.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
@NamedQuery(name = "Autor.findAll" , query = "select a from Autor a")
public class Autor {
	@Id
	@GeneratedValue(generator = "id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "id", sequenceName = "id_autor_seq")
	private Long id;
	private String nome;
	
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
}