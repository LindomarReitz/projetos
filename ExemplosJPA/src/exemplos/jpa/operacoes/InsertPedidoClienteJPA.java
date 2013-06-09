package exemplos.jpa.operacoes;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import exemplos.jpa.beans.Cliente;
import exemplos.jpa.beans.Pedido;

public class InsertPedidoClienteJPA {
	public static void main(String[] args) {
		EntityManagerFactory factory = 
			Persistence.createEntityManagerFactory("jpa");
		
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		Cliente c = new Cliente();
		c.setNome("Augusto Limeira");
		
		Pedido p = new Pedido();
		p.setData(Calendar.getInstance());
		p.setCliente(c);
		
		manager.persist(c);
		manager.persist(p);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}