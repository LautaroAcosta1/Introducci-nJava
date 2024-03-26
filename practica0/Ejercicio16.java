// a) Escribir un programa que pida por pantalla un texto y a continuación lo imprima de atrás para
// adelante. Para obtener las letras de una cadena de caracteres pueden utilizar el método charAt
// de String. Por ejemplo, cadena.charAt(0) devuelve el primer caracter del String cadena.
// b) Mover el código que imprime la cadena al revés a un método
// static void imprimirReversa(String cadena)
// c) Escribir un método static String reversa(String cadena) que dado un String, devuelve otro
// String con los caracteres invertidos. Por ejemplo, reversa(‘‘hola’’) debería devolver el String
// ‘‘aloh’’.
// d) Modificar el método imprimirReversa para que utilice el método definido en el punto anterior.

package practica0;

import java.util.Scanner;

public class Ejercicio16 {
	
	public static void imprimirReversa(String cadena) {
		 int cantChar = cadena.length() - 1;			// se almacena la cantidad de caracteres que tiene "cadena" y -1 por que length cuenta desde 0
		 // se recorre la cadena desde el ultimo caracter hasta el primero
		 for (int i = cantChar; i >= 0; i--) {
			 System.out.print(cadena.charAt(i));		// se imprime el contenido de la cadena desde el ultimo hasta el primero
		 }
	}
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Ingresa el texto: ");
		 String cadena = scan.nextLine(); 				// se almacena el texto ingresado
		 scan.close();
		 imprimirReversa(cadena);						// se llama al metodo
		 
	}

}
