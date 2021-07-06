/**
 * 15. Realizar un programa que pida dos n�meros enteros positivos por teclado y
 * muestre por pantalla el siguiente men�:
 * 	MENU
 * 	1-Sumar
 * 	2-Restar
 * 	3-Multiplicar
 * 	4-Dividir
 * 	5-Salir
 * 	Elija Opcion:
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcionMenu, num1, num2;
		String opcionSalida;
		
		opcionSalida = "";
		
		// Entrada de Datos
		System.out.println("Ingrese el primer n�mero: ");
		num1 = entrada.nextInt();

		System.out.println("Ingrese el segundo n�mero: ");
		num2 = entrada.nextInt();

		opcionMenu = 0; // Inicializamos en 0 para que se ejecute el do/while

		do {
			System.out.println(" MENU ");
			System.out.println("1- Sumar.");
			System.out.println("2- Restar.");
			System.out.println("3- Multiplicar.");
			System.out.println("4- Dividir.");
			System.out.println("5- Salir.");
			System.out.println(" Elija una Opci�n: ");

			opcionMenu = entrada.nextInt();

			// validamos opcion ingresada
			switch (opcionMenu) {
			case 1:
				System.out.println("La Suma de: " + num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case 2:
				System.out.println("La Resta de: " + num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case 3:
				System.out.println("La Multiplicaci�n de: " + num1 + " * " + num2 + " = " + (num1*num2));
				break;
			case 4:
				System.out.println("La Divisi�n de: " + num1 + " / " + num2 + " = " + (num1/num2));
				break;
			case 5:
				System.out.println("�Est� seguro que desea salir del programa (S/N)?");
				opcionSalida = entrada.next();
				
				opcionSalida = opcionSalida.toUpperCase();
				// Validamos la opcon
				if (opcionSalida.equals("S")) {
					System.out.println("[ PROGRAMA FINALIZADO ]");
				} else {
				opcionMenu = 0;
				}
				break;
			default:
				System.out.println("Opcion Incorrecta");
			}
		} while (opcionMenu != 5);
		
		entrada.close();
	}

}
