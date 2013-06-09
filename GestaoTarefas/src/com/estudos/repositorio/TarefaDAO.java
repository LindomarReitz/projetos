package com.estudos.repositorio;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.estudos.beans.Tarefa;

public class TarefaDAO {
	private SQLiteDatabase banco = null;
	private static final String CATEGORIA = "livro";
	private static final String NOME_BASE_DADOS = "tarefas.db";
	private static final String TABELA_TAREFAS = "tarefas";
	private List<Tarefa> tarefas;
	
	public TarefaDAO(Context context) {
		banco = context.openOrCreateDatabase(NOME_BASE_DADOS, Context.MODE_PRIVATE, null);
		criarBanco();
	}
	
	private void criarBanco() {
		StringBuilder sql = new StringBuilder();
		sql.append("create table if not exists tarefas (");
		sql.append("_id integer primary key, nome varchar(25), ");
		sql.append("descricao varchar(50));");
		
		banco.execSQL(sql.toString());
		
		Log.i(CATEGORIA, "tabela criada com sucesso!");		
	}
	
	public void salvar(Tarefa tarefa) {
		ContentValues conteudo = new ContentValues();
		conteudo.put("nome", tarefa.getNome());
		conteudo.put("descricao", tarefa.getDescricao());
		
		banco.insert(TABELA_TAREFAS, null, conteudo);

		Log.i(CATEGORIA, "Inserção feita com sucesso. Nome da tarefa: " + tarefa.getNome());
	}
	
	public void atualizar(Tarefa tarefa) {
		ContentValues conteudo = new ContentValues();
		conteudo.put("nome", tarefa.getNome());
		conteudo.put("descricao", tarefa.getDescricao());
		
		banco.update(TABELA_TAREFAS, conteudo, "_id=?", new String[]{String.valueOf(tarefa.getId())});
	}
	
	public void excluir(Long id) {
		banco.delete(TABELA_TAREFAS, "_id=?", new String[]{String.valueOf(id)});
	}
	
	public List<Tarefa> listar() {
		Cursor cursor = banco.query(true, TABELA_TAREFAS, null, null, null, 
				null, null, null, null);
    	
    	tarefas = new ArrayList<Tarefa>();
    	Tarefa tarefa = new Tarefa();
    	
		if (cursor.moveToNext()) {
			int indiceId = cursor.getColumnIndex("_id");
			int indiceNome = cursor.getColumnIndex("nome");
			int indiceDescricao = cursor.getColumnIndex("descricao");	
			do {
				tarefa.setId(cursor.getLong(indiceId));
				tarefa.setNome(cursor.getString(indiceNome));
				tarefa.setDescricao(cursor.getString(indiceDescricao));
				
				tarefas.add(tarefa);
			} while (cursor.moveToNext());
		}
		
		return tarefas;
	}
	
	public Tarefa buscarTarefaPeloID(Long id) {
		Cursor cursor = banco.query("tarefas", null, "_id=?", new String[]{String.valueOf(id)}, 
				null, null, null);
	
		if (cursor.getCount() > 0) {
			cursor.moveToFirst();
			
			int indiceNome = cursor.getColumnIndex("nome");
			int indiceDescricao = cursor.getColumnIndex("descricao");	
			
			Tarefa tarefa = new Tarefa();
			tarefa.setNome(cursor.getString(indiceNome));
			tarefa.setDescricao(cursor.getString(indiceDescricao));

			return tarefa;
		}
		return null;
	}
	
	public void fecharConexao() {
		if (banco != null)
			banco.close();
	}
}