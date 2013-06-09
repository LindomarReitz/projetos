package AlgoritmosI;

import javax.swing.JOptionPane;

public class Pares0a100 {

	public static void main(String[] args) {
    //Mostrar todos os números pares no intervalo de 0 a 100
	String saida="";	
	
	for(int i=0; i<=100; i=i+2){
		
	saida= saida+i+",";		
		
	}//for
		
	JOptionPane.showMessageDialog(null, "Os pares de 0 a 100 são: "+saida);

	}//Main

}//Class
