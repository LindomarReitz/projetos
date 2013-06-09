package AlgoritmosI;

import javax.swing.JOptionPane;

public class DiferencaDuasDatas {

	public static void main(String[] args) {
	    // Saber a quantidade de dias entre duas datas distintas
	    
	    int dia1, mes1, ano1, total1, dia2,mes2, ano2,total2;
	    int total;
	    
	    dia1= Integer.parseInt(JOptionPane.showInputDialog("Informe o Dia 1"));
	    mes1= Integer.parseInt(JOptionPane.showInputDialog("Informe o Mês 1"));
	    ano1= Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano 1"));
	    dia2= Integer.parseInt(JOptionPane.showInputDialog("Informe o Dia 2"));
	    mes2= Integer.parseInt(JOptionPane.showInputDialog("Informe o Mês 2"));
	    ano2= Integer.parseInt(JOptionPane.showInputDialog("Informe o Ano 2"));
	    
	    total1= dia1+(mes1*30)+(ano1*365);
	    total2= dia2+(mes2*30)+(ano2*365);
	    total= total2-total1;
	    
	    JOptionPane.showMessageDialog (null,"O data entre "+dia1+"/"+mes1+"/"+ano1+" e "+dia2+"/"+mes2+"/"+ano2+" em dia(s) é de: "+total);	
		
		
	

	}//Main

}//Class
