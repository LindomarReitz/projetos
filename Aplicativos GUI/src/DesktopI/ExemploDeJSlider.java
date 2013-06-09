package DesktopI;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ExemploDeJSlider extends JFrame{
	
	private JSlider slide, slide1;
	private PainelOval oval; //Variável da classe PainelOval

	public ExemploDeJSlider() {
		super("Exemplo de JSlider");
		
		oval= new PainelOval(); //Alocando o objeto oval na memória
		oval.setBackground(Color.GREEN); //Setando uma cor de fundo da classe Color
		
		slide1= new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		slide1.setMajorTickSpacing(10); //Setando a marca de medida em 10 em 10
		slide1.setPaintTicks(true); //Pinta as marcas do JSlider
		
		slide1.addChangeListener(
				new ChangeListener(){

					public void stateChanged(ChangeEvent e) {
					
						oval.setDiametro(slide1.getValue()); //Pegando o valor da oval
						
					}//Método stateChanged
						
				}//Class	
		);
		
		add(slide1, BorderLayout.SOUTH);
		add(oval, BorderLayout.CENTER);
		
	}//Construtor

	public static void main(String[] args) {
		
		ExemploDeJSlider slide= new ExemploDeJSlider();
		slide.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		slide.setSize(400,400);
		slide.setVisible(true);

	}//Main

}//Class
