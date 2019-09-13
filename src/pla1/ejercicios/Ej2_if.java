package pla1.ejercicios;

import java.util.Scanner;

public class Ej2_if {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object

		System.out.println("Introduce la altura");
		Integer alt = Integer.parseInt(myObj.nextLine());
	     
	    System.out.println("Introduce la edad");
	    Integer edad = Integer.parseInt(myObj.nextLine());
	    
	    if (alt >= 140 || edad >= 16) {
	    	System.out.println("Puede entrar");
	    } else {
	    	System.out.println("No puede entrar");
	    }
	    
	    myObj.close();
	}

}

