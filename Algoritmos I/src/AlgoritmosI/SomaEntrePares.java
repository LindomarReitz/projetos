package AlgoritmosI;

import javax.swing.JOptionPane;

public class SomaEntrePares {

	public static void main(String[] args) {
   // Saber a soma entre pares de dois números informados pelo usuário

	    int valor1, valor2, par, soma=0;

	    valor1= Integer.parseInt(JOptionPane.showInputDialog("Informe valor 1:"));
	    valor2= Integer.parseInt(JOptionPane.showInputDialog("Informe valor 2:"));

	    for (par=valor1; par<=valor2; par=par+2){
	    	
	    if (valor1%2!=0){
	    valor1++;
	    soma=soma+par;
	    }//if
	    else
	    if (valor2!=0){
	    soma=soma+par;    
	    }//if
	   
	    }//For
	    
	    JOptionPane.showMessageDialog(null, "A soma dos pares é: "+soma);
		
	}//Main

}//Class
