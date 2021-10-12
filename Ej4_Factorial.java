/*Ejercicio Nivel 1
Nº 4)   
    -Realizar un programa que calcule el factorial de un número:
    n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
    Sin hacer uso de librerías.*/

import java.util.Scanner;

public class Ej4_Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      
        
        System.out.println("Calculo del factorial de un número");        

        System.out.println("Introduce un numero entero: " );

        int num = scan.nextInt();
      
        System.out.println("El factorial de " + num +" es: " + factorial(num));
        scan.close();
    }

    private static int factorial(int num) {

        int factorial =1;
        for (int i = 1; i<= num; i++){
            factorial *=i;
        }
        return factorial;
    }

    
    
}
