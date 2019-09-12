package pla1;

import java.util.Scanner;

public class Ej5_Array3 {

	public static boolean isRepeated(String toCheck, String[] array) {		 
        
		for (String value : array) {
			if(value != null) {				
				if(value.equals(toCheck)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		/*
		 * 3.- Crear un programa que le pida al usuario 5 nombres de productos y los guarde en un array. 
		 * Si el usuario introduce un nombre repetido que lo vuelva a pedir.
		*/		
		Integer size = 5;
		Integer i = 0;
		String[] array = new String[size];
		String aux = "";
		
		Scanner myObj = new Scanner(System.in);
		
		do {
			System.out.println("Introduce el " + (i + 1) + "� objeto" );
			
			aux = myObj.nextLine();
			if(!isRepeated(aux, array)) {
				array[i] = aux;
				i++;
			}else {
				System.out.print("Repetido!! ");
			}    	    			
		} while (i < size);
		
		System.out.println("Array objetos: [");
		for (String value : array) {
			System.out.println(value);
		}
		System.out.println("]");
	    myObj.close();
	}

}
