package exemplos.jpa.beans;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa2 {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}