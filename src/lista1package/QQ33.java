package lista1package;

import java.util.Scanner;

public class QQ33 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String frase = "Leyva bezerra";
		int[] quantidades = new int[26];

		for (char c : frase.toUpperCase().toCharArray()) {
		    int indice = c - 65;
		    if (indice >= 0 && indice < 26) {
		        quantidades[indice] += 1;
		    }
		}

		for (int i = 0; i < quantidades.length; i++) {
		    char letra = (char) (i + 65);
		    System.out.println(letra + "=" + quantidades[i]);
		}

}
}