// Escribir un método static void imprimirSuma(int a, int b) que al igual que el
// ejercicio 3 imprima la suma de los dos parámetros. Modificar el programa de
// dicho ejercicio para que utilice este método

package practica0;

import java.util.Scanner;

public class Ejercicio6 {
	
	// se crea un metodo entero con dos propiedades
	public static int imprimirSuma(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese la suma...");
		System.out.println("Escribe el primer valor: ");
		int num1 = scan.nextInt();
		System.out.println("Escribe el segundo valor: ");
		int num2 = scan.nextInt();
		System.out.println("El resultado es: " + imprimirSuma(num1, num2));		// se utiliza el metodo
		scan.close();

	}

}
