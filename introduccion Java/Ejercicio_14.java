/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author Fabian&
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
14. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
        */
        
        Scanner entrada = new Scanner(System.in);
        
        int Numero1;
        int Numero2;
        int Suma = 0;
        int Bandera = 0;
        
        /// llenamos el primer limite
        System.out.println("Ingrese un valor límite positivo:");
        Numero1 = entrada.nextInt();
            
        /// entramos al bucle mientras sea cero
        while (Bandera == 0) {
            
            // Entrada de datos
            System.out.println("Ingrese un número:");
            Numero2 = entrada.nextInt();
            
            /// sumamos el valor 
            Suma = Suma + Numero2;
        
            // si limite es mayor a la suma 
            if(Numero1 <= Suma){
                
                System.out.println("La Suma es ("+Suma+") mayor. El límite es: "+Numero1);
                Bandera = 1;
                
            }
            
        }
        entrada.close(); // cerramos la entrada de datos
        
    }
    
}
