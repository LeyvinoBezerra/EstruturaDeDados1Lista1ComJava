package lista1package;

import java.util.Scanner;

public class QQ28 {

	public static void main(String[] args) {
		   Scanner ler = new Scanner(System.in);
		
		    int size = 5;
			int vet[] = new int[size]; 
	        int maior, menor,i;
		    for(i = 0;i < 5;i++)
		    {
		    	System.out.printf("Entre com o valor do vetor: ", i+1);
		        vet[i] = ler.nextInt();
		    }

		    maior = vet[0];
		    menor = vet[0];

		    for(i = 1;i < 5;i++)
		    {
		        if(maior < vet[i])
		            maior = vet[i];
		    }

		    for(i = 1;i < 5;i++)
		    {
		        if(menor > vet[i])
		            menor = vet[i];
		    }

		    System.out.printf("\nO maior valor do vetor e %d: \n", maior);
		    System.out.printf("O menor valor do vetor e %d: ", menor);

	}

}
