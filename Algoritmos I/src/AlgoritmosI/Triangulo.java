package AlgoritmosI;

import javax.swing.JOptionPane;

public class Triangulo {

	public static void main(String[] args) {
    //Usu�rio digita as medidas do tri�ngulo e deve-se saber se ele � equil�tero, is�seles ou escaleno
	float lado1, lado2, lado3;
	
	lado1= Float.parseFloat(JOptionPane.showInputDialog("Lado 1:"));
	lado2 =Float.parseFloat(JOptionPane.showInputDialog("Lado 2:"));
	lado3= Float.parseFloat(JOptionPane.showInputDialog("Lado 3:"));
	
	if(lado1==lado2 && lado2==lado3 && lado3==lado1){
		
	JOptionPane.showMessageDialog(null, "O tri�ngulo � equil�tero");	
		
	}//if
	else{
	if(lado1==lado2 || lado2==lado3 || lado3==lado1){
	
	JOptionPane.showMessageDialog(null, "O tri�ngulo � is�seles");
		
	}//if is�seles
	else
	JOptionPane.showMessageDialog(null, "O tri�ngulo � escaleno");	
			
	}//else
	

	}//Main

}//Class
