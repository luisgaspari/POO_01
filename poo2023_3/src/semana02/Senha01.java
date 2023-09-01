package semana02;

public class Senha01 {

	public static void main(String[] args) {
		// Gerar senha de 10 dígitos com números

		String senha = "";
		final int LIMITE = 10;

		for(int c=1; c<=10; c++) {
			int n = (int)(Math.random()*LIMITE); // pega número entre 0 e 9
			senha += n;
		}
		
		System.out.println(senha);
	}

}
