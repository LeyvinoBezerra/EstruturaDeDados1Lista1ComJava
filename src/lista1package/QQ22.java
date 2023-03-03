package lista1package;

import java.util.Scanner;

public class QQ22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, soma = 0;
		
		System.out.println("Entre com dois valores \n");
		a = ler.nextInt();
		b = ler.nextInt();
		
		while(a <= b)
		{
          soma += a;
			a++;
		}
		
		System.out.print(soma);
		

	}

}
