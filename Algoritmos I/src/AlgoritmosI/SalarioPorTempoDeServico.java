package AlgoritmosI;

import javax.swing.JOptionPane;

public class SalarioPorTempoDeServico {

	public static void main(String[] args) {
    // Saber o salários de dois funcionários, difereciando pelo tempo de serviço

		   String nome1, nome2;
		   int quantidade, tempo1, tempo2;
		   float valor=10f, abono1, abono2, abono3, bruto;

		   nome1= JOptionPane.showInputDialog("Informe funcionário 1:");
		   nome2= JOptionPane.showInputDialog("Informe funcionário 2:");
		   tempo1= Integer.parseInt(JOptionPane.showInputDialog("Informe tempo de serviço 1:"));
		   tempo2= Integer.parseInt(JOptionPane.showInputDialog("Informe tempo de serviço 2:"));
		   quantidade= Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade:"));
		 
		   bruto= valor*quantidade;
		   abono1= (bruto*0.05f)+bruto;
		   abono2= (bruto*0.1f)+bruto;
		   abono3= (bruto*0.15f)+bruto;

		   if (tempo1<5){
		   JOptionPane.showMessageDialog(null, "Funcionário: "+nome1+"\nSalário Bruto: "+"R$ "+bruto+
		   "\nSalário Líquido: "+"R$ "+abono1);
		   }//if
		   else
		   if (tempo1>=5 && tempo1<=10){
		   JOptionPane.showMessageDialog(null, "Funcionário: "+nome1+"\nSalário Bruto: "+"R$ "+bruto+
	       "\nSalário Líquido: "+"R$ "+abono2);
		   }//if
		   else
		   if (tempo1>10){
		   JOptionPane.showMessageDialog(null, "Funcionário: "+nome1+"\nSalário Bruto: "+"R$ "+bruto+
		   "\nSalário Líquido: "+"R$ "+abono3);
		   }//if
		  
		   if (tempo2<5){
		   JOptionPane.showMessageDialog(null, "Funcionário: "+nome2+"\nSalário Bruto: "+"R$ "+bruto+
		   "\n Salário Líquido: "+"R$ "+abono1);
		   }//if
		   else
		   if (tempo2>=5&&tempo2<=10){
		   JOptionPane.showMessageDialog(null, "Funcionário: "+nome2+"\nSalário Bruto: "+"R$ "+bruto+
		   "\nSalário Líquido: "+"R$ "+abono2);
		   }//if
		   else
		   if (tempo2>10){
		   JOptionPane.showMessageDialog(null, "Funcionário: "+nome2+"\nSalário Bruto: "+"R$"+bruto+
		   "\nSalário Líquido"+"R$"+abono3);
		   }//if	
		
		
	}//Main

}//Class
