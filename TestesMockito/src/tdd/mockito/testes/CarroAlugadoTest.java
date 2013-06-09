package tdd.mockito.testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import tdd.mockito.carroalugado.CarroAlugado;
import tdd.mockito.carroalugado.IAlugaCarro;
import tdd.mockito.cliente.Cliente;

public class CarroAlugadoTest {
	@Mock
	private IAlugaCarro alugaCarro;
	
	public CarroAlugadoTest() {
		this.alugaCarro = Mockito.mock(Cliente.class); 
	}
	
	@Test
	public void deveriaAlugarCarroParaCliente() {
		CarroAlugado carro = new CarroAlugado(alugaCarro);
		String resultadoEsperado = "Lindomar nada";
		
		Mockito.when(alugaCarro.getNomeCliente()).thenReturn("Lindomar ");
		Mockito.when(alugaCarro.getModeloCarro()).thenReturn("nada");
		
		String verdadeiroResultado = carro.getAlugaCarro().getNomeCliente() + 
			carro.getAlugaCarro().getModeloCarro();
		
		Mockito.verify(alugaCarro).getNomeCliente();
		
		assertEquals(resultadoEsperado, "");
	}
	
	@Test
	public void deveriaVerificarSeUmMetodoNuncaFoiChamado() {
		CarroAlugado carro = new CarroAlugado(alugaCarro);
		
		Mockito.when(alugaCarro.getModeloCarro()).thenReturn("Civic");
		
		String modeloCarro = carro.getAlugaCarro().getModeloCarro();
		
		Mockito.verify(alugaCarro, Mockito.never()).getNomeCliente();
	}
}