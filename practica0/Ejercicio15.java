// Escribir un método static boolean esDivisible(int n, int m) que devuelve true si n es
// divisible por m y false en caso contrario. Probarlo adecuadamente llamándola desde el main.

package practica0;

public class Ejercicio15 {
	
	public static boolean esDivisible(int n, int m) {
		if(n % m == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(esDivisible(17, 3));

	}

}
