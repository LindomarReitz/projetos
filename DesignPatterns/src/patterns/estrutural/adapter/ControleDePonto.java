package patterns.estrutural.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePonto {
	public void registrarEntrada(Funcionario f) {
		Calendar data = Calendar.getInstance();
		String entrada = new SimpleDateFormat("dd/MM/yyyy H:m:ss").format(data.getTime());
		System.out.println("Entrada: " + f.getNome() + " �s " + entrada);
	}
	
	public void registrarSaida(Funcionario f) {
		Calendar data = Calendar.getInstance();
		String saida = new SimpleDateFormat("dd/MM/yyyy H:m:ss").format(data.getTime());
		System.out.println("Sa�da: " + f.getNome() + " �s " + saida);
	}
}