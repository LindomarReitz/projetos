package TrabalhoI;

import javax.swing.JOptionPane;

public class IdadeException extends Throwable {

	private int n;

	public IdadeException(int id) {
		id = this.n;
	}

	public void idadeInvalida() {
		JOptionPane.showMessageDialog(null, "Idade inv�lida, tente novamente...", "ID",
					JOptionPane.WARNING_MESSAGE);
	}
}
