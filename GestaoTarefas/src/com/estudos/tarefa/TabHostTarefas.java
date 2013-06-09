package com.estudos.tarefa;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;

public class TabHostTarefas extends TabActivity implements OnTabChangeListener {
	private static final String CATEGORIA = "livro";
	
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		TabHost tabHost = getTabHost();
		tabHost.setOnTabChangedListener(this);

		TabSpec abaTarefas = tabHost.newTabSpec("Tarefas");
		abaTarefas.setIndicator("Lista de Tarefas", getResources().getDrawable(R.drawable.list));
		abaTarefas.setContent(new Intent(this, ListaTarefaActivity.class));
		tabHost.addTab(abaTarefas);
		
		TabSpec abaFavoritos = tabHost.newTabSpec("Favoritos");
		abaFavoritos.setIndicator("Favoritos", getResources().getDrawable(R.drawable.favorite));
		abaFavoritos.setContent(new Intent(this, ListaFavoritosActivity.class));
		tabHost.addTab(abaFavoritos);
	}

	public void onTabChanged(String tabId) {
		Log.i(CATEGORIA, "Trocou aba: " + tabId);
	}
}