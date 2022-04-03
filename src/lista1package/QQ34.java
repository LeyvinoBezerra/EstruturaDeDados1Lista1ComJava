package lista1package;


import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class QQ34 {
	
	private static Throwable e1;

	public static void main(String[] args) 
	{
		//String path = "arquivo_texto.txt"; 	// arquivo sera criado na pasta (temp) ja criada dentro do projeto.
		String path = "/eclipse-workspace/arquivo.txt"; 				// arquivo sera criado na raiz do projeto. (nao recomendado)
		//String path = "/temp/arquivo.txt"; 		// arquivo criado na pasta (temp) ja criada na mesma unidade (C, D, etc) do projeto.
		//String path = "/arquivo.txt"; 			// arquivo sera criado na raiz da mesma unidade (C, D, etc) do projeto.

		
		String textoInput = "LeyvinoBezerraDosNascimento";
		//String textoOutput;
	
	
	try {
		escritor(path, textoInput);
	} catch (IOException e1) {
		System.out.println("Erro na escrita");
		e1.printStackTrace();
	} catch (Exception e) {
		System.out.println("Pane geral!");
		e1 = null;
		e1.printStackTrace();
	}
	
	
	
	}

public static void escritor(String path, String texto) throws IOException {
	BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(path) );
	bufferedWriter.append(texto);
	bufferedWriter.close();
}




}


