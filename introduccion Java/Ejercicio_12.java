/**	
 *  12. Considera que estás desarrollando una web para una empresa que fabrica motores
 *	(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
 *	Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
 *	El programa debe mostrar lo siguiente:
 *		- Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
 *		bomba de agua”.
 *		- Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
 *		bomba de gasolina”.
 *		- Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
 *		bomba de hormigón”.
 *		- Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
 *		bomba de pasta alimenticia”.
 *		- Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
 *		existe un valor válido para tipo de bomba”
**/
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int tipoMotor;

		// Entrada de datos
		System.out.println("Ingrese el tipo de motor de bomba que desea: ");
		tipoMotor = entrada.nextInt();

		// Validamos la entrada por el usuiario
		if (tipoMotor > 0) {
			// Segun tipo de motor
			switch (tipoMotor) {
			case 1:
				System.out.println("La bomba es una bomba de agua.");
				break;
			case 2:
				System.out.println("La bomba es una bomba de gasolina.");
				break;
			case 3:
				System.out.println("La bomba es una bomba de hormigón.");
				break;
			case 4:
				System.out.println("La bomba es una bomba de pasta alimenticia.");
				break;
			default:
				System.out.println("No existe un valor válido para el tipo de bomba ingresado.");
			}

		} else {
			System.out.println("[ ERROR ] Ingrese un valor númerico positivo.");
		}

		entrada.close(); // cerramos la entrada de datos

	}

}
