package TrabalhoI;

import javax.swing.JOptionPane;

public class IdadeException extends Throwable {

	private int n;

	public IdadeException(int id) {
		id = this.n;
	}

	public void idadeInvalida() {
		JOptionPane.showMessageDialog(null, "Idade inválida, tente novamente...", "ID",
					JOptionPane.WARNING_MESSAGE);
	}
}
