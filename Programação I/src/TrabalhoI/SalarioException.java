package TrabalhoI;

import javax.swing.JOptionPane;

public class SalarioException extends Throwable {

	private float n;

	public SalarioException(float salario) {
		n = salario;
	}

	public void salarioInvalido() {
		if (n < 545f) {
			JOptionPane.showMessageDialog(null, "Salário menor do que o mínimo", "Salário",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
