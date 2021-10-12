/*Ejercicio Nivel 1
Nº 5)   
-Se desea una aplicación que solicite 2 números enteros y realice 
la operación de multiplicación por sumas sucesivas 
(sin uso de librerías).*/

import java.util.Scanner;

public class Ej5_SumaSuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca un numero entero");
        int a = scanner.nextInt();
        System.out.println("Introduzca un otro numero entero");
        int b = scanner.nextInt();

        int i = 0;
        int r = 0;

        while(i < b){
            r += a;
            i++;
        }

        System.out.println("El resultado es: "+a+" x "+b+" = "+r);

        scanner.close();
    }

}
    

