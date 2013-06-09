package AlgoritmosI;

import javax.swing.JOptionPane;

public class NotasComPesos {
	
	public static void main(String[] args) {
	//Usuário informa três notas com os seus pesos e deve-se saber a média do aluno
		
		String nome;
	    float nota1, nota2, nota3, peso1, peso2, peso3, soma, media;
	    
	    nome= JOptionPane.showInputDialog("Informe o nome");
	    nota1= Float.parseFloat(JOptionPane.showInputDialog("Informe nota 1:"));
	    nota2= Float.parseFloat(JOptionPane.showInputDialog("Informe nota 2:"));
	    nota3= Float.parseFloat(JOptionPane.showInputDialog("Informe nota 3:"));
	    peso1= Float.parseFloat(JOptionPane.showInputDialog("Informe peso 1:"));
	    peso2= Float.parseFloat(JOptionPane.showInputDialog("Informe peso 2:"));
	    peso3= Float.parseFloat(JOptionPane.showInputDialog("Informe peso 3:"));
	    
	    soma= (nota1*peso1)+(nota2*peso2)+(nota3*peso3);
	    media= soma/(peso1+peso2+peso3);
	    
	    JOptionPane.showMessageDialog(null,"Aluno: "+nome+"\nMédia: "+media);	

	}//Main

}//Class
