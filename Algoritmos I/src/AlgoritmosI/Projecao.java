package AlgoritmosI;

import javax.swing.JOptionPane;

public class Projecao {

	public static void main(String[] args) {
	int hAtual, hFinal=60, tempo;
	float vendas, media, total;
	
	vendas= Float.parseFloat(JOptionPane.showInputDialog("Número de vendas:"));
	hAtual= Integer.parseInt(JOptionPane.showInputDialog("Minuto atual:"));
	
	media= vendas/hAtual;
	tempo= hFinal-hAtual; 
	total= (media*tempo)+(media*hAtual);
	
	JOptionPane.showMessageDialog(null, "A projeção de vendas na hora é de: "+total);	
	
	}//Main
}//Class
