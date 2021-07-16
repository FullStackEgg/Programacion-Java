/**
 * Una obra social tiene tres clases de socios:
 *     - Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
 *        descuento en todos los tipos de tratamientos.
 *     - Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
 *        descuento para los mismos tratamientos que los socios del tipo A.
 *     - Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
 *        dichos tratamientos.
 * Solicite una letra (carácter) que representa la clase de un socio, y luego 
 * valor real que represente el costo del tratamiento (previo al descuento) Y
 * determine el importe en efectivo a pagar por dicho socio.
 */
package extraguia_5_0;

import java.util.Scanner;

/**
 * 
 * @author Felipe Herrera
 */
public class EjercicioExtra_5 {

       public static void main(String[] args) {

              Scanner sc = new Scanner(System.in);
              String socio;
              double costoTratamiento;

              System.out.println("[ MENU OBRA SOCIAL ]");
              System.out.println("- Socio tipo [ A ].");
              System.out.println("- Socio tipo [ B ].");
              System.out.println("- Socio tipo [ C ].");
              System.out.println("Ingrese el tipo de socio ( A, B o C) : ");
              socio = sc.next();

              System.out.println("Ingrese el valor del tratamiento: ");
              costoTratamiento = sc.nextInt();

              sc.close();

              descuentoSocio(socio, costoTratamiento);
       }

       private static void descuentoSocio(String socio, double costoTratamiento) {

              double descuento;

              switch (socio.toUpperCase()) {
                     case "A":
                            // Los socios tipo ‘A’ - 50% de descuento
                            descuento = 0.5;
                            System.out.print("EL importe total del socio tipo A es: ");
                            System.out.println("[ $" + (costoTratamiento * descuento) + " ]");
                            break;

                     case "B":
                            // Los socios tipo ‘B’ - 30% de descuento
                            descuento = 0.3;
                            System.out.print("EL importe total del socio tipo B es: ");
                            System.out.println("[ $" + (costoTratamiento * descuento) + " ]");
                            break;

                     case "C":
                            // Los socios tipo ‘C’, no reciben descuentos
                            System.out.print("EL importe total del socio tipo C es: ");
                            System.out.println("[ $" + costoTratamiento + " ]");
                            break;

                     default:
                            if ((!"A".equals(socio)) || (!"B".equals(socio)) || (!"C".equals(socio))) {
                                   System.out.println("El socio ingresado no existe.");
                            } else {
                                   if (costoTratamiento < 0) {
                                          System.out.println("El costo del tratamiento Invalido.");
                                   }
                            }
                            break;
              }
       }
}
