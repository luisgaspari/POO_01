package semana03;

public class Array01 {

	public static void main(String[] args) {
		// 3 maneiras de criar um Array
		
		String[] nomes = {"Ana","Bia"};
		
		String[] produtos = new String[2];
		produtos[0] = "Sabão";
		produtos[1] = "Sabonete";
		
		String n = "Paulo;Sandro;Bianca;Paula";
		String[] v = n.split(";");
		
		//Percorrer todos os elementos do Array
		for(int i=0; i<v.length; i++) {
			System.out.println(v[i]);
		}
		
		// iterator - Percorrer todos os elementos do Array
		for(String s:v) {
			System.out.println(s);
		}
		
		

	}

}
