package AlgoritmosI;

import javax.swing.JOptionPane;

public class DescontoDeProdutos2 {

	public static void main(String[] args) {
    // Saber o desconto que o cliente vai ter nos produtos A, B, C, D e E

        String nome;
        int quantidade;
        float valor, bruto, categoriaA,categoriaB, categoriaC, categoriaD, categoriaE;
        char categoria;

        nome= JOptionPane.showInputDialog("Informe nome cliente:");
        valor= Float.parseFloat(JOptionPane.showInputDialog("Informe valor:"));
        quantidade= Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade:"));
        categoria= (JOptionPane.showInputDialog("Informe Categoria A/B/C/D/E:")).charAt(0);
        
        bruto= valor*quantidade;
        categoriaA= bruto-(bruto*0.1f);
        categoriaB= bruto-(bruto*0.15f);
        categoriaC= bruto-(bruto*0.2f);
        categoriaD= bruto-(bruto*0.25f);
        categoriaE= bruto-(bruto*0.50f);
        
        if (categoria=='A'||categoria=='a'){
        JOptionPane.showMessageDialog(null, "O valor com desconto é: "+"R$ "+categoriaA);
        }//if
        else
        if (categoria=='B'||categoria=='b'){
        JOptionPane.showMessageDialog(null, "O valor com desconto é: "+"R$ "+categoriaB);
        }//if
        else
        if(categoria=='C'||categoria=='c'){
        JOptionPane.showMessageDialog(null, "O valor com desconto é: "+"R$ "+categoriaC);
        }//if
        else
        if (categoria=='D'||categoria=='d'){
        JOptionPane.showMessageDialog(null, "O valor com desconto é: "+"R$ "+categoriaD);
        }//if
        else
        JOptionPane.showMessageDialog(null, "O valor com desconto é: "+"R$ "+categoriaE);	
		

	}//Main

}//Class
