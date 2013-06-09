package patterns.estrutural.flyweight;

public class Slide {
	private ITemaFlyweight tema;
	private String titulo;
	private String texto;
	
	public Slide(ITemaFlyweight tema, String titulo, String texto) {
		this.tema = tema;
		this.titulo = titulo;
		this.texto = texto;
	}
	
	public void imprimir() {
		this.tema.imprimir(titulo, texto);
	}
}