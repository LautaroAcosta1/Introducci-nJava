// Escribir un método static void imprimirFecha(int dia, int mes, int anio) que imprime la
// fecha pasada como parámetro en formato del estilo “5 de Julio de 2030”.

package practica0;

import java.util.Scanner;

public class ejercicio9 {
	
	 public static int imprimirFecha(int dia, int mes, int anio) {
		 return System.out.println(dia + "de" + mes + "de" + anio);
	 }

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa el dia: ");
		int dia = scan.nextInt();
		System.out.println("Ingresa el nombre del mes: ");
		String mes = scan.next();
		System.out.println("Ingresa el anio: ");
		int anio = scan.nextInt();
		System.out.println(imprimirFecha(dia, mes, anio));
		scan.close();

	}

}
