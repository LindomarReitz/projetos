package patterns.criacao.factoryMethod;

public class Main {
	// Objetivo: Encapsular a escolha da classe concreta a ser utilizada 
	// na criação de objetos de um determinado tipo
	public static void main(String[] args) {
		IEmissor emissor = EmissorCreator.create(EmissorCreator.EMAIL);
		emissor.enviar("Teste com Factory Method");
	}
}