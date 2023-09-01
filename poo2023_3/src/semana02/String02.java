package semana02;

public class String02 {

	public static void main(String[] args) throws InterruptedException {
		
		String s = "Aula de POO";
		int tamanho = s.length(); //11
		
		for(int i=0; i<tamanho; i++) {
			System.out.println(s.charAt(i));
		}
		
		for(int i=0; i<tamanho; i++) {
			System.out.print(s.charAt(i));
			Thread.sleep(200);
		}
	

	}

}
