package pla2.evaluacion;

import java.util.Scanner;

public class Aplicacion1 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		Mus mus = new Mus();
			
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduce el " + (i+1) + " jugador");
		    Jugador jugador = new Jugador(myObj.nextLine());
		    mus.addJugador(jugador);
		}
		
		for (Jugador j: mus.getJugadores()) {
			System.out.println(j.getNombre());
			System.out.println(j.getCartas());
		}

	    myObj.close();
		

		
	}

}
