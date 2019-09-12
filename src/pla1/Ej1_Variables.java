package pla1;

import java.util.Scanner;

public class Ej1_Variables {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object

		System.out.println("Introduce el primer valor");
	    Double v1 = Double.parseDouble(myObj.nextLine());
	     
	    System.out.println("Introduce el segundo valor");
	    Double v2 = Double.parseDouble(myObj.nextLine());
	    
	    System.out.println("Suma: " + (v1+v2));
	    System.out.println("Mult: " + v1*v2);
	    
	    myObj.close();
	}

}
