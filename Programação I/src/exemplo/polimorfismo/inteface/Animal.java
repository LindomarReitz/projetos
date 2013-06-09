package exemplo.polimorfismo.inteface;

public class Animal implements Contrato {

	private int id;
	private String especie;
	private boolean mamifero;

	public Animal(int id, String especie, boolean mamifero) {
		this.id = id;
		this.especie = especie;
		this.mamifero = mamifero;
	}

	@Override
	public void cadastrar() {
		
	}

	@Override
	public String listar() {
		String saida = "";
		
		saida += "ID: " + getId() + "\n"; 
		saida += "Espécie: " + getEspecie() + "\n";
		saida += "Mamífero? " + isMamifero() + "\n";
	
		return saida;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public boolean isMamifero() {
		return mamifero;
	}

	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}
}
