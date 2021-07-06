/**
 * 17. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
 * tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
 * con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
 * carácter tiene que ser X y el último tiene que ser una O.
 * Las secuencias leídas que respeten el formato se consideran correctas, la
 * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
 * secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
 * correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
 * se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_17_fh {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userText = "";
		int correctas = 0; 
		int incorrectas = 0;

		// Bucle para la lectura de cadenas, mientras la entrada sea distinta a "&&&&&"
		while (!"&&&&&".equals(userText)) {
			System.out.println("Ingrese una cadena de texto: ");
			userText = sc.nextLine();
			userText = userText.toUpperCase();

			// Validamos que tenga un maximo de 5 caracteres
			if ( userText.length() == 5) {
				// Validamos el primer y ultimo caracter sean igual a X y O respectivamente
				if (userText.substring(0, 1).equals("X") && (userText.substring(4, 5).equals("O"))) {
					correctas++; // incrementa el contador en 1
				} else {
					incorrectas++; // incrementa el contador en 1
				}
				
			} else {
				System.out.println("[ ERROR ] la cadena debe contener 5 caracteres.");
			}
		}

		sc.close(); // cerramos la entrada de datos
		
		// Mostramos el total de cadenas correctas
		System.out.println("[ INFORME ]");
		System.out.println("Se ingresaron un total de [" + correctas + "] cadenas correctas.");
		System.out.println("Se ingresaron un total de [" + (incorrectas-1) + "] cadenas incorrectas.");
	}

}
