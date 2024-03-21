// Análogamente al ejercicio anterior, escribir un método static void imprimirPromedio(int a, int b)
// que imprima el promedio de los dos parámetros.

package practica0;

import java.util.Scanner;

public class Ejercicio7 {
	
	public static int imprimirPromedio(int a, int b) {
		return (a + b) / 2;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa los valores a promediar...");
		System.out.println("Escribe el primer valor: ");
		int num1 = scan.nextInt();
		System.out.println("Escribe el segundo valor: ");
		int num2 = scan.nextInt();
		System.out.println("Tu promedio es: " + imprimirPromedio(num1, num2));
		scan.close();
		
	}

}
