package exemplos2.heranca;

public class AlunoDeMestrado extends Aluno{
	private String area;
	private boolean tese;
	
	public AlunoDeMestrado(int id, String nome, int idade, char sexo, String curso, boolean matriculado,
			float [] notas, String area, boolean tese) {
		super(id, nome, idade, sexo, curso, matriculado, notas);
		this.area = area;
		this.tese = tese;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public boolean isTese() {
		return tese;
	}

	public void setTese(boolean tese) {
		this.tese = tese;
	}
	
	public String toString() {
		String saida = "";
		
		super.toString();
		saida += "Área: " + getArea() + "\n";
		saida += "Fez teste: " + isTese() + "\n";
		 
		return saida;
	}
}
