package DesktopI;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class PainelDePintura extends JPanel {

	private int contador= 0;
	private Point pontos[]= new Point[10000];
	
	public PainelDePintura() {
		
		addMouseMotionListener(
			new MouseMotionAdapter(){
				
				public void mouseDragged(MouseEvent e){
					
					if(contador < pontos.length){
						
						pontos[contador]= e.getPoint(); //Pegando o ponto que vai ser desenhado
						contador++;
						repaint(); //Repinta a janela
						
					}//if
					
				}//Método mouseDragged
					
			}//Class
		);
			
	}//Construtor
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		for(int i=0; i<contador; i++){
			
			g.fillOval(pontos[i].x, pontos[i].y, 4, 4); //Jogando por parâmeto a dimensão do desenho
			
		}//for
		
	}//Método paintComponent

}//Class
