package lista1package;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Entre com o numero:");
		int n1 = ler.nextInt();

		System.out.println("Entre com o numero:");
		int n2 = ler.nextInt();

		System.out.println("Entre com o numero:");
		int n3 = ler.nextInt();
		
		int media = (n1 + n2 + n3) / 3;
		
		System.out.println("A média é ="+ media);
	}

}
