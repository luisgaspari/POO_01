package semana03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try05 {

	public static void main(String[] args) {
		// Exemplo de CHECKED exception
		
		// BufferedReader br = new BufferedReader(new FileReader("file.txt")); // Linha com erro
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		for(int i=1; i<=10; i++) {
			System.out.println(1);
			// Thread.sleep(1000); // linha com errp
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}


		}

	}

}
