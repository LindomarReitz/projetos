package AlgoritmosI;

import javax.swing.JOptionPane;

public class Cotacao {

	public static void main(String[] args) {
	//Us�rio deve informar um valor em dolares e deve-se saber o valor em reais	
	float valor, cotacao, total;	
	
	valor= Float.parseFloat(JOptionPane.showInputDialog("Valor em dol�res:"));
	cotacao= Float.parseFloat(JOptionPane.showInputDialog("Cota��o:"));	
	
	total= valor*cotacao;
	
	JOptionPane.showMessageDialog(null, "O valor em reais �: "+"R$ "+total);
	
	}//Main

}//Class
