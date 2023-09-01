package semana02;

import javax.swing.JOptionPane;

public class Entrada03 {

	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog("Nota 1 ?");
		
		/*
		if (s == null) {
			System.out.println("Cancelar precionado");
		}
		else {
			System.out.println("OK");
		}
		*/
		
		if (s != null && !s.equals("")) {
			// o usuário precionou OK
			float n1 = Float.parseFloat(s);
			
			s = JOptionPane.showInputDialog("Nota 2 ?"); 
			if (s != null && !s.equals("")) {
				float n2 = Float.parseFloat(s);
				
				JOptionPane.showMessageDialog(null, "A média é: " + (n1+n2)/2);
			}
			
		}

	}

}
