package lista1package;

import java.util.Scanner;

public class QQ11 {

	public static void main(String[] args) {
		double conta1 = 100;
		double conta2 = 100;
		double transfe;

		Scanner ler = new Scanner(System.in);
		System.out.println("Quanto sera tranferido?");
		transfe = ler.nextDouble();

		conta1 = conta1 - transfe;
		conta2 = conta2 + transfe;

		if (transfe > 100) {
			System.out.println("Valor insuficiente em conta");
		} else {
			System.out.printf("Transferencia de " + transfe + "  feita com sucesso, valor atual da conta eh:"+ conta2);

		}
	}
}
