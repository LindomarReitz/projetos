package exemplos.jpa.operacoes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import exemplos.jpa.beans.Usuario;


public class SelectUsuarioJPA {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("select e from Usuario e"); //Nessa query deve ser o nome da classe 
																	 //mapeada, não a tabela
		List<Usuario> usuarios = query.getResultList(); //Pegando os resultados
		
		for (Usuario u : usuarios) {
			System.out.println("E-Mail: " + u.getEmail() + "\nData de Cadastro: " 
					+ u.getDataDeCadastro().getTime());
		}
	}
}
