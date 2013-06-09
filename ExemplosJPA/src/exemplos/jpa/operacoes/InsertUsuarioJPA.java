package exemplos.jpa.operacoes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Usuario;

public class InsertUsuarioJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		Usuario novoUsuario = new Usuario();
		novoUsuario.setEmail("kamup_deval@hotmail.com");
		novoUsuario.setDataDeCadastro(Calendar.getInstance());
		manager.persist(novoUsuario); //Persistindo o objeto
		
		manager.getTransaction().begin(); //Iniciando uma transação
		manager.getTransaction().commit(); //Realizando o commit da mesma
		
		factory.close();
	}
}