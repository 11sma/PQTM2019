package pla2.evaluacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion2 {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
			
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduce el " + (i+1) + " jugador");
		    Jugador jugador = new Jugador(myObj.nextLine());
		    jugadores.add(jugador);
		}
		
		Poker poker = new Poker(jugadores);
		
		for (Jugador j: poker.getJugadores()) {
			System.out.println(j.getNombre());
			System.out.println(j.getCartas());
		}

	    myObj.close();
		

		
	}

}
