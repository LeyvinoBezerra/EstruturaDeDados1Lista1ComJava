package lista1package;

import java.util.Scanner;

public class QQ37 {

	public static int soma(int a, int b) {
		int i, soma = 0;
		if (a < b) {
			for (i = a + 1; i < b; i++)
				soma += i;
		} else {
			for (i = b + 1; i < a; i++)
				soma += i;
		}
		return soma;
	}

	public static int somaRec(int a, int b) {
		int soma = 0;
		if (a == b) {
			System.out.println("\n");
		} else {
			soma = a + somaRec(a + 1, b);
		}
		return soma;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, res;
	
	
		System.out.println("Valor 1: ");
		a = ler.nextInt();
		System.out.print("Valor 2: ");
		b = ler.nextInt();
        
		res = soma(a,b);
		System.out.print(res);

		res = somaRec(a + 1, b);
		System.out.print(res);

	}

}
