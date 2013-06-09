package exemplos.projeto.teste;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = fabrica.createEntityManager();
		Funcionario3 f = new Funcionario3();
		f.setNome("Lindomar Reitz");
		f.setSexo('M');
		f.setEndereco("Rua 13, Lote 2, Quadra P");
		f.setSalario(500);
		
		manager.persist(f);
		
		Projeto2 p = new Projeto2();
		p.setDescricao("Projeto 1");
		p.setPrazoEntrega(Calendar.getInstance());
		p.getFuncionarios().add(f); // Adicionando funcionários ao projeto
		p.setAtrasado(false);
		
		manager.persist(p);
	
		manager.getTransaction().begin(); // Iniciando uma transação
		manager.getTransaction().commit(); // Realizando o commit da mesma
		
		manager.close();
		fabrica.close();
	}
}