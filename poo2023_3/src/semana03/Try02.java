package semana03;

import javax.swing.JOptionPane;

public class Try02 {

	public static void main(String[] args) {
		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
			int media = 100 / idade;
			JOptionPane.showMessageDialog(null, "Tudo certo! \n" + media);
		} 
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Deu pau! \n" + e);
		}
		catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Idade não pode ser Zero! \n" + e);
		}

	}

}
