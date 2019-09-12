package pla1;

import java.util.Scanner;

public class Ej3_Bucle3 {

	public static void main(String[] args) {
		
		/*
		 * 3.- Escribir un programa que nos pida un n�mero mayor de 1 y 
		 * que nos diga la suma de todos los n�meros hasta el n�mero introducido. 
		 * Por ejemplo, si introduce el 4: 1+2+3+4=10
		 */		
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Escribe un n�mero");
	    Integer number = Integer.parseInt(myObj.nextLine());  // Read user input
	    
	    Integer resultado = 0;
	    for (int i = 1; i < number + 1; i ++) {
	    	resultado += i;
	    }
	    
	    System.out.println("El resultado de la suma de los predecesores es: "+resultado);
	    
	    myObj.close();
	}

}
