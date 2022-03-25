package lista1package;

public class QQ25 {
	
	public static void main(String[] args) {
		
		
		int linhas=4;
		int colunas=4;
		
		int max[][] = new int[linhas][colunas];
	 
	    
	    System.out.println("Atribuicao com loop...");
		for (int l=0; l<linhas; l++) 
			for (int c=0; c<colunas; c++) {
				max[l][c] = l + c;
		}

	  
		System.out.println("Imprimindo com loop...");
		exibirMatriz(max);	
	}


	
	private static void exibirMatriz(int[][] m) 
	{
		int linhas = m.length;
		System.out.println("linhas = " + linhas);
		
		int colunas = m[0].length;
		System.out.println("colunas = " + colunas);
				
		for (int l=0; l<linhas; l++) 
		{
			System.out.println();
			
			for (int c=0; c<colunas; c++) {
				System.out.print(m[l][c] + "\t");
			}
		}
	}
	
}
