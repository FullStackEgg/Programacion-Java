/**
 * 19. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
 * si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 * 		* * * *
 * 		*     *
 * 		*     *
 * 		* * * *
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_19_FH {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int num;

		System.out.println("Ingrese un número: ");
		num = entrada.nextInt();

		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= num; j++) {
				
				if ( (i > 1 && i < num) && (j > 1 && j < num) ) {
					
					System.out.print("  ");
				} else {
					
					System.out.print("* ");
				}
			}
			System.out.println("");
		}

		entrada.close();

	}

}
