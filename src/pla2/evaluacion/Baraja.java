package pla2.evaluacion;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Baraja {

	
	protected ArrayList<Carta> cartas;
	
	void barajar() {
		Collections.shuffle(cartas);
	}
	
	Carta repartir () {
		Carta cartaRepartida = cartas.get(0);
		cartas.remove(0);
		return cartaRepartida;
	}
	
	abstract void reiniciar();

}
