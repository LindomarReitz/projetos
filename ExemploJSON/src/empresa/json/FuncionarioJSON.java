package empresa.json;

import org.json.JSONException;
import org.json.JSONObject;

import empresa.beans.Funcionario;

public class FuncionarioJSON {
	public void lerDadosJSON() throws JSONException {
		JSONObject json = adicionarDados();
		
		System.out.println("ID: " + json.get("id"));
		System.out.println("Nome: " + json.get("nome"));
		System.out.println("Salário: " + json.get("salario"));
		System.out.println("Autonômo: " + json.get("autonomo"));
	}
	
	public void lerObjetoJSON() throws JSONException {
		JSONObject json = adicionarFuncionario();
		
		System.out.println(json.get("Funcionario"));
	}
	
	public JSONObject adicionarFuncionario() throws JSONException {
		Funcionario f = new Funcionario(1, "Lindomar", 500, false);
		
		JSONObject json = new JSONObject();
		json.put("Funcionario", f); //Adicionando o objeto inteiro no JSON
		
		return json;
	}
	
	public JSONObject adicionarDados() throws JSONException {
		Funcionario f = new Funcionario(2, "Alguém", 600, true);
		
		JSONObject json = new JSONObject();
		json.put("id", f.getId()); //Adicionando atributos no JSON
		json.put("nome", f.getNome());
		json.put("salario", f.getSalario());
		json.put("autonomo", f.isAutonomo());
		
		return json;
	}
}