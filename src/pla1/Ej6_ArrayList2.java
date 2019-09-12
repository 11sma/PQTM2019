package pla1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej6_ArrayList2 {

	public static ArrayList<String> toArrayList(String frase){
		
		ArrayList<String> result = new ArrayList<String>();
		for (String element : frase.split(" ")) {
			result.add(element);
		}
		return result;
	}

	public static void main(String[] args) {
		
		/*
		 * 2.- Escribir un programa que nos pida una frase, guarde las palabras en un arraylist y nos diga cuantas
		 *  palabras hay y cual es la m�s larga.
		*/		
		ArrayList<String> array = new ArrayList<String>();
		String aux;
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Introduce una frase" );
		aux = myObj.nextLine();
		
		array = toArrayList(aux);
		
		System.out.println("N�mero de elementos: " + array.size());
		
		Integer maxSize = 0;
		String palabraMax = "";
		for (String string : array) {
			if(string.length() > maxSize) {
				maxSize = string.length();
				palabraMax = string;
			}
		}
		System.out.println("Palabra m�s larga: " + palabraMax);
		
	    myObj.close();
	}

}
