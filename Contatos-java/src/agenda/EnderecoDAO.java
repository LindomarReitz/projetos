package agenda;

import java.util.ArrayList;

import connection.AbstractDAO;

public class EnderecoDAO extends AbstractDAO<EnderecoVO> {

	public EnderecoDAO() {
		super("Enderecos");
 	}
	
	public ArrayList<EnderecoVO> getByContato(int contatoID)
	{
		String sql = String.format("SELECT * from enderecos WHERE idcontato=%s",contatoID);
		return getRowsFromSql(sql);
	}

}