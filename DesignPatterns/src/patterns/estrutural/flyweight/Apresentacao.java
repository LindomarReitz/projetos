package patterns.estrutural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Apresentacao {
	private List<Slide> slides = new ArrayList<Slide>();
	
	public void adicionarSlide(Slide slide) {
		slides.add(slide);
	}
	
	public void imprimir() {
		for (Slide s : this.slides) {
			s.imprimir();
			System.out.println();
		}
	}
}