/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_15;

import java.util.Scanner;

/**
 *
 * @author Fabian&
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
15. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
        */
        Scanner entrada = new Scanner(System.in);
        
        
        int Numero1;
        int Numero2;
        double calculo;
        int Opcion = 0;
        int Bandera = 0;
        
        /// llenamos el primer numero
        System.out.println("Ingrese primer número:");
        Numero1 = entrada.nextInt();

        /// llenamos el segundo numero
        System.out.println("Ingrese el segundo número:");
        Numero2 = entrada.nextInt();
        //entrada.close(); // cerramos la entrada de datos 
        
        /// entramos al bucle mientras sea cero
        while (Bandera == 0) {
            
            Opcion = Menu();
            
            // comprobamos que tipo calculo a realizar
            switch(Opcion) {
              case 1:
                  calculo = Numero1 + Numero2;
                  System.out.println("La Suma es: "+calculo);
              break;
              case 2:
                  calculo = Numero1 - Numero2;
                  System.out.println("La Resta es: "+calculo);
              break;
              case 3:
                  calculo = Numero1 * Numero2;
                  System.out.println("La Multiplicacion es: "+calculo);
              break;
              case 4:
                  if(Numero2 == 0){
                      System.out.println("La Divicion por 0 es infinito.");
                  }else{
                    calculo = Numero1 / Numero2;
                    System.out.println("La Divicion es: "+calculo);
                  }
              break;
            }
        
            // si opcion es salir preguntamos si esta seguro
            if(Opcion == 5){
                
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String Confirmacion = entrada.next();
                
                if(Confirmacion.equals("S")){
                    Bandera = 1;
                }
                
            }
            
        }
        
        entrada.close(); // cerramos la entrada de datos
        
    }
    
    public static int Menu() {
        
        Scanner entrada = new Scanner(System.in);
        
        int Opcion = 0;
        
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        // Entrada de datos
        System.out.println("Ingrese una opcion:");
        Opcion = entrada.nextInt();
        
        if(Opcion < 1 || Opcion > 5){
            System.out.println("Error!!!");
        }
        
        return Opcion;
        
    }

}
