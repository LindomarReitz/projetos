package AlgoritmosI;

import javax.swing.JOptionPane;

public class ParesEntreDoisNumeros {
	
	public static void main(String[] args) {
    // Saber os pares entre dois números escolhidos pelo usuário
	    
	    String saida="";
	    int valor1, valor2, par;
	    
	    valor1= Integer.parseInt(JOptionPane.showInputDialog("Informe valor 1:"));
	    valor2= Integer.parseInt(JOptionPane.showInputDialog("Informe valor 2:"));
	    
	    if (valor1%2!=0){
	    valor1++;
	    }//if
	    else
	    if (valor2%2!=0){
	    valor2--;    
	    }//if
	    
	    for (par=valor1; par<=valor2; par=par+2){
	    
	    saida= saida+par+",";
	    
	    }//for
	    
	    JOptionPane.showMessageDialog(null, "O números pares são: "+saida);
	    	
	}//Main

}//Class
