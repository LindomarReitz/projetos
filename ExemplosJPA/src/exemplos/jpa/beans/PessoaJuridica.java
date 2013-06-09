package exemplos.jpa.beans;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa2 {
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}