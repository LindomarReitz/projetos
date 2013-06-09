package DesktopI;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PainelOval extends JPanel{
	
	private int diametro;

	public void paintComponent(Graphics g){
		
		super.paintComponent(g); //Pintando a superclasse
		g.fillOval(10, 10, diametro, diametro);
		
	}//Método paintComponent
	
	public void setDiametro(int diametro){
		//Caso seja uma valor inválido, configura o diametro para 10
		this.diametro= (diametro >= 0 ? diametro : 10);
		repaint(); //Repinta o painel(atualiza)
		
	}//Método setDiametro
	
	public Dimension getPreferredSize(){
		
		return new Dimension(200,200);
		
	}//Método getPreferredSize

	public Dimension getMinimumSize(){
		
		return getPreferredSize();
		
	}//Método getMinimumSize
	
}//Class
