	package lista1package;

import java.util.Scanner;

public class QQ21 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int Num1, Num2;

		System.out.println(" saber se o numero e Primo:");
		Num1 = ler.nextInt();

		Num2 = Num1;

		for (; Num2 > 0; Num2--) {

			if (Num1 % Num2 == 0 && Num1 != Num2 || Num1 == 1) {
				System.out.println("O Numero nao eh primo ");
				break;
			} else if (Num2 == 2) {
				System.out.println("O Numero eh Primo");
				break;
			}
		}
	}

}
