package AlgoritmosI;

import javax.swing.JOptionPane;

public class Cotacao {

	public static void main(String[] args) {
	//Usário deve informar um valor em dolares e deve-se saber o valor em reais	
	float valor, cotacao, total;	
	
	valor= Float.parseFloat(JOptionPane.showInputDialog("Valor em doláres:"));
	cotacao= Float.parseFloat(JOptionPane.showInputDialog("Cotação:"));	
	
	total= valor*cotacao;
	
	JOptionPane.showMessageDialog(null, "O valor em reais é: "+"R$ "+total);
	
	}//Main

}//Class
