package AlgoritmosI;

import javax.swing.JOptionPane;

public class NumeroCrescente {

	public static void main(String[] args) {
    //Usuário insere dois números e devem ficar em ordem crescente

        int numero1, numero2;

        numero1= Integer.parseInt(JOptionPane.showInputDialog("Informe número 1:"));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Informe número 2:"));

        if (numero1<=numero2){
        JOptionPane.showMessageDialog(null, numero1+", "+numero2);
        }//if
        else
        if (numero2<numero1){
        JOptionPane.showMessageDialog(null,numero2+", "+numero1);
        }//if	
	
	}//Main

}//Class
