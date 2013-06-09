package patterns.estrutural.adapter;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ControleDePontoNovo {
	public void registrar(Funcionario f, boolean entrada) {
		Calendar data = Calendar.getInstance();
		String format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(data.getTime());
		
		if (entrada) {
			System.out.println("Entrada: " + f.getNome() + " às " + format);
		} else {
			System.out.println("Saída: " + f.getNome() + " às " + format);
		}
	}
}