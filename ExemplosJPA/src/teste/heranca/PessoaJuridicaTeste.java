package teste.heranca;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class PessoaJuridicaTeste extends PessoaTeste {
	@Id
	@GeneratedValue(generator = "cnpj", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "cnpj", sequenceName = "id_pessoajuridica_seq")
	private int cnpj;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
}