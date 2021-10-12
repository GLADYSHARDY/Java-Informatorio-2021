/*Ejercicio Nivel 1
Nº 1)
-Solicitar por consola el nombre del usuario e imprimir por pantalla
 el siguiente mensaje “HOLA {USUARIO}!!!”

Input (Entrada):
Obi Wan Kenobi

Output (Salida):
HOLA Obi Wan Kenobi
*/

import java.util.Scanner;

public class Ej1_Usuario {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Introduce tu nombre: ");

        String a = scan.nextLine();
        System.out.println("HOLA"+" "+a+"!!!");

        scan.close();  
    } 
    

}
