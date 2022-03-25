package lista1package;

import java.util.Scanner;

public class QQ28 {

	public static void main(String[] args) {
		
	
			  Scanner ler = new Scanner(System.in);
			 
			  int n,i;
			  int vet[] = new int [500];
			
			  
			 System.out.println("Entre com n: ");
			 n = ler.nextInt(); 
		     
			 System.out.printf("Entre com elementos: ",n);
			  for(i = 0; i < n; i++){
			   vet[i] = ler.nextInt();
			  }
			  
			  System.out.print("Ordem inversa: ");
			  for(i = n-1; i >= 0; i--){
				  System.out.print(vet[i]);
			  }

}
}
