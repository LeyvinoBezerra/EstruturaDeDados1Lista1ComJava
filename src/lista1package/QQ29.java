package lista1package;

import java.util.Scanner;

public class QQ29 {

	  public static void main(String[] args){
	        Scanner ler = new Scanner(System.in);
	        
	        // declara��o de vetor
	        int[] vetor = new int[3];
	        
	        // entrada de dados
	        for(int i = 0; i < vetor.length; i++){
	            System.out.println("Digite um n�mero");
	            vetor[i] = ler.nextInt();
	        }
	        
	        // sa�da de dados
	        for(int i = vetor.length-1; i >= 0; i--){
	            System.out.print(vetor[i]);
	        }
	        
	    }

}
