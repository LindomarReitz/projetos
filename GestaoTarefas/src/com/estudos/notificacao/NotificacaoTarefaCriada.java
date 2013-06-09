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
		
		String tickerText = "Você recebeu uma mensagem";

		CharSequence titulo = "Gestão de tarefas";
		CharSequence mensagem = "Visualizar tarefa criada.";
		
		criarNotificacao(this, tickerText, titulo, mensagem, TabHostTarefas.class);
	}
	
	protected void criarNotificacao(Context context, CharSequence mensagemBarraStatus, 
			CharSequence titulo,CharSequence mensagem, Class<?> activity) {
		// Recupera o serviço do NotificationManager
		NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

		Notification notificacao = new Notification(R.drawable.ic_launcher, mensagemBarraStatus, System.currentTimeMillis());

		// PendingIntent para executar a Activity se o usuário selecionar a notificação
		PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, new Intent(this, activity), 0);
		
		// Informações
		notificacao.setLatestEventInfo(this, titulo, mensagem, pendingIntent);

		// id (numero único) que identifica esta notificação
		nm.notify(R.string.app_name, notificacao);
	}
}