package DesktopI;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PainelOval extends JPanel{
	
	private int diametro;

	public void paintComponent(Graphics g){
		
		super.paintComponent(g); //Pintando a superclasse
		g.fillOval(10, 10, diametro, diametro);
		
	}//M�todo paintComponent
	
	public void setDiametro(int diametro){
		//Caso seja uma valor inv�lido, configura o diametro para 10
		this.diametro= (diametro >= 0 ? diametro : 10);
		repaint(); //Repinta o painel(atualiza)
		
	}//M�todo setDiametro
	
	public Dimension getPreferredSize(){
		
		return new Dimension(200,200);
		
	}//M�todo getPreferredSize

	public Dimension getMinimumSize(){
		
		return getPreferredSize();
		
	}//M�todo getMinimumSize
	
}//Class
