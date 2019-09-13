package pla1.ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej6_ArrayList1 {


	public static void main(String[] args) {
		
		/*
		 * 1.- Escribir un programa que vaya pidiendo n�meros al usuario 
		 * entre 1 y 10 y que finalice cuando el usuario introduzca el 0. 
		 * Que los vaya metiendo en un arraylist y al finalizar muestre el 
		 * n�mero de elementos,  la suma de todos ellos y  los n�meros que sean pares.
		*/		
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		Integer aux;
		Boolean salir = false;
		
		Scanner myObj = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un n�mero, 0 para salir" );
			aux = Integer.parseInt(myObj.nextLine());
			
			if(aux != 0) {
				if(aux < 1 || aux > 10) {
					System.out.println("n�mero err�neo");
				} else {
					array.add(aux);
				}
			}else {
				salir = true;
			}    	    			
		} while (!salir);
		
		System.out.println("N�mero de elementos: " + array.size());
		Integer suma = 0;
		for (Integer value : array) {
			suma += value;
			if(value % 2 == 0) {
				pares.add(value);
			}
		}
		System.out.println("Suma: " + suma);
		System.out.println("Pares: " + pares);
		
	    myObj.close();
	}

}
