package AlgoritmosI;

import javax.swing.JOptionPane;

public class MediaEscolar {

	public static void main(String[] args) {
    //Usu�rio digita tr�s notas e deve-se saber a m�dia para determinar se o aluno est� aprovado, reprovado ou em recupera��o
	String nome;
	float nota1, nota2, nota3, media;	
	
	nome= JOptionPane.showInputDialog("Nome:");
	nota1= Float.parseFloat(JOptionPane.showInputDialog("Nota 1:"));
	nota2 =Float.parseFloat(JOptionPane.showInputDialog("Nota 2:"));
	nota3= Float.parseFloat(JOptionPane.showInputDialog("Nota 3:"));
	
	media= (nota1+nota2+nota3)/3;		
	
	if(media>=7f){
	
	JOptionPane.showMessageDialog(null, "Aluno: "+nome+"\nAprovado: "+media);	
		
	}//if aprovado
	else{
	if(media>2 && media<=6.9f){
	
    JOptionPane.showMessageDialog(null, "Aluno: "+nome+"\nRecupera��o: "+media);		
		
	}//if recupera��o
	else{	
	JOptionPane.showMessageDialog(null, "Aluno: "+nome+"\nReprovado: "+media);		
	
	  }//else
	
	}//else	
		
	}//Main

}//Class
