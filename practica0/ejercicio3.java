// Escribir un programa que te pregunte por dos números, y a continuación imprima un mensaje
// del estilo “La suma es: ” y el valor de la suma de ambos números.

package practica0;

import java.util.Scanner;

public class ejercicio3 {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("¡Ingresa tu suma!");
		System.out.println("Escribe el primer valor: ");
		int num1 = scan.nextInt();
		System.out.println("Escribe el segundo valor: ");
		int num2 = scan.nextInt();
		int suma = num1 + num2;
		System.out.println("El resultado es: " + suma);
		scan.close();
		
		}
	
}
