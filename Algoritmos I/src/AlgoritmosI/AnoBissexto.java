package AlgoritmosI;

import javax.swing.JOptionPane;

public class AnoBissexto {
	
	public static void main(String[] args) {
	//Usuário informa um ano e deve-se saber se é bissexto ou não
	int ano;
	
	ano= Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
	
	if(ano%4==0 && ano%100!=0 || (ano%400==0)){
		
	JOptionPane.showMessageDialog(null, "O ano de "+ano+" é bissexto");	
		
	}//if
	else
    JOptionPane.showMessageDialog(null, "O ano de "+ano+" não é bissexto");

	}//Main

}//Class
