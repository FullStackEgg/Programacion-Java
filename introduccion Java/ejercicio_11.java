package introduccionjava;

import java.util.Scanner;

public class EjercicioSubstring {

	public static void main(String[] args) {

		/*
		 * 11. Escriba un programa que pida una frase o palabra y valide si la primera
		 * letra de esa frase es una �A�. Si la primera letra es una �A�, se deber� de
		 * imprimir un mensaje por pantalla que diga �CORRECTO�, en caso contrario, se
		 * deber� imprimir �INCORRECTO�. Nota: investigar la funci�n Substring y
		 * equals() de Java.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		String frase;
		
		System.out.println("Ingrese una frase o palabra:");
		frase = entrada.nextLine();
		
		entrada.close();
		
		// Pasamos a mayusculas
		frase = frase.toUpperCase();
		
		// Validamos el primer caracter de la frase, si es igual a "A"
		if (frase.substring(0,1).equals("A")) {
			System.out.println("CORRECTO, el primer caracter de la frase es una A");
		} else {
			System.out.println("INCORRECTO");
		}

	}

}
