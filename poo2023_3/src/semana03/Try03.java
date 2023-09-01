package semana03;

import javax.swing.JOptionPane;

public class Try03 {

	public static void main(String[] args) {

		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
			int media = 100 / idade;
			JOptionPane.showMessageDialog(null, "Tudo certo! \n" + media);
		} 
		catch (Exception e) {
			if (e.toString().indexOf("Number") >= 0) {
				JOptionPane.showMessageDialog(null, "Valor inválido!");
			}
			else if (e.toString().indexOf("Arith") >= 0) {
				JOptionPane.showMessageDialog(null, "Valor não pode ser Zero!");
			}
		}

	}

}
