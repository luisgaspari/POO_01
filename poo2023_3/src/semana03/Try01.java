package semana03;

import javax.swing.JOptionPane;

public class Try01 {

	public static void main(String[] args) {

		// float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota?")); // Excessão UNCHECKED

		try {
			float nota = Float.parseFloat(JOptionPane.showInputDialog("Nota?"));
			JOptionPane.showMessageDialog(null, "Tudo certo!");
		} 
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Deu pau! " + e);
		}
		finally { 
			// encerramento de recursos (ex.: fechar uma conexão ccom o banco de dados) - 
			// sempre é executado, independente se deu certo ou errado
			JOptionPane.showMessageDialog(null, "Encerrou!");
		}

	}

}
