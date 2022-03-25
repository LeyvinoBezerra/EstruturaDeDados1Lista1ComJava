package lista1package;

import java.awt.Toolkit;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Entre com um numero");
		float num1 = ler.nextFloat();

		System.out.println("Entre com um numero");
		float num2 = ler.nextFloat();

		float div = num1 / num2;

		if (num2 == 0) {
			Toolkit.getDefaultToolkit().beep();
		}

		System.out.println("O Resultado da divisão é:" + div);
	}

}
