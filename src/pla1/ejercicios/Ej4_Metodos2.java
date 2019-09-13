package pla1.ejercicios;

import java.util.Scanner;

public class Ej4_Metodos2 {

	public static Integer veces(String letter, String arr) {		
		
		Integer index = -1;
	    Integer counter = 0;
	    do {
	    	index = arr.indexOf(letter, index + 1);
	    	if(index != -1) {
	    		counter++;
	    	}
	    } while (index != -1);
	    
	    return counter;
	}
	
	public static void main(String[] args) {
		
		/*
		 * 1.- Crear un m�todo que pas�ndole dos cadenas, nos devuelva la cadena m�s larga
		 */		
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Escribe una letra a buscar");
	    String letra = myObj.nextLine();  // Read user input
	    
	    System.out.println("Escribe el texto en el que buscar");
	    String cadena = myObj.nextLine();  // Read user input
	    
	    
	    
	    System.out.println("total de apariciones de la letra a: "+veces(letra, cadena));
	    
	    myObj.close();
	}

}
