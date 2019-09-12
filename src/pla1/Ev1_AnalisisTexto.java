package pla1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ev1_AnalisisTexto {

	public static ArrayList<String> toArrayList(String splitBy, String frase){
		
		ArrayList<String> result = new ArrayList<String>();
		for (String element : frase.split(splitBy)) {
			result.add(element.replace(".", ""));
		}
		return result;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static ArrayList<String> ordenaLongitud(ArrayList<String> array){
		Comparator c = new Comparator<String>()
	    {
	        public int compare(String s1, String s2) {
	            return Integer.compare(s2.length(), s1.length());
	        }
	    };
	    Collections.sort(array, c);
	    return array;
	    
	}
	
	public static void procesadoFrases(String texto) {
		ArrayList<String> arrayFrases = new ArrayList<String>();
		arrayFrases = ordenaLongitud(toArrayList("\\. ", texto));
		System.out.println("Frases ordenadas mayor longitud a menor: ");
		arrayFrases.forEach((element) -> {System.out.println(element);});
	}
	
	public static void procesadoPalabras(String texto) {

		ArrayList<String> arrayPalabras = new ArrayList<String>();		
		arrayPalabras = toArrayList(" ", texto);
		
		ArrayList<String> arrayPalabrasUnique;
		arrayPalabrasUnique = (ArrayList<String>) arrayPalabras.stream() 
                .distinct() 
                .collect(Collectors.toList()); 
		
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();		
		for (String st : arrayPalabrasUnique) {
			
			if (map.containsKey(Collections.frequency(arrayPalabras, st))) {
				ArrayList<String> arr = map.get(Collections.frequency(arrayPalabras, st));
				arr.add(st);
				Collections.sort(arr, String.CASE_INSENSITIVE_ORDER);
				map.put(Collections.frequency(arrayPalabras, st), arr);
			} else {
				ArrayList<String> arr = new ArrayList<String>();
				arr.add(st);
				map.put(Collections.frequency(arrayPalabras, st), arr);
			}
		}
		
		map.forEach((k, v) -> {System.out.println("apariciones: " + k +"; Palabras: " + v);});
		
		
	}

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Introduce una frase" );
		String aux = myObj.nextLine();
		
		procesadoFrases(aux);
		procesadoPalabras(aux);						
		
	    myObj.close();
	}

}
