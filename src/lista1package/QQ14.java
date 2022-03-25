package lista1package;

import java.util.Scanner;

public class QQ14 {

	public static void main(String[] args) {

		int a, b, c, delta, d = -4, b2, v2;
		double r2, r1;

		Scanner ler = new Scanner(System.in);

		System.out.println("Seja bem vindo a Calculadora de Equações do 2º Grau !");
		System.out.print("Digite o termo \"a\": ");
		a = ler.nextInt();
		System.out.print("Digite o termo \"b\": ");
		b = ler.nextInt();
		System.out.print("Digite o termo \"c\": ");
		c = ler.nextInt();

		System.out.println("");

		System.out.println("APLICAÇÃO DA FÓRMULA DE BÁSKARA: ");
		System.out.println("Resolução da Fórmula de Báskara: b²-4.a.c ");
		System.out.println("Resolução da Fórmula de Báskara: " + b + "²" + d + "*" + a + "*" + c);
		b2 = b * b;
		v2 = ((-4) * (a) * (c));
		delta = (b * b) + ((-4) * (a) * (c));
		if (v2 > 0) {
			System.out.println("Resolução da Fórmula de Báskara: " + b2 + "+" + v2);
		} else
			System.out.println("Resolução da Fórmula de Báskara: " + b2 + "-" + v2);
		System.out.println("Resolução da Fórmula de Báskara: " + (delta));

		System.out.println("");

		System.out.println("Resultados das raízes: ");
		if (delta < 0) {
			System.out.println("Não existe raíz real, Delta=0");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("A 1º raíz é: " + r1);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("A 2º raíz é: " + r2);

		}

	}
}
