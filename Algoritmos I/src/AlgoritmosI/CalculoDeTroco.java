package AlgoritmosI;

import javax.swing.JOptionPane;

public class CalculoDeTroco {

	public static void main(String[] args) {
	//Calculo de um caixa eletronico	
    	
	    float valor, notasde2, notasde1, notasde5, notasde10, notasde50, notasde100;

	    valor= Float.parseFloat(JOptionPane.showInputDialog("Informe o valor"));
	    notasde100= (valor/100);
	    notasde50= (valor%100)/50;
	    notasde10= ((valor%100)%50)/10;
	    notasde5=(((valor%100)%50)%10)/5;
	    notasde2= ((((valor%100)%50)%10)%5)/2;
	    notasde1= (((((valor %100)%50)%10)%5)%2);

	    JOptionPane.showMessageDialog(null, "\n Notas de 100: "+notasde100+"\n Notas de 50: "+
	    notasde50+"\nNotas de 10: "+notasde10+"\nNotas de 5: "+notasde5+"\nNotas de 2: "+
	    notasde2+"\nNotas de 1: "+notasde1);	

	}//Main

}//Class
