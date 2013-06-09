package br.unisul.factory;

import br.unisul.interfaces.IDAOGenerico;

public class FabricaGenerica {

	public static IDAOGenerico<?> getDAOGenerico() {
		try {
			Class c = Class.forName("br.unisul.interfaces.exemplos.AlunoUFSC");
			return (IDAOGenerico<?>) c.newInstance();
		} catch (Exception e) {
			System.out.println("Erro ao encontrar classe!" + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}
