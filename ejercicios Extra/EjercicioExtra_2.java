/**
 * 2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
 * cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
 * valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
 * Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
 * variable auxiliar.
 */
package extraguia_5_0;

/**
 * @author Felipe Herrera
 */
public class EjercicioExtra_2 {

       public static void main(String[] args) {

              int a, b, c, d, aux;

              a = 10;
              b = 5;
              c = 25;
              d = 9;

              System.out.println("[ Valores Iniciales ]");
              System.out.println("a = " + a);
              System.out.println("b = " + b);
              System.out.println("c = " + c);
              System.out.println("d = " + d);

              // Intercambiamos los valores
              aux = b; // 5
              b = c; // 25
              c = a; // 10
              a = d; // 9
              d = aux; // 5

              System.out.println("[ Valores Intercambiados ]");
              System.out.println("a = " + a);
              System.out.println("b = " + b);
              System.out.println("c = " + c);
              System.out.println("d = " + d);
       }
}
