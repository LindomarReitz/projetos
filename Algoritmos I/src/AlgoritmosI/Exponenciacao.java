package AlgoritmosI;

import javax.swing.JOptionPane;

public class Exponenciacao {

	public static void main(String[] args) {
	// Saber a exponencia��o, atraves de um n�mero de base e expoente do usu�rio

	    int base, expoente, numero;
	    float exponencial=1;
	    boolean trocou_sinal= true;
	    
	    base= Integer.parseInt(JOptionPane.showInputDialog("Informe base:"));
	    expoente= Integer.parseInt(JOptionPane.showInputDialog("Informe expoente:"));

	    if (expoente<0){
	    trocou_sinal=true;
	    expoente= expoente*-1;
	    }//if
	    
	    for (numero=1; numero<=expoente;numero= numero+1){
	    exponencial= exponencial*base;
	    }//For
	    
	    if (trocou_sinal){
	    exponencial= 1/exponencial;
	    }//if
	   
	    JOptionPane.showMessageDialog(null, "A exponencia��o �: "+exponencial, "Exponencia��o", JOptionPane.INFORMATION_MESSAGE);	
		
	}//Main

}//Class
