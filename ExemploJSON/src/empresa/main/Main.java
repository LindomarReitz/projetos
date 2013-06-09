package empresa.main;

import org.json.JSONException;

import empresa.json.EmpresaJSON;
import empresa.json.FuncionarioJSON;

public class Main {
	public static void main(String[] args) {
		try {
			EmpresaJSON empresa = new EmpresaJSON();
			empresa.lerObjetoJSON();
			empresa.lerDadosJSON();
			
			System.out.println("----------------------\n");
			
			FuncionarioJSON funcionario = new FuncionarioJSON();
			funcionario.lerObjetoJSON();
			funcionario.lerDadosJSON();
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}