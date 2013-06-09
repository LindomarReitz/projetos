package AlgoritmosI;

import javax.swing.JOptionPane;

public class DescontoDeProdutos {

	public static void main(String[] args) {
		// Saber o desconto que o cliente vai ter nas suas compras

	    String nome;
	    int quantidade;
	    float valor, bruto, desconto1, desconto2, desconto3;

	    nome= JOptionPane.showInputDialog("Informe nome cliente:");
	    valor= Float.parseFloat(JOptionPane.showInputDialog("Informe valor bruto:"));
	    quantidade= Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade:"));
	    
	    bruto= valor*quantidade;
	    desconto1= bruto-(bruto*0.1f); //10% de desconto
	    desconto2= bruto-(bruto*0.15f); //15% de desconto
	    desconto3= bruto-(bruto*0.2f); //20% de desconto
	    
	    if (desconto1<50f){
	    JOptionPane.showMessageDialog(null, "O valor a ser pago é: "+"R$ "+desconto1);
	    }//if
	    else
	    if (desconto2>=50f && desconto2<=100f){
	    JOptionPane.showMessageDialog(null, "O valor a ser pago é: "+"R$ "+desconto2);
	    }//if
	    else
	    if (desconto3>100f){
	    JOptionPane.showMessageDialog(null, "O valor a ser pago é: "+"R$ "+desconto3);
	    }//if
	    
	}//Main

}//Class
