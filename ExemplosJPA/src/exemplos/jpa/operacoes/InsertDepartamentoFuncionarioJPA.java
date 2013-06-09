package exemplos.jpa.operacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Departamento;
import exemplos.jpa.beans.Funcionario;

public class InsertDepartamentoFuncionarioJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Funcionario f = new Funcionario();
		f.setNome("Lindomar Reitz");
		
		Departamento d = new Departamento();
		d.setNome("Contabilidade");
		d.getFuncionarios().add(f); //Colocando um funcionário no ArrayList funcionarios
		
		manager.persist(f);
		manager.persist(d);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}