package AlgoritmosI;

import javax.swing.JOptionPane;

public class ComparandoDatas {
	
	public static void main(String[] args) {
	int dia1, dia2, mes1, mes2, ano1, ano2, total, total1, total2;
	
	dia1= Integer.parseInt(JOptionPane.showInputDialog("Dia inicial:"));
	mes1= Integer.parseInt(JOptionPane.showInputDialog("Mês inicial:"));
	ano1= Integer.parseInt(JOptionPane.showInputDialog("Ano inicial:"));
	
	dia2= Integer.parseInt(JOptionPane.showInputDialog("Dia final:"));
	mes2= Integer.parseInt(JOptionPane.showInputDialog("Mês final:"));
	ano2= Integer.parseInt(JOptionPane.showInputDialog("Ano final:"));
	
	total1= dia1+(mes1*30)+(ano1*365);
	total2= dia2+(mes2*30)+(ano2*365);
	
	total= total2-total1;
	
	JOptionPane.showMessageDialog(null,"A diferença entre "+dia1+"/"+mes1+"/"+ano1+" e "+dia2+"/"+mes2+"/"+ano2+" em dias é: "+total);
	
	}//Main

}//Class
