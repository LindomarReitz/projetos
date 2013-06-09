package AlgoritmosI;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
    //Pedir ao usuário o numero de termos para fazer a formula fibonacci
	    
	    String saida= "";
	    int fibo=0, ant=1, post=1, quantidade, soma=0;
	    
	    quantidade= Integer.parseInt(JOptionPane.showInputDialog("Quantidade:"));
	    
	    for (int i=1; i<=quantidade; i++){
	    if (i==1){
	    saida= saida+fibo;
	    }
	    else{
	    fibo= ant+post;
	    saida= saida+","+fibo;
	    ant= post;
	    post= fibo;
	    }//else
	    soma= soma+fibo;
	    }//For
	    
	    JOptionPane.showMessageDialog(null, saida+"\nSoma: "+soma);	
		
	

	}//Main

}//Class
