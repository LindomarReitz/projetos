package AlgoritmosI;

import javax.swing.JOptionPane;

public class FuncionarioFabric {

	public static void main(String[] args) {
   //Usuário informa a quantidade de funcionários e deve-se saber se a maior quantidade são homens ou mulheres
   int quantidade1, quantidade2;
   
   quantidade1= Integer.parseInt(JOptionPane.showInputDialog("Quantidade de homens:"));
   quantidade2= Integer.parseInt(JOptionPane.showInputDialog("Quantidade de mulheres:"));
   
   if(quantidade1 > quantidade2){
	   
   JOptionPane.showMessageDialog(null, "A maioria são homens");	   
	   
   }//if
   else
   JOptionPane.showMessageDialog(null, "A maioria são mulheres");
  
	}//Main

}//Class
