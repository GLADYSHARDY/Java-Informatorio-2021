/*Ejercicio Nivel 1
Nº 3)  
    Confeccionar un programa que dado un número entero como dato de entrada 
    imprima la secuencia de números (incrementos de 1) de la siguiente forma:


    Input (Entrada):
    5

    Output (Salida):4
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
    */

import java.util.Scanner;


public class Ej3_Secuencia {

    public static void main(String[] args) {
        
        int a;

        Scanner consola = new Scanner (System.in);
        System.out.println("Introduce un número entero:");
        
        a = consola.nextInt();

        int cont = 1;
        int i = 1;
        while( i <= a ){

            for(int x = 1; x <= cont; x++){
                System.out.print(x);
            }
            System.out.println("");
            cont++;
            i++;
        }

        consola.close();
                       

       
               
        
    }
    
}
