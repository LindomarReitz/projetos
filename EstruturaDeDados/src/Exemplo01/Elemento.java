package Exemplo01;

import javax.swing.JOptionPane;

class Elemento {
	
	String info;
	Elemento proximo;

}//Class

class ListaSimples{
	
	public static void main(String[] args) {
		
		Elemento inicio= null;
		Elemento fim= null;
		Elemento ponteiro= null;
	
		//Elemento 'a'
		Elemento e= new Elemento(); //Instanciando a variável da classe Elemento
		e.info= "a";
		e.proximo= null;
		fim= e;
		ponteiro= e;
	
		//Elemento 'b'
		e= new Elemento();
		e.info= "b";
		e.proximo= ponteiro; //Substituindo o elemento anterior
		ponteiro= e;
	
		//Elemento 'c'
		e= new Elemento();
		e.info= "c";
		e.proximo= ponteiro;
		ponteiro= e;
		inicio= e;
	
		ponteiro= inicio;
	
		while(ponteiro != null){
	
			JOptionPane.showMessageDialog(null, "Elemento: "+ponteiro.info);
			ponteiro= ponteiro.proximo;
		
		}//while	

	}//Main	
	
}//Class
