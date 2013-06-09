package patterns.comportamental.command;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos {
	private List<IComando> comandos = new ArrayList<IComando>();
	
	public void adicionar(IComando comando) {
		this.comandos.add(comando);
	}
	
	public void executar() {
		for (IComando comando : this.comandos) {
			comando.executar();
		}
	}
}