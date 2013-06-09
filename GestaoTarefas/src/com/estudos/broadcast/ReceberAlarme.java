package com.estudos.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.estudos.notificacao.NotificacaoTarefaCriada;

public class ReceberAlarme extends BroadcastReceiver {
	private static final String CATEGORIA = "livro";

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i(CATEGORIA, "Alarme disparado!");
		
		Toast.makeText(context, "Alarme disparado!", Toast.LENGTH_SHORT).show();
		
		Intent it = new Intent(context, NotificacaoTarefaCriada.class);
		it.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		context.startActivity(it);
	}
}