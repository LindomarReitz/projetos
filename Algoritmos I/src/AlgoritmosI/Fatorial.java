package AlgoritmosI;

import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
	int numero, fatorial=1;
	
	numero= Integer.parseInt(JOptionPane.showInputDialog("N�mero:"));
	
	for(int i=2; i<=numero; i++){
		
	fatorial= fatorial*i;	
		
	}//for
	
	JOptionPane.showMessageDialog(null, "O fatorial de "+numero+" �: "+fatorial);
		
	}//Main

}//Class
