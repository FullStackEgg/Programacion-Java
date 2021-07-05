package introduccionjava;

import java.util.Scanner;

public class EjercicioEquals {

     public static void main(String[] args) {

          /*
           * 9. Crear un programa que pida una frase y si esa frase es igual a “eureka” el
           * programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
           * Incorrecto. Nota: investigar la función equals() en Java.
           */

          Scanner entrada = new Scanner(System.in);

          String frase;

          // entrada de datos
          System.out.println("Ingrese una frase: ");
          frase = entrada.nextLine();

          entrada.close();

          // comparamos la frase ingresada
          if (frase.equals("eureka")) {
               System.out.println("Correcto!!.");
          } else {
               System.out.println("Incorrecto");
          }

     }

}
