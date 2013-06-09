package tdd.problems.SQLStringGenerator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author Lindomar Reitz
 *
 * Passos para solucionar o problema:
 * 
 * 	1 - Fazer um insert no banco de dados (memória) com uma String; (OK)
 * 	2 - Fazer um update no banco de dados (memória) com uma String; (OK)
 * 	3 - Fazer um select no banco de dados (memória) com uma String; (OK)
 * 	4 - Fazer um delete no banco de dados (memória) com uma String; (OK)
 * 	5 - Lançar execeção caso a tabela e/ou a coluna entrem como null em qualquer operação; (OK)
 */

public class SQLStringGeneratorTest {
	private SQLStringGenerator sql;
	
	@Before
	public void init() {
		sql = new SQLStringGenerator();
	}

	@Test
	public void deveriaInserirRegistro() {
		sql.setTabela("pessoas");
		sql.setColuna("id");
		
		assertEquals("insert into pessoas values id", 
				sql.inserir(sql.getTabela(),sql.getColuna()));
	}
	
	@Test
	public void deveriaAtualizarRegistro() {
		sql.setTabela("carros");
		sql.setColuna("id");
		
		assertEquals("update carros set id", 
				sql.atualizar(sql.getTabela(), sql.getColuna()));
	}
	
	@Test
	public void deveriaSelecionarRegistro() {
		sql.setTabela("casas");
		sql.setColuna("id");
		
		assertEquals("select * from casas where id", 
				sql.listar(sql.getTabela(), sql.getColuna()));
	}
	
	@Test
	public void deveriaExcluirRegistro() {
		sql.setTabela("contas");
		sql.setColuna("id");
		
		assertEquals("delete from contas where id", 
				sql.excluir(sql.getTabela(), sql.getColuna()));
	}
	
	@Test(expected = NullPointerException.class)
	public void deveriaLancarExcecaoQuandoRegistroForNull() {
		sql.inserir(null, null);
		sql.atualizar("carros", null);
		sql.listar(null, null);
		sql.excluir(null, null);
	}
}