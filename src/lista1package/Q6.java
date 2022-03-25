package lista1package;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		final double pRefri = 1.5, pFatia = 3.0, taxa = 0.1;
		int refri, pizza, pessoas;
		double tot_CT, tot_ST, ratio;

		System.out.println("Quantos refrigerantes? \n");
		refri = ler.nextInt();

		System.out.println("Quantas fatias de pizza? \n");
		pizza = ler.nextInt();

		System.out.println("Quantas pessoas na mesa? \n");
		pessoas = ler.nextInt();

		tot_ST = refri * pRefri + pizza * pFatia;
		tot_CT = tot_ST * taxa + tot_ST;
		ratio = tot_CT / pessoas;

		System.out.printf("Total sem taxas:%.2f \n", tot_ST);
		System.out.printf("Total com taxas:%.2f \n", tot_CT);
		System.out.printf("Rateio por pessoa:%.2f \n", ratio);

	}

}
