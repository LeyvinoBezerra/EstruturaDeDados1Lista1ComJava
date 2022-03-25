package lista1package;

import java.awt.Toolkit;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("entre com o seu Peso:");
		double peso = ler.nextDouble();

		System.out.println("entre com sua altua:");
		double altura = ler.nextDouble();

		int imc = (int) (peso / (altura * altura));

		if (altura == 0) {
			Toolkit.getDefaultToolkit().beep();
		}

			System.out.println("Seu IMC:" + imc);

	}

}
