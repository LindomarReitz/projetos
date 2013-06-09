package tdd.testes;

import static org.junit.Assert.*;
import org.junit.Test;

import tdd.operacoes.Funcionario;

public class SalarioTeste {
	private Funcionario funcionario;
	
	public SalarioTeste() {
		this.funcionario = new Funcionario("Lindomar", 19, 500, 10);
	}
	
	@Test
	public void deveriaCalcularSalario() {
		float salario = funcionario.calcularSalario(funcionario.getSalario(),
				funcionario.getComissao());
		
		assertEquals(510, salario, 0);
	}
	
	@Test
	public void deveriaCalcularINSS() {
		Funcionario f = new Funcionario("Lindomar", 19, 90, 10);
		Funcionario f2 = new Funcionario("Lindomar", 18, 531, 9);
		
		assertEquals(8, f.calcularINSS(), 0);
		assertEquals(54, f2.calcularINSS(), 0);
	}
	
	@Test
	public void deveriaCalcularSalarioLiquido() {
		Funcionario f = new Funcionario("Lindomar", 19, 90, 10);
		
		assertEquals(92, f.calcularSalarioLiquido(), 0);
	}
	
	@Test
	public void deveriaSerAssalariado() {
		Funcionario f = new Funcionario("Lindomar", 19, 500, 5);

		assertTrue("Não é assalariado", f.isAssalariado());
	}
	
	@Test
	public void deveriaSerAutonomo() {
		Funcionario f = new Funcionario("Lindomar", 19, 600, 0);

		assertFalse("Não é autonômo",  f.isAssalariado());
	}
}