package patterns.comportamental.visitor;

public class AtualizadorSalarial implements IAtualizadorDeFuncionario {
	@Override
	public void atualizar(Gerente g) {
		g.setSalario(g.getSalario() * 1.43);
	}

	@Override
	public void atualizar(Telefonista t) {
		t.setSalario(t.getSalario() * 1.27);
	}
}