package com.estudos.tarefa;

import java.util.List;

import android.app.ListActivity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.estudos.beans.Tarefa;
import com.estudos.repositorio.TarefaDAO;

public class ListaTarefaActivity extends ListActivity {
	private static final int CADASTRAR = 1;
	private static final int EDITAR = 2;
	
	private TarefaDAO repositorio = null;
	private List<Tarefa> tarefas;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
 
    	cancelarNotificacao();
    	
    	repositorio = new TarefaDAO(this);
        listarTodos();
    }
    
    public void listarTodos() {
    	tarefas = repositorio.listar();
		
		if (tarefas.size() == 0)
			Toast.makeText(this, "Nenhuma tarefa cadastrada!", Toast.LENGTH_SHORT).show();

		setListAdapter(new TarefaAdapter(this, tarefas));
    }
    
    @Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
		
		MenuItem item = menu.add(0, CADASTRAR, 0, "Cadastrar");
		item.setIcon(R.drawable.new_task_light);
		
		return true;
	}
    
    @Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		switch (item.getItemId()) {
		case CADASTRAR:
			startActivityForResult(new Intent(this, CadastroTarefaActivity.class), CADASTRAR);
			return true;
		}
		return false;
	}
    
    protected void onListItemClick(ListView listView, View view, int position, long id) {
    	super.onListItemClick(listView, view, position, id);
    	
    	editarTarefa(position);
    }
    
    public void editarTarefa(int posicao) {
		Tarefa tarefa = tarefas.get(posicao);

		Intent it = new Intent(this, EditarTarefa.class);
		it.putExtra("id", tarefa.getId());

		startActivityForResult(it, EDITAR);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	super.onActivityResult(requestCode, resultCode, data);
    	if (resultCode == RESULT_OK)
    		listarTodos();
    }
    
    private void cancelarNotificacao() {
		NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		nm.cancel(R.string.app_name);
    }
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	
    	if (repositorio != null)
    		repositorio.fecharConexao();
    }
}