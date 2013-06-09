package tdd.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.operacoes.Calculadora;

public class CalculadoraTeste {
	@Test
	public void deveriaSomarDoisNumeros() throws Exception {
		int v1 = 1;
		int v2 = 2;
		Calculadora calc = new Calculadora();
		int soma = calc.somar(v1, v2);
		
		assertEquals(3, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisNumeros() throws Exception {
		int v1 = 5;
		int v2 = 2;
		
		Calculadora calc = new Calculadora();
		int div = calc.subtrair(v1, v2);

		assertEquals(3, div);
	}
	
	@Test
	public void deveriaDividirDoisNumeros() throws Exception {
		int v1 = 5;
		int v2 = 5;
		
		Calculadora calc = new Calculadora();
		int div = calc.dividir(v1, v2);
		
		assertEquals(1, div, 0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void deveriaLancarExceptionAoDividirPorZero() {
		int v1 = 5;
		int v2 = 0;
		
		Calculadora calc = new Calculadora();
		calc.dividir(v1, v2);
	}
	
	@Test
	public void deveriaMultiplicarDoisNumeros() throws Exception {
		float v1 = 1;
		float v2 = 8;
			
		Calculadora calc = new Calculadora();
		float mult = calc.multiplicar(v1, v2);
		
		assertEquals(8, mult, 0);
	}
	
	@Test
	public void deveriaTirarRaizQuadrada() throws Exception {
		int v1 = 25;
		
		Calculadora calc = new Calculadora();
		int raiz = calc.calcularRaizQuadrada(v1);
		
		assertEquals(5, raiz);
	}
}