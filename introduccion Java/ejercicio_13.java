/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author Fabian&
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        13. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
        */
        
        Scanner entrada = new Scanner(System.in);
        
        int Nota;
        int Bandera = 0;

        /// entramos al bucle mientras sea cero
        while (Bandera == 0) {
            
            // Entrada de datos
            
            System.out.println("Ingrese un número:");
            Nota = entrada.nextInt();
            //entrada.close(); // cerramos la entrada de datos
            
        
            // si la nota es correcta
            if(Nota >= 0 && Nota <= 10){
                
                System.out.println("La nota es correcta. La Nota es: "+Nota);
                Bandera = 1;
                
                
            }else{
                
                System.out.println("La nota es incorrecta debe ingresar un valor de 0 a 10.");
                
            }
            
            
            
        }
        entrada.close(); // cerramos la entrada de datos

    }
    
}
