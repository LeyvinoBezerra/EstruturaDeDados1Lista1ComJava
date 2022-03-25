package lista1package;

import java.util.Scanner;

public class QQ17 {

	public static void main(String[] args) {
		int a, b;
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com dois valores \n");
		a = ler.nextInt();
		b = ler.nextInt();

		while (a <= b) {
			if (a % 2 != 0)
				System.out.println(a);
			a++;
		}
	}

}
