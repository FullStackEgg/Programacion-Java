/**
 * 3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
 * vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
 * clase String.
 */

package extraguia_5_0;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 */
public class EjercicioExtra_3 {

       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);
              String letra;

              System.out.println("Ingrese una letra: ");
              letra = sc.next();

              sc.close();

              esVocal(letra);
       }

       /**
        * Recibe una letra y valida si es una vocal o no
        * 
        * @param letra
        */
       private static void esVocal(String letra) {

              if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o")
                            || letra.equals("u")) {
                     System.out.println("[ La letra ingresada es una vocal!! ]");
              } else {
                     System.out.println("[ No es vocal ]");
              }

       }
}
