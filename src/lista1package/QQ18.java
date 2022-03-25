package lista1package;

import java.util.Scanner;

public class QQ18 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int senha;
		
		senha = entrada.nextInt();
		
		do
		{
			System.out.println("senha incorreta");
			senha = entrada.nextInt();
		}
		while(senha != 123);
		
	}

}
