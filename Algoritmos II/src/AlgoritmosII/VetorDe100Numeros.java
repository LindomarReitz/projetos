package AlgoritmosII;

import javax.swing.JOptionPane;

public class VetorDe100Numeros {
	
	static int n[], quantidade=0;
	
	public void cadastrar(int i){
		
	n[i]= Integer.parseInt(JOptionPane.showInputDialog("N�mero: "+i));	
		
	}//M�todo cadastrar
	
	public void contador(){
	if(quantidade<100){
	cadastrar(quantidade);
	quantidade++;	
	}//if
	else
	JOptionPane.showMessageDialog(null, "Cadastro lotado", "Cadastro", JOptionPane.WARNING_MESSAGE);

	}//M�todo contador
	
	public void inicializar(){
	
	n= new int[100];
		
	}//M�todo inicializar
	
	public void posicaoInicial(){
		
		
		
	}//M�todo posi��o inicial
	
	public void posicaoFinal(){
		
		

	}//M�todo posicao final
	
	public static void menu(){
		
		
		
	}//M�todo menu
	
	public static void main(String[] args) {

	menu();	

	}//Main

}//Class
