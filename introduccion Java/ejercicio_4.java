package introduccionjava;

import java.util.Scanner;

public class MayusculaMinuscula {

	public static void main(String[] args) {

		// 4. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
		// después toda en minúsculas. Nota: investigar la función toUpperCase() y
		// toLowerCase() en Java.

		String frase;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese una frase: ");
		frase = entrada.nextLine();

		entrada.close();
		
		// Pasamos a Mayusclas
		frase = frase.toUpperCase();

		System.out.println("La frase en mayúsculas: " + frase);

		// Pasamos a Minusculas
		frase = frase.toLowerCase();

		System.out.println("La frase en minuscúlas: " + frase);

	}

}
