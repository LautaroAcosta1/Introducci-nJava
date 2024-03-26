// Escribir un método static int cantidadApariciones(String s, char c) que dada una cadena
// y un caracter, cuenta la cantidad de veces que aparece c en s.

package practica0;

public class Ejercicio17 {
	
	public static int cantidadApariciones(String s, char c) {
		int cant = 0;
		// se recorre la cadena ingresada (s)
		for (int i = 0; i < s.length(); i++) {
			// se verifica una por una si las letras es igual al caracter ingresado (c)
			if (s.charAt(i) == c) {
				cant++;								// se aumenta x1 la cantidad de apariciones
			}
		}
		return cant;
	}

	public static void main(String[] args) {
		
		System.out.println(cantidadApariciones("programacion", 'o'));

	}

}
