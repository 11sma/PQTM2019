package pla1;

import java.util.Scanner;

public class Ej3_Bucle1 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object

		Integer valor;
		
		do {
			System.out.println("Introduce un valor");
			valor = Integer.parseInt(myObj.nextLine());
		} while (valor < 1 || valor > 10);
			
		System.out.println("Finalizado");
	    myObj.close();
	}

}

