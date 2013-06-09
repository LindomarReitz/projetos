package AlgoritmosII;

import javax.swing.JOptionPane;

public class VetorDe100Numeros {
	
	static int n[], quantidade=0;
	
	public void cadastrar(int i){
		
	n[i]= Integer.parseInt(JOptionPane.showInputDialog("Número: "+i));	
		
	}//Método cadastrar
	
	public void contador(){
	if(quantidade<100){
	cadastrar(quantidade);
	quantidade++;	
	}//if
	else
	JOptionPane.showMessageDialog(null, "Cadastro lotado", "Cadastro", JOptionPane.WARNING_MESSAGE);

	}//Método contador
	
	public void inicializar(){
	
	n= new int[100];
		
	}//Método inicializar
	
	public void posicaoInicial(){
		
		
		
	}//Método posição inicial
	
	public void posicaoFinal(){
		
		

	}//Método posicao final
	
	public static void menu(){
		
		
		
	}//Método menu
	
	public static void main(String[] args) {

	menu();	

	}//Main

}//Class
