package teste.relacionamento;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("jpa");
	
		EntityManager manager = fabrica.createEntityManager();
		manager.getTransaction().begin();
		
		Funcionario2 f = new Funcionario2();
		f.setNome("Lindomar");
		f.setSalario(600);
		
//		Setor s = new Setor();
//		s.setDescricao("Administração");
//		s.getFuncionarios().add(f);
//		
		Projeto p = new Projeto();
		p.setDescricao("Projeto 1");
		p.getFuncionarios().add(f);
	
		manager.persist(p);
		manager.persist(f);
		
		manager.getTransaction().commit();
		
		manager.close();
		fabrica.close();
	}
}