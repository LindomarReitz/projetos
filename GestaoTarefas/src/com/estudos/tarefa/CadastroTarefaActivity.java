package com.estudos.tarefa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.estudos.beans.Tarefa;
import com.estudos.notificacao.NotificacaoTarefaCriada;
import com.estudos.repositorio.TarefaDAO;

public class CadastroTarefaActivity extends Activity {
	private static final String CATEGORIA = "livro";
	
	private TarefaDAO dao;
	
	@Override
	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		
		setContentView(R.layout.layout_cadastro_tarefas);

		dao = new TarefaDAO(this);

		Button button = (Button) findViewById(R.id.btnCadastrar);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText campoNome = (EditText) findViewById(R.id.nomeTarefa);
				EditText campoDescricao = (EditText) findViewById(R.id.descricaoTarefa);
				
				String textoNome = campoNome.getText().toString();
				String textoDescricao = campoDescricao.getText().toString();
				
				if (textoNome.isEmpty()) {
					campoNome.setError("Campo nome é obrigatório!");
					campoNome.requestFocus();
				} else if (textoDescricao.isEmpty()) {
					campoDescricao.setError("Campo descrição é obrigatório!");
					campoDescricao.requestFocus();
				} else {
					Tarefa tarefa = new Tarefa(textoNome, textoDescricao);
					
					dao.salvar(tarefa);
					
					Log.i(CATEGORIA, "Inserção feita com sucesso. Nome da tarefa: " + textoNome);							
				
					startActivity(new Intent(CadastroTarefaActivity.this, NotificacaoTarefaCriada.class));
				
					setResult(RESULT_OK, new Intent());
					finish();
				}
			}
		});
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (dao != null) 
			dao.fecharConexao();
	}
}