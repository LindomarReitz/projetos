package com.estudos.tarefa;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.estudos.beans.Tarefa;

public class ListaFavoritosActivity extends ListActivity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	List<Tarefa> tarefas = new ArrayList<Tarefa>();
		tarefas.add(new Tarefa("Tarefa 1", Tarefa.FAVORITO));
		tarefas.add(new Tarefa("Tarefa 2", Tarefa.FAVORITO));
		tarefas.add(new Tarefa("Tarefa 3", Tarefa.FAVORITO));
		
		setListAdapter(new TarefaAdapter(this, tarefas));
    }
    
    protected void onListItemClick(ListView listView, View view, int position, long id) {
    	super.onListItemClick(listView, view, position, id);
    	
    	// Pega o item naquela posição
    	Tarefa tarefa = (Tarefa) this.getListAdapter().getItem(position);
    	
    	Toast.makeText(this, "Você selecionou a tarefa: " + tarefa.getNome(), 
				Toast.LENGTH_SHORT).show();
    }
}