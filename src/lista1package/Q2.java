package lista1package;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade;
		Double altura;
		String primeiraLetraNome;
		String nomeCompleto;

		System.out.println("Entre com a Idade:");
		idade = ler.nextInt();

		System.out.println("Entre com a altura:");
		altura = ler.nextDouble();

		ler.nextLine();

		System.out.println("Entre com a primeira letra do nome:");
		primeiraLetraNome = ler.next();

		ler.nextLine();

		System.out.println("Entre com o nome completo:");
		nomeCompleto = ler.nextLine();

		System.out.println("--------------------------------------------------------");
		System.out.println("A Sua Idade:" + idade);

		System.out.println("A Sua altura:" + altura);

		System.out.println("A Sua primeira letra do nome:" + primeiraLetraNome);

		System.out.println("A Seu nome completo:" + nomeCompleto);

		System.out.println("--------------------------------------------------------");

	}

}
