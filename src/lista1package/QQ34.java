package lista1package;

import java.util.HashSet;
import java.util.Set;

public class QQ34{
	private String resultado;

	public QQ34(String frase)
	{
		this.resultado = "";
		Set<String> hashSet = new HashSet<>();
		String[] palavra = frase.split(" ");
		int cont;
		
		for(int i = 0; i < palavra.length; i++){
			hashSet.add(palavra[i]);
		}

		String[] contarPalavra = new String[hashSet.size()];

		int k = 0;
		for(String ele : hashSet)
			contarPalavra[k++] = ele;

		for(int i = 0; i < contarPalavra.length; i++)
		{
			cont = 0;
			for(int j = 0; j < palavra.length; j++)
			{
				if(contarPalavra[i].equals(palavra[j]))
				{
					cont++;
				}
			}
			resultado += contarPalavra[i] + " = " + cont + " ";
			System.out.println(contarPalavra[i] + " = " + cont);
		}
	}

	public String getResultado()
	{
		return this.resultado;
	}
	public static void main(String[] arg) {
		
		QQ34 q = new QQ34("estude muito sempre sempre estude");
		
		System.out.println(q.toString());
		
	
	
	}
}