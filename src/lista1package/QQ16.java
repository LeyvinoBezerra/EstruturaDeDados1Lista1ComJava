package lista1package;

import java.util.Scanner;

public class QQ16 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		int a, b, i;
	
		
		System.out.println("Entre com dois valores \n");
		a = ler.nextInt();		
	    b  = ler.nextInt();		   
		
		for(i = a;a <= b; a++) {
			System.out.print(a);
		}

	}

}
