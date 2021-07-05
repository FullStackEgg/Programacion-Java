package introduccionjava;

import java.util.Scanner;

public class NumeroMayor {

     public static void main(String[] args) {

          // 7. Implementar un programa que dado dos números enteros determine cuál es el
          // mayor y lo muestre por pantalla.

          Scanner entrada = new Scanner(System.in);

          int num1, num2;

          // Entrada de datos
          System.out.println("Ingrese el primer número:");
          num1 = entrada.nextInt();

          System.out.println("ingrese el segundo número:");
          num2 = entrada.nextInt();

          entrada.close(); // cerramos la entrada de datos

          // Determinamos que numero es mayor
          if (num1 > num2) {
               System.out.println("El número " + num1 + " es mayor que " + num2);
          } else {
               System.out.println("El número " + num2 + " es mayor que " + num1);
          }

     }

}
