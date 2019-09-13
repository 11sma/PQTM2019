package pla1.ejercicios;

import java.util.Scanner;

public class Ej5_Array1 {

	public static Integer suma(int[] lista) {		
		
		Integer suma = 0;
		for (Integer numero : lista) {
			suma += numero;
		}
	    
	    return suma;
	}
	
	public static void main(String[] args) {
		
		/*
		 * 1.- Crear un programa que pida 10 n�meros al usuario entre 1 y 10. Los guarde 
		 * dentro de un array y finalmente muestre la suma de todos ellos.
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
		
	    
	    System.out.println("la suma total es: " + suma(array));
   
	    myObj.close();
	}

}
