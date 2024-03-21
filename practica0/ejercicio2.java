// Escribir un programa que te pregunte tu nombre y a continuación imprima un saludo del estilo
// “Hola nombre”.

package practica0;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);			// Se crea el objeto "scan" para leer la entrada del usuario
		System.out.println("¿Cual es tu nombre? ");		// Se pide que ingrese el nombre
		String name = scan.nextLine();					// Se lee la cadena y se almacena en la nueva variable "name"
		System.out.println("Hola " + name);				// Se imprime el saludo
		scan.close();									// Se cierra el scanner para liberar recursos

	}

}
