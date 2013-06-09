package AlgoritmosI;

import javax.swing.JOptionPane;

public class MediaComWhile {

	public static void main(String[] args) {
    //Saber a média de uma turma de N alunos e mostrar aprovados, reprovados e em exame

	    String nome;
	    float notas=0, media=0, soma=0;
	    int aprovados=0, reprovados=0, exame=0, alunos=0, numnotas=0;
	    char continuar='S', adicionar='S';
	    
	    while (continuar=='S'){
	    nome= JOptionPane.showInputDialog("Aluno:");
	    numnotas= Integer.parseInt(JOptionPane.showInputDialog("Número de notas:"));
	    alunos++;
	    for (int i=1; i<=numnotas; i++){
	    do{
	    notas= Float.parseFloat(JOptionPane.showInputDialog("Nota:"));
	    if (notas<0) JOptionPane.showMessageDialog(null, "Nota inválida");
	    }while (notas<0);
	    
	    soma= soma+notas;
	    media= soma/numnotas;

	    }//for
	    
	    if (media>7f){
	    aprovados++;    
	    }//if
	    else
	    if(media>=2f && media<6.9f){
	    exame++;    
	    }//if
	    else
	    if (media<2f){
	    reprovados++;
	    }//if         
	    
	    continuar= JOptionPane.showInputDialog("Continuar? S/N").toUpperCase().charAt(0);
	    }//while
	    
	    JOptionPane.showMessageDialog(null, "Aprovados: "+aprovados+"\nReprovados: "+reprovados+"\nExame: "+exame);
		
	}//Main

}//Class
