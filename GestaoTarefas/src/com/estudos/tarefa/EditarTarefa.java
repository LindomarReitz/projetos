package com.estudos.tarefa;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.estudos.beans.Tarefa;
import com.estudos.repositorio.TarefaDAO;

public class EditarTarefa extends Activity {
	private static final int AGENDAR = 0;
	private Long id;
	private EditText campoNome;
	private EditText campoDescricao;
	private TarefaDAO dao;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.layout_edicao_tarefas);
		
		dao = new TarefaDAO(this);
		
		campoNome = (EditText) findViewById(R.id.nomeTarefa);
		campoDescricao = (EditText) findViewById(R.id.descricaoTarefa);
		
		editarTarefa();
		
		Button botaoEditar = (Button) findViewById(R.id.btnEditar);
		botaoEditar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
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
					tarefa.setId(id);
					
					dao.atualizar(tarefa);
					
					setResult(RESULT_OK, new Intent());
					finish();
				}
			}
		});
		
		Button botaoExcluir = (Button) findViewById(R.id.btnExcluir);
		botaoExcluir.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				AlertDialog.Builder alerta = new AlertDialog.Builder(EditarTarefa.this);
				alerta.setTitle(R.string.tituloAlertaExclusao);
				alerta.setMessage(R.string.alertaExclusao);
				
				alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						excluir(id);
						
						setResult(RESULT_OK, new Intent());
						finish();
					}
				});
				
				alerta.setNegativeButton("Não", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface arg0, int arg1) {
						return;
					}
				});
				alerta.show();
			}
		});
	}
	
	public void editarTarefa() {
		Bundle extras = getIntent().getExtras();
		extras.get("id");
	
		if (extras != null) {
			id = extras.getLong("id");
			
			if (id != null) {
				Tarefa tarefa = buscarTarefaPeloID(id);
				
				if (tarefa != null) {					
					campoNome.setText(tarefa.getNome());
					campoDescricao.setText(tarefa.getDescricao());				
				}
			}
		}
	}
	
	public Tarefa buscarTarefaPeloID(Long id) {
		return dao.buscarTarefaPeloID(id);
	}
	
	public void excluir(Long id) {
		dao.excluir(id);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuItem item = menu.add(0, AGENDAR, 0, "Agendar Tarefa");
		item.setIcon(R.drawable.alarm_light);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
		case AGENDAR:
			startActivity(new Intent(this, AgendaHorarioTarefa.class));
			break;
		default:
			break;
		}
		return super.onMenuItemSelected(featureId, item);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		if (dao != null)
			dao.fecharConexao();
	}
}	