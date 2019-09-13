package pla1.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5_Array2 {

	public static int[] ordenar(int[] lista) {		
		
        Arrays.sort(lista);        
        
        return lista;
	}
	
	public static void main(String[] args) {
		
		/*
		 * 2.- Modificar el programa anterior para que ordene el array de mayor a menor.
		*/		
		Integer size = 10;
		Integer i = 0;
		int[] array = new int[size];
		Scanner myObj = new Scanner(System.in);
		
		do {
			System.out.println("Introduce el " + (i + 1) + "� n�mero" );
		    array[i] = Integer.parseInt(myObj.nextLine());  // Read user input
			i++;
		} while (i < size);
		
		System.out.println("Array original: " + Arrays.toString(array));
	    int[] arrayOrdenado = ordenar(array);
	    System.out.println("Array ordenado: " + Arrays.toString(ordenar(arrayOrdenado)));
   
	    myObj.close();
	}

}
