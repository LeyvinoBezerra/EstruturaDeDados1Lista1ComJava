package lista1package;

import java.util.Scanner;

public class QQ23 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int ope,fat,n;
		Double base,expoente,poten,raiz;
		
		
		System.out.print(" 1 - potenciacao   \n");
		System.out.print(" 2 - raiz quadrada \n");
		System.out.print(" 3 - fatorial      \n");   
		System.out.print(" 0 – sair          \n");

		System.out.println("Digite A Operacao:");
		ope = ler.nextInt();

		   switch ( ope )
		  {
		     case 1 :
		    	 System.out.println("Digite a base:");
		         base = ler.nextDouble();
		        
		         System.out.println("Digite o indice:");
		         expoente = ler.nextDouble();
		        
				poten= Math.pow(base, expoente);
				System.out.print("a potencia e: "+ poten);
		     break;
		 
		     case 2 :
		    	 System.out.println("Digite a Base:");
		         base = ler.nextDouble();
		        
			
		    	raiz=Math.sqrt(base);
		    	System.out.print("A raiz e: "+ raiz);
		     break;
		 
		     case 3 :
		        
		    	 System.out.println("Insira um valor para o qual deseja calcular seu fatorial: ");
		         n = ler.nextInt();
		        for(fat = 1; n > 1; n = n - 1)
		        fat = fat * n;
		        System.out.print("\nFatorial calculado: "+ fat);


		    break;
		    
		     default :
		       
		    break;
		    

	}

	}
}

	