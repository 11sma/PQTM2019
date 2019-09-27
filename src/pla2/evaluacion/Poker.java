package pla2.evaluacion;

import java.util.ArrayList;

public class Poker {

	private Francesa baraja;
	
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public Poker(ArrayList<Jugador> jugadores) {
		if (jugadores.size() >= 2) {
			this.jugadores = jugadores;
			baraja = new Francesa();
			baraja.barajar();
		}
		// TODO Auto-generated constructor stub
	}
	
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
