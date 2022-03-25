package lista1package;

import java.util.Scanner;

public class QQ26 {

	public static void main(String[] args) {
	      Scanner ler = new Scanner(System.in);
	        
	        // declaração de vetor
	        int[] vetor = new int[3];
	        
	        // entrada de dados
	        for(int i = 0; i < vetor.length; i++){
	            System.out.println("Digite um número");
	            vetor[i] = ler.nextInt();
	        }
	        
	        // saída de dados
	        for(int i = vetor.length-1; i >= 0; i--){
	            System.out.print(vetor[i]);
	        }
	        
	    }

	}


