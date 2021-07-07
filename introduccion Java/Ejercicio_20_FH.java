/**
 * 20. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
 * número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 * 5 *****
 * 3 ***
 * 11 ***********
 * 2 **
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_20_FH {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;

		// entrada de datos
		System.out.println("Ingrese un número entre 1 a 20:");
		num = entrada.nextInt();

		// Validamos que el numero ingresado este en el rango de 1 - 20
		if (num >= 1 && num <= 20) {
			// Mostramos el número
			System.out.print(num + " ");
			// el for se itera la cantidad de veces del num ingresado e imprime el *
			for (int i = 0; i < num; i++) {
				System.out.print("*"); 
			}
		} else {
			System.out.println("Número ingresado fuera de rango.");
		}
		
		entrada.close();
	}

}
