package TrabalhoI;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int op = 0, n;

		Funcionario f[] = new Funcionario[3];
		f[0] = new Programador(0, "a", 0, 'm', 0, "A");
		f[1] = new DesignGrafico(0, "a", 0, 'm', 0, "a");
		f[2] = new DesignDeSom(0, "a", 0, 'm', 0, "a");

		while (op != 5) {

			try {
				op = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar\n2- Listar" +
								"\n3- Excluir\n4- Atualizar\n5- Sair"));

				switch (op) {
					
				
				case 1: int op1 = Integer.parseInt(JOptionPane.showInputDialog("1- Cadastrar programador" +
						"\n2- Cadastrar design gráfico"+ "\n3- Cadastrar design de som"));
					switch (op1) {
						case 1: f[0].cadastrar();
						break;

						case 2: f[1].cadastrar();
						break;

						case 3: f[2].cadastrar();
						break;
					}
				break;
		
				case 2: JOptionPane.showMessageDialog(null, "Programadores:\n" + f[0].toString()+ "\nDesigners gráficos:\n"
									+ f[1].toString()+"\nDesigners de som:\n"+f[2].toString());
						break;

				case 3: n = Integer.parseInt(JOptionPane.showInputDialog("Digite um ID para excluir:"));
							for (int i = 0; i < 3; i++){
								f[i].excluir(n);
							}
							break;

				case 4: n = Integer.parseInt(JOptionPane.showInputDialog("Digite um ID para atualizar:"));
					    for (int i = 0; i < 3; i++) {
					    	f[i].atualizar(n);
					}
				}

			} catch (IdadeException e) {
				e.idadeInvalida();
				e.printStackTrace(); // Rastreando o erro na pilha de código(Método/linha)
			} catch (SalarioException e) {
				e.salarioInvalido();
				e.printStackTrace();
			}
		}
	}
}
