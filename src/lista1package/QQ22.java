package lista1package;

import java.util.Scanner;

public class QQ22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fat, n;
		System.out.println("Insira um valor para o qual deseja calcular seu fatorial: ");
		n = ler.nextInt();
		for (fat = 1; n > 1; n = n - 1)
			fat = fat * n;
		System.out.printf("\nFatorial calculado: %d", fat);

	}

}
