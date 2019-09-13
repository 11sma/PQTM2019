package pla1.ejercicios;

import java.util.Scanner;

public class Ej4_Metodos1 {

	public static String masLarga(String arr1, String arr2) {		
		
		return arr1.length() > arr2.length() ? 
				arr1 : 
					arr2.length() > arr1.length() ? 
							arr2 : "son iguales";
	}
	
	public static void main(String[] args) {
		
		/*
		 * 1.- Crear un m�todo que pas�ndole dos cadenas, nos devuelva la cadena m�s larga
		 */		
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Escribe un texto");
	    String str1 = myObj.nextLine();  // Read user input
	    
	    System.out.println("Escribe un texto");
	    String str2 = myObj.nextLine();  // Read user input
	    
	    System.out.println("La cadena m�s larga es: " + masLarga(str1, str2));;
	    
	    myObj.close();
	}

}
