// Escribir un programa que te pregunte por dos números, y a continuación imprima un mensaje
// del estilo “El promedio es: ” y el valor del promedio de ambos números.

package practica0;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tus valores a promediar...");
		System.out.println("Escribe el primer valor: ");
		float num1 = scan.nextInt();
		System.out.println("Escribe el segundo valor; ");
		float num2 = scan.nextInt();
		float promedio = (num1 + num2) / 2;
		System.out.println("El promedio es: " + promedio);
		scan.close();
		
	}
	
}
