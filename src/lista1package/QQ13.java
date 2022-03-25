package lista1package;

import java.util.Scanner;

public class QQ13 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite a primeira nota: \n");
		float N1 = ler.nextFloat();

		System.out.println("Digite a Segunda nota: \n");
		float N2 = ler.nextFloat();

		System.out.println("Digite a segunda nota: \n");
		float N3 = ler.nextFloat();

		float MediaParcial = (2 * N1 + 3 * N2 + 4 * N3) / 9;

		float P4 = (50 - MediaParcial * 7) / 3;

		System.out.printf("A Media e:%f \n", MediaParcial);

		if (MediaParcial >= 0 && MediaParcial <= 3.5) {
			System.out.println("Reprovado: \n ");
			;
		}
		if (MediaParcial > 3.5 && MediaParcial < 7) {
			System.out.println("Quarta Prova: \n ");
			System.out.printf("Vai precisar:%f \n", P4);
		}
		if (MediaParcial >= 7) {
			System.out.println("Aprovado:\n");
		}

	}

}
