package agenda;

import connection.AbstractDAO;

public class ContatoDAO extends AbstractDAO<ContatoVO> {
	public ContatoDAO() {
		super("contatos");
	}
}