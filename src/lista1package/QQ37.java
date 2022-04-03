package lista1package;

import java.util.Arrays;
import java.util.List;

public class QQ37 {
	
	public static <E> void printListGeneric(List<E> myList) {
		for (E element : myList) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		// public static <E> void printListGeneric(List<E> myList) 
				System.out.println("-----------------------------------");
				System.out.println("printListGeneric");
				System.out.println("-----------------------------------");
				System.out.println("listInteger:");
				List<Integer> listInteger = Arrays.asList(4, 5, 6, 7);
				printListGeneric(listInteger);


	}

}
