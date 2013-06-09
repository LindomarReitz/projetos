package AlgoritmosI;

import javax.swing.JOptionPane;

public class MaisJovem {

	public static void main(String[] args) {
    //Usuário informa nome, idade e sexo para 10 pessoas e deve-se saber o mais jovem entre eles
    String nome, jovem="";
    int idade, menor=0;
    char sexo;	
    
    for(int i=1; i<=2;i++){
     
    nome= JOptionPane.showInputDialog("Nome:");	
    idade= Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
    sexo= JOptionPane.showInputDialog("Sexo M/F:").toUpperCase().charAt(0);
    
    if(idade > menor){	
    	
    menor= idade;
    
    }//if
    
    if(idade<menor){
    
    menor= idade;	
    jovem= nome;	
    
    }//if	
   
    }//for
    
    JOptionPane.showMessageDialog(null, "O mais jovem é: "+jovem);
   	
   }//Main

}//Class
