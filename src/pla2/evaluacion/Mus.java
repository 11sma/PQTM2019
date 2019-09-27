package pla2.evaluacion;

import java.util.ArrayList;

public class Mus {

	private Francesa baraja;
	
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	void addJugador(Jugador jugador) {
		jugadores.add(jugador);
	}

	public Francesa getBaraja() {
		return baraja;
	}

	public void setBaraja(Francesa baraja) {
		this.baraja = baraja;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	
}
