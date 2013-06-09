package patterns.estrutural.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Estoque {
	public void enviarProduto(String produto, String enderecoDeEntrega) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, 2);
		String format = new SimpleDateFormat("dd/MM/yyyy").format(calendar
				.getTime());

		System.out.println("O produto " + produto
				+ " será entregue no endereco " + enderecoDeEntrega
				+ " até as 18h do dia " + format);
	}
}