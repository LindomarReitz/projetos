package patterns.estrutural.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PosVenda {
	public void agendarContato(String cliente, String produto) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 30);
		String format = new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime());
		
		System.out.println("Entrar em contato com " + cliente 
				+ " sobre o produto " + produto + " no dia " + format); 
	}
}