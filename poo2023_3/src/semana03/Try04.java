package semana03;

import javax.swing.JOptionPane;

public class Try04 {

	public static void main(String[] args) {
		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade?"));
			int media = 100 / idade;
			
			String[] nomes = {"Sérgio","Ana"};
			System.out.println(nomes[idade]);
			
			JOptionPane.showMessageDialog(null, "Tudo certo! \n" + media);
		} 
		catch (NumberFormatException|ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Deu pau! \n" + e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Problema no Indice!");
		}

	}

}
