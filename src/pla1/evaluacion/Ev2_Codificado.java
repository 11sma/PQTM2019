package pla1.evaluacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ev2_Codificado {
	
	public static HashMap<Integer, String> tablaCodificacion = new HashMap<Integer, String>(){
		private static final long serialVersionUID = 1L;

	{
		put(2, "ABC");
		put(3, "DEF");
		put(4, "GHI");
		put(5, "JKL");
		put(6, "MNO");
		put(7, "PRS");
		put(8, "TUV");
		put(9, "WXY");
	}};

	public static void codificar(String input) {
		int i = 0;
		do {
			for(Map.Entry<Integer, String> entry : tablaCodificacion.entrySet()) {
				if(entry.getValue().contains(String.valueOf(input.charAt(i)).toUpperCase())) {
					System.out.print(entry.getKey());
					continue;
				}
			}
			i++;
		} while (i < input.length());
		System.out.println("");
	}
	
	public static void decodificar(String input) {
		
		String [][] aux = new String[input.length()][3];
		char numero;
		for(int i = 0; i < input.length(); i++) {
			numero = input.charAt(i);
			for(int j = 0; j < 3; j++) {
				Integer numeroInteger = Character.getNumericValue(numero);
				String set3Caracteres = tablaCodificacion.get(numeroInteger);
				aux[i][j] = String.valueOf(set3Caracteres.charAt(j));
			}
		}
				
		recursivo(aux, "", 0);
	}
	
	public static void recursivo(String [][]table, String text, Integer index) {
		for(int j = 0; j < 3; j++) {
			if(index < table.length)
				recursivo(table, text + table[index][j], index+1);		
		}
		if(text.length() == table.length) System.out.println(text);
	}
	
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		Integer eleccion;
		String input;
		do {
			System.out.println("Qu� quieres hacer? Codificar: 1; Decodificar 2; Salir: 0" );
			eleccion = Integer.parseInt(myObj.nextLine());
			
			switch (eleccion) {
			case 0:
				System.out.println("Adios!");
				break;
			case 1:
				System.out.println("Introduce el texto a codificar" );
				input = myObj.nextLine();
				codificar(input);
				break;
			case 2:
				System.out.println("Introduce el texto a decodificar" );
				input = myObj.nextLine();
				decodificar(input);
				break;

			default:
				System.out.println("Opci�n incorrecta");
				break;
			}
			

			
		} while (eleccion != 0);
		
							
		
	    myObj.close();
	}

}
