package AlgoritmosI;

import javax.swing.JOptionPane;

public class Projecao {

	public static void main(String[] args) {
	int hAtual, hFinal=60, tempo;
	float vendas, media, total;
	
	vendas= Float.parseFloat(JOptionPane.showInputDialog("N�mero de vendas:"));
	hAtual= Integer.parseInt(JOptionPane.showInputDialog("Minuto atual:"));
	
	media= vendas/hAtual;
	tempo= hFinal-hAtual; 
	total= (media*tempo)+(media*hAtual);
	
	JOptionPane.showMessageDialog(null, "A proje��o de vendas na hora � de: "+total);	
	
	}//Main
}//Class
