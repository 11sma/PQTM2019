package pla2.evaluacion;

public class Programa {

	public static void main(String[] args) {
		Jugador isma = new Jugador("Isma");

		Carta carta1 = new Carta();
		carta1.setNombre("1");
		carta1.setPalo("bastos");
		
		Carta carta2 = new Carta();
		carta2.setNombre("11");
		carta2.setPalo("espadas");
		
		isma.darCarta(carta1);
		isma.darCarta(carta2);
		
		System.out.println(isma.juego());
		
	}

}
