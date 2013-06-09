package AlgoritmosI;

import javax.swing.JOptionPane;

public class ContadorDeHoras {

	public static void main(String[] args) {
	//Usuário informa o número de segundos e deve-se saber a quantidade de horas	
		
		int h, m, s, tempo;
	    
	    tempo= Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de segundos"));
	    h=  tempo/3600;
	    m= (tempo%3600)/60;
	    s= ((tempo%3600)%60);
	    
	    JOptionPane.showMessageDialog(null,((h>=10)?h:"0"+h)+":"+((m>=10)?m:"0"+m)+":"+((s>=10)?s:"0"+s));	
		
	}//Main

}//Class
