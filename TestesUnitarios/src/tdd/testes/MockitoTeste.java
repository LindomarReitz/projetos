package tdd.testes;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.mockito.InOrder;

public class MockitoTeste {
	@SuppressWarnings("rawtypes")
	private List mockedList = mock(List.class);
	
	@Test
	@SuppressWarnings("unchecked")
	public void deveriaFuncionarOMockito() {
		mockedList.add("one");
		mockedList.clear();
		
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}
	
	@Test
	public void deveriaFuncionarMockitoComLinkedList() {
		when(mockedList.get(0)).thenReturn("first");
		when(mockedList.get(1)).thenThrow(new RuntimeException());
		
		System.out.println(mockedList.get(0));
		System.out.println(mockedList.get(1));
		System.out.println(mockedList.get(100));
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void deveriaFuncionarPorNumeroDeInvocacoes() {
		mockedList.add("um");
		
		mockedList.add("dois");
		mockedList.add("dois");
		
		mockedList.add("três");
		mockedList.add("três");
		mockedList.add("três");
		
		verify(mockedList).add("um");
		verify(mockedList, times(1)).add("um");
		
		verify(mockedList, times(2)).add("dois");
		verify(mockedList, times(1)).add("três");
		
		verify(mockedList, never()).add("nunca aconteceu");
		
		verify(mockedList, atLeastOnce()).add("três vezes");
		verify(mockedList, atLeast(2)).add("cinco vezes");
		verify(mockedList, atMost(5)).add("três vezes");
	}
	
	@Test(expected = RuntimeException.class)
	public void deveriarLancarExcecaoComMockNulo() {
		doThrow(new RuntimeException()).when(mockedList).clear();
		
		mockedList.clear(); // Lança RuntimeException
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void deveriaVerificarEmOrdem() {
		@SuppressWarnings("rawtypes")
		List singleMock = mock(List.class);
		
		singleMock.add("foi adicionado primeiro");
		singleMock.add("foi adicionado depois");
		
		InOrder inOrder = inOrder(singleMock);
		
		inOrder.verify(singleMock).add("foi adicionado primeiro");
		inOrder.verify(singleMock).add("foi adicionado depois");
		
		@SuppressWarnings("rawtypes")
		List firstMock = mock(List.class);
		@SuppressWarnings("rawtypes")
		List secondMock = mock(List.class);
		
		firstMock.add("Um");
		secondMock.add("Dois");
	
		InOrder ordem = inOrder(firstMock, secondMock);
		ordem.verify(firstMock).add("Um");
		ordem.verify(secondMock).add("Dois");
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void deveriaVerificarOcorrenciaDeMock() {
		@SuppressWarnings("rawtypes")
		List mockTwo = mock(List.class); 
		
		mockedList.add("a"); // Usando mocks
		
		verify(mockedList).add("a"); // Verificação em ordem
		verify(mockedList, never()).add("b"); // Verificar se nunca foi chamado
		
		verifyZeroInteractions(mockedList, mockTwo); // Verificar se não houve interações
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void deveriaVerificarInvocacoesRedundantes() {
		mockedList.add("a");
		mockedList.add("b");
	
		verify(mockedList).add("a");
	
		verifyNoMoreInteractions(mockedList); // A verificação falha
	}
}