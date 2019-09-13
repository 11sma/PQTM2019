package pla2.evaluacion;

import java.util.ArrayList;

public class Jugador {

	private String nombre;
	
	private ArrayList<Carta> cartas;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		cartas = new ArrayList<Carta>();
	}

	public void darCarta(Carta carta) {
		cartas.add(carta);
	}
	
	public void retirarCarta(Integer indice) {
		cartas.remove(indice.intValue());
	}
	
	public String juego() {
		String output = "[";
		for (Carta carta : cartas) {
			output += carta+",";
		}
		output = output.substring(0, output.length()-1);
		output += "]";
		
		return output;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}


	
	
}
