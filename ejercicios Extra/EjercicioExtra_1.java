/**
 *  1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
 * el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
 * horas.
 */

package extraguia_5_0;

import java.util.Scanner;

/**
 * @author Felipe Herrera
 */
public class EjercicioExtra_1 {

       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);

              // constante
              final int MIN_DIA = 1440; // 1440 son los minutos de un dia

              System.out.println("Ingrese el tiempo en minutos");
              int minutos = sc.nextInt();

              int horas = (minutos / 60);
              int dias = minutos / MIN_DIA;

              sc.close();

              System.out.println("El tiempo ingresado fue " + minutos + " minutos");
              System.out.println("Equivalente a: " + dias + " dias, y " + horas + " horas.");
       }
}