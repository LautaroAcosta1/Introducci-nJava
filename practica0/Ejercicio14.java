// Escribir un método static int cantCifras(int n) que devuelve la cantidad de cifras de n.
// Probarlo adecuadamente llamándola desde el main.

package practica0;

public class Ejercicio14 {
	
	public static int cantCifras(int n) {
		if (n == 0) {
            return 1; // si n es 0, tiene una cifra
        }
        
        int cifras = 0;
        
        while (n != 0) {
            n = n / 10; // se divide n por 10 para eliminar la ultima cifra
            cifras++;   // se incrementa el contador de cifras
        }
        
        return cifras;
	}

	public static void main(String[] args) {
		
		System.out.println(cantCifras(567));

	}

}
