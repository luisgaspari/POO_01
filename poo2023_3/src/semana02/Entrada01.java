package semana02;

import java.util.Scanner;

public class Entrada01 {

	public static void main(String[] args) {
		// Entrada de dados com Scanner

		Scanner sc = new Scanner(System.in); // Scanner = Classe / sc = objeto
		
		/*
		System.out.println("Entre com a largura");
		int largura = sc.nextInt(); // nextInt() = método
		System.out.println("Entre com o comprimento");
		int comprimento = sc.nextInt();
		int area = largura * comprimento;
		*/
		
		System.out.println("Entre com a largura");
		double largura = sc.nextDouble(); // nextInt() = método
		System.out.println("Entre com o comprimento");
		double comprimento = sc.nextDouble();
		double area = largura * comprimento;
		System.out.println("Area: " + area);
		
		sc.close();
	}

}
