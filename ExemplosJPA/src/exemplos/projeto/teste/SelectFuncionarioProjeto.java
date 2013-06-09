package exemplos.projeto.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectFuncionarioProjeto {
	@SuppressWarnings({ "unchecked", "static-access" })
	public static void main(String[] args) {
		EntityManagerFactory fabrica = 
			Persistence.createEntityManagerFactory("exemplojpa");
		
		EntityManager manager = fabrica.createEntityManager();
		Query query = manager.createQuery("select a from Projeto2 a");
		
		List<Projeto2> projetos = query.getResultList();
		
		for (Projeto2 p : projetos) {
			StringBuilder saida = new StringBuilder();
			saida.append("Projetos: \n");
			saida.append("\nID: " + p.getId());
			saida.append("\nDescricao: " + p.getDescricao());
			saida.append("\nPrazo de entrega: " + p.getPrazoEntrega().getInstance());
			saida.append("\nAtrasado: " + p.isAtrasado());
			saida.append("\nFuncionários vinculados a esse projeto: \n");
			
			for (Funcionario3 f : p.getFuncionarios()) {
				saida.append("\nID: " + f.getId());
				saida.append("\nNome: " + f.getNome());
				saida.append("\nSexo: " + f.getSexo());
				saida.append("\nEndereço: " + f.getEndereco());
				saida.append("\nSalário: " + f.getSalario());
			}
			System.out.println(saida.toString());
		}
	}
}