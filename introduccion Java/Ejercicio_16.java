/**
 * 16. Escriba un programa que lea 20 n�meros. Si el n�mero le�do es igual a cero se debe
 * salir del bucle y mostrar el mensaje "Se captur� el numero cero". El programa
 * deber� calcular y mostrar el resultado de la suma de los n�meros le�dos, pero si el
 * n�mero es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
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
			System.out.println("Ingrese un n�mero");
			num = entrada.nextInt();
			
			// Validamos que el numero sea mayor a cero para sumar
			if (num > 0) {
				suma = suma + num;
			} else if (num == 0) {
				// de ser igual a cero se interrumpe la iteracion
				System.out.println("Se captur� el n�mero cero.");
				break;
			}
		}
		
		System.out.println("\nLa suma total de los n�meros ingresados es: " + suma);
		
		entrada.close();
	}

}
