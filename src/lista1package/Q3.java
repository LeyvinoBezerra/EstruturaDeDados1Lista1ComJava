package lista1package;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com um Numero:");
		int num1 = ler.nextInt();

		System.out.println("Entre com outro Numero:");
		int num2 = ler.nextInt();

		System.out.printf("\nResultados:\n");
		System.out.printf("%d + %d = %3d\n", num1, num2, (num1 + num2));
		System.out.printf("%d - %d = %3d\n", num1, num2, (num1 - num2));
		System.out.printf("%d * %d = %3d\n", num1, num2, (num1 * num2));
		System.out.printf("%d / %d = %3d\n", num1, num2, (num1 / num2));
		System.out.printf("%d % %d = %3d\n", num1, num2, (num1 % num2));
	}

}
