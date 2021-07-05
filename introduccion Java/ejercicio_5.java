package introduccionjava;

import java.util.Scanner;

public class Centrigrados_a_Fahrenheit {

	public static void main(String[] args) {

		/*
		 * 5. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
		 * grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int tempC, tempF;
		
		System.out.println("Ingrese la temperatura actual en °C: ");
		tempC = entrada.nextInt();
		
		entrada.close();
		
		// Calculamos la tempreatura en Fahrenheit
		tempF = 32 + (9 * tempC / 5);
		
		System.out.println("La temperatura en grados Fahrenheit es: " + tempF + "°F");
		
	}

}
