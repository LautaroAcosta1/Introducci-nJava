// Escribir un método static int sumatoriaPares(int n) que devuelve la sumatoria de los
// números pares desde 2 hasta n.

package practica0;

public class Ejercicio11 {
	
	public static int sumatoriaPares(int n) {
		int acum = 0;
		for(int i = 2; i <= n; i += 2) {
			acum += i;
		}
		return acum;
	}

	public static void main(String[] args) {
		
		int n = 6;
		int resultado = sumatoriaPares(n);
		System.out.println("La sumatoria de los numeros pares desde 2 hasta " + n + " es: " + resultado);

	}

}
