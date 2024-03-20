// Escribir un método static void ponerNota(double x, double y) que toma dos números decimales
// y los promedia. En caso que el promedio sea mayor o igual a 7, debería imprimir
// ‘‘Promocionado’’, si es mayor o igual a 4 pero menor que 7, imprime ‘‘Aprobado’’ y si es menor
// que 4 imprime ‘‘Debe recuperar’’. Probarla llamándola desde el main con distintos números.
// Luego, pedirle ambos números al usuario (usando nextFloat() del Scanner) para pasárselos a
// ponerNota.

package practica0;

import java.util.Scanner;

public class ejercicio8 {
	
	public static double ponerNota(double x, double y) {
		return (x + y) / 2;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tus valores a promediar...");
		System.out.println("Escribe el primer valor: ");
		double num1 = scan.nextFloat();
		System.out.println("Escribe el segundo valor: ");
		double num2 = scan.nextFloat();
		double promedio = ponerNota(num1, num2);
		System.out.println("Tu nota es: " + promedio);
		scan.close();
		
		if(promedio < 4) {
			System.out.println("Debe recuperar");
		} else if(promedio >= 4 && promedio < 7) {
			System.out.println("Aprobado");
		} else if(promedio >= 7) {
			System.out.println("Promocionado");
		}
	}
	
}
