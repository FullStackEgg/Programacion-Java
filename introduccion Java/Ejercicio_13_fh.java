/**
 * 13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
 * la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int nota;

		nota = -1;

		// validamod que la nota este entre 0 y 10, sino se repite
		do {

			System.out.println("Ingrese una nota:");
			nota = entrada.nextInt();

			// Validamos la nota
			if (nota >= 0 && nota <= 10) {
				System.out.println("Nota ingresada correctamente!.");
			} else {
				System.out.println("[ Ha ocurrido un error ]");
			}

		} while (nota < 0 || nota > 10);

		entrada.close(); // cerramos entrada de datos
		
	}

}
