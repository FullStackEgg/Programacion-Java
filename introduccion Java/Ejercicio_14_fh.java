/**
 * 14. Escriba un programa en el cual se ingrese un valor l�mite positivo, y a continuaci�n
 * solicite n�meros al usuario hasta que la suma de los n�meros introducidos supere
 * el l�mite inicial.
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int numLimite, suma, num;
		
		suma = 0; // inicializamos en 0 para poder realizar la suma.
		
		System.out.println("Ingrese un valor limite positivo: ");
		numLimite = entrada.nextInt();
		
		// Pedimos numeros y sumamos hasta superar el limite
		do {
			System.out.println("Ingrese un n�mero: ");
			num = entrada.nextInt(); 
			
			// validamos que sea un numero positivo
			if (num > 0) {
				suma = suma + num; // Realizamos la suma de los n�meros ingresados
			} else {
				System.out.println("Ingrese un valor positivo.");
			}
		} while (suma < numLimite);
		
		// mostramos msj en pantalla
		if (suma > numLimite) {
			System.out.println("La suma total de los valores ingresados es: " + suma + " Ha superado el valor limite");
		} else {
			System.out.println("La suma total de los valores ingresados es: " + suma + " ha llegado al valor limite.");
		}
		
		entrada.close(); // Cerramos la entrada de datos
	}

}