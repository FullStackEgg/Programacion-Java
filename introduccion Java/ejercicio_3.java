import java.util.Scanner;

public class App {

     public static void main(String[] args) throws Exception {

          // 3.Escribir un programa que pida tu nombre, lo guarde en una variable
          // y lo muestre por pantalla.

          String name;

          Scanner entrada = new Scanner(System.in);

          System.out.println("Cual es tú nombre: ");
          name = entrada.nextLine();

          System.out.println("Bienvenido: " + name);

     }
}
