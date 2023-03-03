package lista1package;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o numero:");
		float n1 = ler.nextInt();

		System.out.println("Entre com o numero:");
		float n2 = ler.nextInt();

		System.out.println("Entre com o numero:");
		float n3 = ler.nextInt();
		
		float media = (n1 + n2 + n3) / 3;
		
		System.out.printf("A media eh =  %.2f \n", media);
	}

}
