package com.estudos.tarefa;

import java.util.Calendar;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class AgendaHorarioTarefa extends Activity {
	private int hora, minuto, dia, mes, ano;
	private TimePicker horarioAgendamento;
	private DatePicker dataAgendamento;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.layout_agendamento_tarefa);

		Calendar agora = Calendar.getInstance();
		hora = agora.get(Calendar.HOUR);
		minuto = agora.get(Calendar.MINUTE);
		dia = agora.get(Calendar.DAY_OF_MONTH);
		mes = agora.get(Calendar.MONTH);
		ano = agora.get(Calendar.YEAR);
		
		dataAgendamento = (DatePicker) findViewById(R.id.dataAgendamento);
		dataAgendamento.init(ano, mes, dia, null);
		
		horarioAgendamento = (TimePicker) findViewById(R.id.timePickerAgendamento);
		horarioAgendamento.setIs24HourView(true);
		horarioAgendamento.setCurrentHour(hora);
		horarioAgendamento.setCurrentMinute(minuto);
		
		
		Button botaoAlterarHorario = (Button) findViewById(R.id.botaoAlterarHorario);
		botaoAlterarHorario.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				dia = dataAgendamento.getDayOfMonth();
				mes = dataAgendamento.getMonth();
				ano = dataAgendamento.getYear();
				
				hora = horarioAgendamento.getCurrentHour();
				minuto = horarioAgendamento.getCurrentMinute();
				
				StringBuilder textoDataHora = new StringBuilder();
				textoDataHora.append("O horário agendado é: ");
				textoDataHora.append(formatarHora(hora));
				textoDataHora.append(":");
				textoDataHora.append(formatarHora(minuto));
				textoDataHora.append(" e data é: ");
				textoDataHora.append(dia);
				textoDataHora.append("/");
				textoDataHora.append(mes + 1);
				textoDataHora.append("/");
				textoDataHora.append(ano);
				
				TextView txtHorario = (TextView) findViewById(R.id.txtHoraAgendada);
				txtHorario.setText(textoDataHora.toString());
				txtHorario.setTextColor(Color.RED);				
			}
		});
		
		Button botaoConfigurarHorario = (Button) findViewById(R.id.botaoConfigurarHorario);
		botaoConfigurarHorario.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				TimePickerDialog timerPickerDialog = new TimePickerDialog(AgendaHorarioTarefa.this,
						null, hora, minuto, true);
				timerPickerDialog.show();
			}
		});
	}
	
	public String formatarHora(int tempo) {
		if (tempo >= 10)
			return String.valueOf(tempo);
		else
			return "0" + String.valueOf(tempo);
	}
}