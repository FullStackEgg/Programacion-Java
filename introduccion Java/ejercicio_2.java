package ejericicio_1;

import java.util.Scanner;

public class SumaNumeros {

     public static void main(String[] args) {

          /*
           * Escribir un programa que pida dos números enteros por teclado y calcule la
           * suma de los dos. El programa deberá después mostrar el resultado de la suma
           */

          int num1, num2;

          Scanner entrada = new Scanner(System.in);

          System.out.println("Ingrese los números que desea sumar:");

          num1 = entrada.nextInt();
          num2 = entrada.nextInt();

          System.out.println("La suma de: " + num1 + " + " + num2 + " = " + (num1 + num2));

     }

}
