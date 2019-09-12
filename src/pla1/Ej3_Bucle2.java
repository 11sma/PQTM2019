package pla1;

import java.util.Scanner;

public class Ej3_Bucle2 {

	public static void main(String[] args) {
		
		/*
		 * 2.- Escribir un programa que nos pida una cadena 
		 * y nos diga cuantas veces aparece la letra "a" (bucle while, string indexof)
		 */

		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
	    String word = myObj.nextLine();  // Read user input
	    
	    Integer index = -1;
	    Integer counter = 0;
	    do {
	    	index = word.indexOf("a", index + 1);
	    	if(index != -1) {
	    		counter++;
	    	}
	    } while (index != -1);
	    
	    System.out.println("total de apariciones de la letra a: "+counter);
	    
	    myObj.close();
	}

}
