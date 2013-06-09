package teste.heranca;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("jpa");
	
		EntityManager manager = fabrica.createEntityManager();
		
		manager.getTransaction().begin();
		
		PessoaTeste t = new PessoaTeste();
		t.setId(1);
		t.setNome("Lindomar");
		
        PessoaJuridicaTeste pj = new PessoaJuridicaTeste();
        pj.setCnpj(123);
        
        manager.persist(t);
        manager.persist(pj);
        
        manager.getTransaction().commit();
        
        manager.close();
        fabrica.close();
	}
}