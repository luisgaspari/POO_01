package semana02;

public class Math02 {

	public static void main(String[] args) {

		// double n = Math.random();

		// Megasena

		final int LIMITE = 60; // Em Java as constantes tem letras maiúsculas

		for(int c=1; c<=10; c++) { // c = número de cartões
			System.out.print("Cartão " + c + ": ");
			for(int i=1; i<=6; i++) {
				System.out.print((int)(Math.random()*LIMITE)+" ");
			}
			System.out.println();
		}
		
	}

}
