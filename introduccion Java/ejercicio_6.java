package introduccionjava;

import java.util.Scanner;

public class EjercicioMathSqrt {

     public static void main(String[] args) {

          // 6. Escribir un programa que lea un numero entero por teclado y muestre por
          // pantalla el doble, el triple y la raiz cuadrada de ese numero.
          // Nota: investigar la funcion Math.sqrt().

          Scanner entrada = new Scanner(System.in);

          int num;

          System.out.println("Ingrese un número entero: ");
          num = entrada.nextInt();

          entrada.close();

          System.out.println("El doble de: " + num + " es :" + (num * 2));
          System.out.println("El triple de: " + num + " es :" + (num * 3));
          System.out.println("La raiz cuadrada de: " + num + " es :" + Math.sqrt(num));

     }

}
