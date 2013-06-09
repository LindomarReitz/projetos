package com.estudos.tarefa;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.estudos.beans.Tarefa;

public class TarefaAdapter extends BaseAdapter {
	private Context context;
	private List<Tarefa> tarefas;
	
	public TarefaAdapter(Context context, List<Tarefa> tarefas) {
		super();
		this.context = context;
		this.tarefas = tarefas;
	}

	@Override
	public int getCount() {
		return tarefas.size();
	}

	@Override
	public Object getItem(int position) {
		return tarefas.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup viewGroup) {
		Tarefa tarefa = tarefas.get(position);
	
		LayoutInflater inflater = 
				(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View view = inflater.inflate(R.layout.layout_lista_tarefas, null);

		TextView textNome = (TextView) view.findViewById(R.id.nomeTarefa);
		textNome.setText("Nome: " + tarefa.getNome());

		ImageView img = (ImageView) view.findViewById(R.id.iconeStatus);
		img.setImageResource(tarefa.getImagem());
		
		return view;
	}
}