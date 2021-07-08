/**
 * 23.
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
 * pida al usuario un numero a buscar en el vector. El programa mostrará donde se
 * encuentra el numero y si se encuentra repetido
 */
package introduccionjava;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 *
 */
public class Ejercicio_23_FH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int vectorNum[] = new int[10];
		int num;

		// llamada al metodo para llenar el arreglo con valores aleatorios
		rellenarVector(vectorNum);

		System.out.println("Ingrese el numero que desea buscar en el vector:");
		num = sc.nextInt();
				
		buscarNumero(vectorNum, num);
		// cerramos la entrada de datos
		sc.close();
	}

	/**
	 * Busca el num en el vector. 
	 * Cuenta las veces que este repetido.
	 * Muestra la posicion en que se encontro.
	 */
	private static void buscarNumero(int[] vector, int num) {
		
		int numRepetido = 0;
		
		for (int i = 0; i < vector.length; i++) {
			// Validamos si la vector[i] igual al num
			if (vector[i] == num) {
				System.out.println("El numero: " + num + " se encuentra en la posicion [" + i + "] del vector.");
				numRepetido++; 
			}
		}
		
		if (numRepetido > 1) {
			System.out.println("El numero se ha repitdo: [" + numRepetido + "] veces.");
		}
		
		
	}

	/*
	 * Llena el vector con valores aleatorios. Se hace un casting a int ya que
	 * Math.random retorna un double
	 */
	public static void rellenarVector(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 20) + 1; // este código nos genera numeros entre 1 y 20.
		}

		//mostrarVector(vector);
	}

	/*
	 * Muestra por consola los valores del vector
	 */
	public static void mostrarVector(int[] vector) {

		for (int i = 0; i < vector.length; i++) {
			System.out.print("[" + vector[i] + "]");
		}
		
		System.out.println("");
	}

}
