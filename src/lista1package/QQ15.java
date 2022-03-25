package lista1package;

import java.util.Scanner;

public class QQ15 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num;

		System.out.println("entre com um numero de um a cinco\n");
		num = ler.nextInt();

		switch (num) {
		case 1:
			System.out.println("Um\n");
			break;
		case 2:
			System.out.println("Dois\n");
			break;
		case 3:
			System.out.println("Tręs\n");
			break;
		case 4:
			System.out.println("Quatro\n");
			break;
		case 5:
			System.out.println("Cinco\n");
			break;
		default:
			System.out.println("Valor inválido");
		}

	}
}
