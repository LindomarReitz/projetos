package AlgoritmosI;

import javax.swing.JOptionPane;

public class FuncionarioFabric {

	public static void main(String[] args) {
   //Usu�rio informa a quantidade de funcion�rios e deve-se saber se a maior quantidade s�o homens ou mulheres
   int quantidade1, quantidade2;
   
   quantidade1= Integer.parseInt(JOptionPane.showInputDialog("Quantidade de homens:"));
   quantidade2= Integer.parseInt(JOptionPane.showInputDialog("Quantidade de mulheres:"));
   
   if(quantidade1 > quantidade2){
	   
   JOptionPane.showMessageDialog(null, "A maioria s�o homens");	   
	   
   }//if
   else
   JOptionPane.showMessageDialog(null, "A maioria s�o mulheres");
  
	}//Main

}//Class
