package AlgoritmosI;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
    //Usuário digita as medidas do triângulo e deve-se saber se ele é equilátero, isóseles ou escaleno
	float lado1, lado2, lado3;
	
	lado1= Float.parseFloat(JOptionPane.showInputDialog("Lado 1:"));
	lado2 =Float.parseFloat(JOptionPane.showInputDialog("Lado 2:"));
	lado3= Float.parseFloat(JOptionPane.showInputDialog("Lado 3:"));
	
	if(lado1==lado2 && lado2==lado3 && lado3==lado1){
		
	JOptionPane.showMessageDialog(null, "O triângulo é equilátero");	
		
	}//if
	else{
	if(lado1==lado2 || lado2==lado3 || lado3==lado1){
	
	JOptionPane.showMessageDialog(null, "O triângulo é isóseles");
		
	}//if isóseles
	else
	JOptionPane.showMessageDialog(null, "O triângulo é escaleno");	
			
	}//else
	

	}//Main

}//Class
