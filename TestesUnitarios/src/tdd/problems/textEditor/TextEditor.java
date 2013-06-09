package tdd.problems.textEditor;

public class TextEditor {

	public String cortarEspacosNoFinal(String texto) {
		if (texto.startsWith(" ")) 
			return texto;
		
		if (texto.contains("'\'")) 
			return texto.replace("'\'", ""); 
			
		return texto.trim();
	}

	public String cortarEspacosParaCadaLinha(String texto) {
		return texto.replace(" ", "");
	}

	public String deixarNaMesmaString(String texto) {
		return texto.concat("");
	}
}