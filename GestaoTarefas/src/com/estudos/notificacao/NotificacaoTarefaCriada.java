package com.estudos.notificacao;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.estudos.tarefa.R;
import com.estudos.tarefa.TabHostTarefas;

public class NotificacaoTarefaCriada extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String tickerText = "Voc� recebeu uma mensagem";

		CharSequence titulo = "Gest�o de tarefas";
		CharSequence mensagem = "Visualizar tarefa criada.";
		
		criarNotificacao(this, tickerText, titulo, mensagem, TabHostTarefas.class);
	}
	
	protected void criarNotificacao(Context context, CharSequence mensagemBarraStatus, 
			CharSequence titulo,CharSequence mensagem, Class<?> activity) {
		// Recupera o servi�o do NotificationManager
		NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

		Notification notificacao = new Notification(R.drawable.ic_launcher, mensagemBarraStatus, System.currentTimeMillis());

		// PendingIntent para executar a Activity se o usu�rio selecionar a notifica��o
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, activity), 0);
		
		// Informa��es
		notificacao.setLatestEventInfo(this, titulo, mensagem, pendingIntent);

		// id (numero �nico) que identifica esta notifica��o
		nm.notify(R.string.app_name, notificacao);
	}
}