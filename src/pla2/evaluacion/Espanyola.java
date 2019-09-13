package pla2.evaluacion;

import java.util.ArrayList;
import java.util.Arrays;

public class Espanyola extends Baraja {
	
	public Espanyola() {
		reiniciar();
	}
	
	private ArrayList<String> palos = new ArrayList<String> (
			Arrays.asList("bastos", "espadas", "copas", "oros"));

	private ArrayList<String> nombres = new ArrayList<String> (
			Arrays.asList("1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"));
	
	@Override
	void reiniciar() {
		cartas = new ArrayList<Carta>();
		for (String palo : palos) {
			for (String nombre: nombres) {
				Carta nuevaCarta = new Carta();
				nuevaCarta.setNombre(nombre);
				nuevaCarta.setPalo(palo);
				cartas.add(nuevaCarta);
			}
		}
		
	}

}
