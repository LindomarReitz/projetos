package AlgoritmosI;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
	//Usuário informa um número e deve-se saber se ele é par ou ímpar
	int numero;
	
	numero= Integer.parseInt(JOptionPane.showInputDialog("Número:"));
	
	if(numero%2==0){
		
	JOptionPane.showMessageDialog(null, "O número "+numero+" é par");	
			
	}//if par
	else
    JOptionPane.showMessageDialog(null, "O número "+numero+" é ímpar");		
		
	}//Main

}//Class
