/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre  * su equivalente en romano.
 */

package extraguia_5_0;

import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 */
public class EjercicioExtra_4 {

       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);
              int num;

              System.out.println("Ingrese una numero entre 1 y 10");
              num = sc.nextInt();

              equivalenteRomano(num);

              sc.close();
       }

       /**
        * Recibe el numero y muestra su equivalente en valor romano
        * 
        * @param num
        */
       private static void equivalenteRomano(int num) {

              switch (num) {
                     case 1:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: I");
                            break;

                     case 2:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: II");
                            break;

                     case 3:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: III");
                            break;

                     case 4:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: IV");
                            break;

                     case 5:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: V");
                            break;

                     case 6:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: VI");
                            break;

                     case 7:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: VII");
                            break;

                     case 8:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: VIII");
                            break;

                     case 9:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: IX");
                            break;

                     case 10:
                            System.out.println("El numero [" + num + "] en su equivalente romano es: X");
                            break;

                     default:
                            System.out.println("El numero ingresado esta fuera de rango");
                            break;
              }
       }
}
