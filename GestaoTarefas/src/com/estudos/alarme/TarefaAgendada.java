package com.estudos.alarme;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class TarefaAgendada extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		TextView texto = new TextView(this);
		texto.setText("Alarme será disparado!");
		texto.setTextColor(Color.RED);
		
		setContentView(texto);
		
		criarAlarme();
	}

	private void criarAlarme() {		
		Intent intent = new Intent("DISPARAR_ALARME");
		PendingIntent pedingIntent = PendingIntent.getBroadcast(TarefaAgendada.this, 0, intent, 0);
		
		Calendar tempoAtual = Calendar.getInstance();
		tempoAtual.setTimeInMillis(System.currentTimeMillis());
		tempoAtual.add(Calendar.SECOND, 5);

		long tempoAlarme = tempoAtual.getTimeInMillis();
		
		AlarmManager alarme = (AlarmManager) getSystemService(ALARM_SERVICE);
		// Ativar alarme nos próximos 5 segundos
		alarme.set(AlarmManager.RTC_WAKEUP, tempoAlarme, pedingIntent);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		Intent intent = new Intent("DISPARAR_ALARME");
		PendingIntent pedingIntent = PendingIntent.getBroadcast(TarefaAgendada.this, 0, intent, 0);
		
		AlarmManager alarme = (AlarmManager) getSystemService(ALARM_SERVICE);
		alarme.cancel(pedingIntent);
	}
}