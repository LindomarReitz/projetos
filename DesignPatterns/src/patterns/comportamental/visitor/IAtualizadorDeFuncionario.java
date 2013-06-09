package patterns.comportamental.visitor;

public interface IAtualizadorDeFuncionario {
	public void atualizar(Gerente g);
	public void atualizar(Telefonista t);
}