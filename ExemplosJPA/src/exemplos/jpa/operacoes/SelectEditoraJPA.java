package exemplos.jpa.operacoes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exemplos.jpa.beans.Editora;


public class SelectEditoraJPA {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		//Nessa query deve ser o nome da classe mapeada, não a tabela
		Query query = manager.createQuery("select e from Editora e"); 

		List<Editora> editoras = query.getResultList(); //Pegando os resultados
		
		for (Editora e : editoras) {
			System.out.println("Nome: " + e.getNome() + "\nE-Mail: " + e.getEmail());
		}
	}
}