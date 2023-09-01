package semana01;

public class TipoDados {

	public static void main(String[] args) {
		
		// tipos primitivos
		int a = 5;
		int b = 10;
		int c = 20;
		float nota = 3.45f; // f no final informa que o valor é Float
		double f = 3.7657594621;
		char g = 'A';
		boolean h = true;
		byte idade = 120;  // -128 a 128??
		long inteiroGrande = 999999999;
		
		// Classes
		String nome = "Luis Gaspari";
		System.out.println(nome.length());
		Float not = 2.34f;
				
		
		//Conversão de dados - Casting
		//converter de um tipo menor para um tipo maior - Widening Casting
		int idade2 = idade;
		double idade3 = idade2;
		// conversão manual - Narrowing Casting 
		int valorInt = (int)f; // variavel f é double
		byte valorByte = (byte)nota; //onde nota é um numero float
		
		String s = "100";
		int varInt = Integer.parseInt(s);
		float varFloat = Float.parseFloat(s);
		double varDouble = Double.parseDouble(s);
		
		
		
		
		// syso -> CTRL+Space:
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(nota);
		
		
		

	}

}
