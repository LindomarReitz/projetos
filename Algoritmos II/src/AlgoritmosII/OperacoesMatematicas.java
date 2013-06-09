package AlgoritmosII;

import javax.swing.JOptionPane;

public class OperacoesMatematicas {
	
	static int n1, n2;
	
	public static void digitar() {	
		n1= Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));	
		n2= Integer.parseInt(JOptionPane.showInputDialog("Número 2:"));		
	}//Método digitar
	
	public static void somar() {	
		int soma;	

		soma= n1+n2;
	
		JOptionPane.showMessageDialog(null, "A soma é: "+soma);
	}//Método somar
	
	public static void subtrair() {
		int total;
	
		total= n1-n2;
		
		JOptionPane.showMessageDialog(null, "A subtração é: "+total);
	}//Método subtrair
	
	public static void dividir() {
		float total;
	
		total= n1/n2;
		
		JOptionPane.showMessageDialog(null, "O total da divisão é: "+total);	
	}//Método dividir
	
	public static void multiplicar() {
		int mult;
	
		mult= n1*n2;
		
		JOptionPane.showMessageDialog(null, "A multiplicação é: "+mult);
	}//Método multiplicar
	
	public static void main(String[] args) {
		digitar();
		somar();
		subtrair();
		dividir();
		multiplicar();
	}//Main	
}//Class
