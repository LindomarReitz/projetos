package AlgoritmosI;

import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
	//Usu�rio informa um n�mero e deve-se saber se ele � par ou �mpar
	int numero;
	
	numero= Integer.parseInt(JOptionPane.showInputDialog("N�mero:"));
	
	if(numero%2==0){
		
	JOptionPane.showMessageDialog(null, "O n�mero "+numero+" � par");	
			
	}//if par
	else
    JOptionPane.showMessageDialog(null, "O n�mero "+numero+" � �mpar");		
		
	}//Main

}//Class
