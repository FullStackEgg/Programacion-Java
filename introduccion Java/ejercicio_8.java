package introduccionjava;

import java.util.Scanner;

public class ParImpar {

     public static void main(String[] args) {

          // 8. Crear un programa que dado un numero determine si es par o impar.

          Scanner entrada = new Scanner(System.in);

          int num1;

          // Entrada de datos
          System.out.println("Ingrese el primer número:");
          num1 = entrada.nextInt();

          entrada.close(); // cerramos la entrada de datos

          // Determinamos si el número es par o impar
          if (num1 % 2 == 0) {
               System.out.println("El número " + num1 + " es Par.");
          } else {
               System.out.println("El número " + num1 + " es Impar.");
          }

     }

}
