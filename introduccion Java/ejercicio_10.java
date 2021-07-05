package introduccionjava;

import java.util.Scanner;

public class Ejercicio_lenght {

	public static void main(String[] args) {

		/*
		 * 10. Realizar un programa que solo permita introducir frases o palabras
		 * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
		 * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
		 * contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
		 * Lenght() en Java.
		 */

		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		// Entrada de Datos
		System.out.println("Ingrese una frase de 8 caracteres: ");
		frase = entrada.nextLine();
		
		entrada.close(); // cerramos entrada de datos
		
		// Validamos la longitud de la frase
		if (frase.length() == 8) {
			System.out.println("CORRECTO!!");
		} else {
			System.out.println("INCORRECTO!!");
		}
	}

}
