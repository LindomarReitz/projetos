package AlgoritmosII;

import javax.swing.JOptionPane;

public class OperacoesMatematicas {
	
	static int n1, n2;
	
	public static void digitar() {	
		n1= Integer.parseInt(JOptionPane.showInputDialog("N�mero 1:"));	
		n2= Integer.parseInt(JOptionPane.showInputDialog("N�mero 2:"));		
	}//M�todo digitar
	
	public static void somar() {	
		int soma;	

		soma= n1+n2;
	
		JOptionPane.showMessageDialog(null, "A soma �: "+soma);
	}//M�todo somar
	
	public static void subtrair() {
		int total;
	
		total= n1-n2;
		
		JOptionPane.showMessageDialog(null, "A subtra��o �: "+total);
	}//M�todo subtrair
	
	public static void dividir() {
		float total;
	
		total= n1/n2;
		
		JOptionPane.showMessageDialog(null, "O total da divis�o �: "+total);	
	}//M�todo dividir
	
	public static void multiplicar() {
		int mult;
	
		mult= n1*n2;
		
		JOptionPane.showMessageDialog(null, "A multiplica��o �: "+mult);
	}//M�todo multiplicar
	
	public static void main(String[] args) {
		digitar();
		somar();
		subtrair();
		dividir();
		multiplicar();
	}//Main	
}//Class
