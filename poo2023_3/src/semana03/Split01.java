package semana03;

public class Split01 { // Split = Fatiar

	public static void main(String[] args) {
		
		String nomes = "Paulo;Sandro;Bianca;Paula";
		String[] v = nomes.split(";"); // Vetor Array
		
		System.out.println(v[0]);
		System.out.println(v[1]);
		System.out.println(v[2]);
		System.out.println(v[3]);
		
		// Tratar erros em Java
		System.out.println(v[4]);
		
	}
}
