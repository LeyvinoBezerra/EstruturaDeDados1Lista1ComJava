package lista1package;

import java.util.Scanner;

public class QQ12 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a primeira NOta:");
		float nota1 = ler.nextFloat();

		System.out.println("Digite a segunda NOta:");
		float nota2 = ler.nextFloat();

		System.out.println("Digite a terceira NOta:");
		float nota3 = ler.nextFloat();

		float media = ((nota1 + nota2 + nota3) / 3);

		if (media < 3.5) {
			System.out.println("Reprovado: " + media);

		} else if (media == 3.5 | media < 7) {
			System.out.println("Recuperação: " + media);
		} else if (media >= 7) {
			System.out.println("Aprovado: " + media);
		}

	}

}
