package TrabalhoI;

import javax.swing.JOptionPane;

public class SalarioException extends Throwable {

	private float n;

	public SalarioException(float salario) {
		n = salario;
	}

	public void salarioInvalido() {
		if (n < 545f) {
			JOptionPane.showMessageDialog(null, "Sal�rio menor do que o m�nimo", "Sal�rio",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
