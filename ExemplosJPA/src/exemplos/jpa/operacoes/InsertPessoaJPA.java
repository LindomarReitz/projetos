package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Pessoa2;
import exemplos.jpa.beans.PessoaFisica;
import exemplos.jpa.beans.PessoaJuridica;

public class InsertPessoaJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Pessoa2 p = new Pessoa2();
		p.setNome("Lindomar");
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("A");
		pf.setCpf("1235699");
		
		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("B");
		pj.setCnpj("9822121");
		
		manager.persist(p);
		manager.persist(pf);
		manager.persist(pj);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
	
	public void atualizarCadastro(PessoaFisica pessoaFisica) {
		String sql = "update Pessoa p where p.nome = :nome";
	}
}