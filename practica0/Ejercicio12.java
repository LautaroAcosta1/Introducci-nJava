// Escribir un método static double potencia(double x, int a) que toma un número racional
// x y un entero a y calcula x^a.

package practica0;

public class Ejercicio12 {
	
	public static double potencia(double x, int a) {
		double acum = 1.0;								// se inicializa en 1.0 para lograr la multiplicacion
		for(int i = 1; i <= a; i++) {
			acum *= x;
		}
		return acum;
	}

	public static void main(String[] args) {
		
		double x = 2.5;
		int a = 3;
		double resultado = potencia(x, a);
		System.out.println("El resultado de " + x + "^" + a + " es: " + resultado);

	}

}
