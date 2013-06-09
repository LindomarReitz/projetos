package AlgoritmosI;

import javax.swing.JOptionPane;

public class MediaEscolar {

	public static void main(String[] args) {
    //Usuário digita três notas e deve-se saber a média para determinar se o aluno está aprovado, reprovado ou em recuperação
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
	
    JOptionPane.showMessageDialog(null, "Aluno: "+nome+"\nRecuperação: "+media);		
		
	}//if recuperação
	else{	
	JOptionPane.showMessageDialog(null, "Aluno: "+nome+"\nReprovado: "+media);		
	
	  }//else
	
	}//else	
		
	}//Main

}//Class
