package AlgoritmosI;

import javax.swing.JOptionPane;

public class SalarioPorTempoDeServico {

	public static void main(String[] args) {
    // Saber o sal�rios de dois funcion�rios, difereciando pelo tempo de servi�o

		   String nome1, nome2;
		   int quantidade, tempo1, tempo2;
		   float valor=10f, abono1, abono2, abono3, bruto;

		   nome1= JOptionPane.showInputDialog("Informe funcion�rio 1:");
		   nome2= JOptionPane.showInputDialog("Informe funcion�rio 2:");
		   tempo1= Integer.parseInt(JOptionPane.showInputDialog("Informe tempo de servi�o 1:"));
		   tempo2= Integer.parseInt(JOptionPane.showInputDialog("Informe tempo de servi�o 2:"));
		   quantidade= Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade:"));
		 
		   bruto= valor*quantidade;
		   abono1= (bruto*0.05f)+bruto;
		   abono2= (bruto*0.1f)+bruto;
		   abono3= (bruto*0.15f)+bruto;

		   if (tempo1<5){
		   JOptionPane.showMessageDialog(null, "Funcion�rio: "+nome1+"\nSal�rio Bruto: "+"R$ "+bruto+
		   "\nSal�rio L�quido: "+"R$ "+abono1);
		   }//if
		   else
		   if (tempo1>=5 && tempo1<=10){
		   JOptionPane.showMessageDialog(null, "Funcion�rio: "+nome1+"\nSal�rio Bruto: "+"R$ "+bruto+
	       "\nSal�rio L�quido: "+"R$ "+abono2);
		   }//if
		   else
		   if (tempo1>10){
		   JOptionPane.showMessageDialog(null, "Funcion�rio: "+nome1+"\nSal�rio Bruto: "+"R$ "+bruto+
		   "\nSal�rio L�quido: "+"R$ "+abono3);
		   }//if
		  
		   if (tempo2<5){
		   JOptionPane.showMessageDialog(null, "Funcion�rio: "+nome2+"\nSal�rio Bruto: "+"R$ "+bruto+
		   "\n Sal�rio L�quido: "+"R$ "+abono1);
		   }//if
		   else
		   if (tempo2>=5&&tempo2<=10){
		   JOptionPane.showMessageDialog(null, "Funcion�rio: "+nome2+"\nSal�rio Bruto: "+"R$ "+bruto+
		   "\nSal�rio L�quido: "+"R$ "+abono2);
		   }//if
		   else
		   if (tempo2>10){
		   JOptionPane.showMessageDialog(null, "Funcion�rio: "+nome2+"\nSal�rio Bruto: "+"R$"+bruto+
		   "\nSal�rio L�quido"+"R$"+abono3);
		   }//if	
		
		
	}//Main

}//Class
