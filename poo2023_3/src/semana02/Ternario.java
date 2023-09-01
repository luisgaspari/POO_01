package semana02;

public class Ternario {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		/*
		if(a>b) {
			System.out.println(a);
		}
		else if (b>a) {
			System.out.println(b);
		}
		else {
			System.out.println("Iguais");
		}
		*/
				
		int maior = a>b?a:b>a?b:a;
		System.out.println(maior);
			
		String s = a>b?""+a:b>a?""+b:"iguais";
		System.out.println(s);
		
		System.out.println(a>b?""+a:b>a?""+b:"iguais");
		
	}

}
