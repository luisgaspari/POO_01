package semana02;

import javax.swing.JOptionPane;

public class DoWhile01 {

	public static void main(String[] args) {
		
		float nota1,nota2;
		
		do {
			nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota1?"));
		}
		while(nota1<0 || nota1>10);

	}

}
