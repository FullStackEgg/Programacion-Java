/**
 * 16. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
 * salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
 * deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
 * número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_16 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, suma;
		
		suma = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Ingrese un número");
			num = entrada.nextInt();
			
			// Validamos que el numero sea mayor a cero para sumar
			if (num > 0) {
				suma = suma + num;
			} else if (num == 0) {
				// de ser igual a cero se interrumpe la iteracion
				System.out.println("Se capturó el número cero.");
				break;
			}
		}
		
		System.out.println("\nLa suma total de los números ingresados es: " + suma);
		
		entrada.close();
	}

}
