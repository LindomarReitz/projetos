package empresa.json;

import org.json.JSONException;
import org.json.JSONObject;

import empresa.beans.Empresa;

public class EmpresaJSON {
	public void lerDadosJSON() throws JSONException {
		JSONObject json = adicionarDados();
		
		System.out.println("CNPJ: " + json.get("cnpj"));
		System.out.println("Nome: " + json.get("nome"));
		System.out.println("Razão Social: " + json.get("razaoSocial"));
		System.out.println("Capital Aberto: " + json.get("capitalAberto"));
	}
	
	public void lerObjetoJSON() throws JSONException {
		JSONObject json = adicionarEmpresa();
		
		System.out.println(json.get("Empresa"));
	}
	
	public JSONObject adicionarEmpresa() throws JSONException {
		Empresa e = new Empresa(1234, "A", "Alguma coisa", true);
		
		JSONObject json = new JSONObject();
		json.put("Empresa", e); //Adicionando o objeto inteiro no JSON
		
		return json;
	}
	
	public JSONObject adicionarDados() throws JSONException {
		Empresa e = new Empresa(1235, "B", "Alguma coisa", false);
		
		JSONObject json = new JSONObject();
		json.put("cnpj", e.getCnpj()); //Adicionando atributos no JSON
		json.put("nome", e.getNome());
		json.put("razaoSocial", e.getRazaoSocial());
		json.put("capitalAberto", e.isCapitalAberto());
		
		return json;
	}
}