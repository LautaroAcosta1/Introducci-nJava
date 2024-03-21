// Escribir un método static int sumatoria(int n) que devuelve la sumatoria de los números
// desde 1 hasta n.

package practica0;

public class Ejercicio10 {
	
	public static int sumatoria(int n) {
		int acum = 0;
		// se inicializa con i, mientras i sea <= n, suma de uno en uno
		for(int i = 1; i <= n; i++) {
			acum += i;
		}
		return acum;
	}

	public static void main(String[] args) {
		
		int n = 5;
		int resultado = sumatoria(n);
		System.out.println("La sumatoria de los numeros desde 1 hasta " + n + " es: " + resultado);

	}

}
