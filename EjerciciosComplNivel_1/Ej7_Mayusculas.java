/*Ejercicio Nivel 1
Nº 7)   
-Realizar un programa que dado un String de entrada en minúsculas lo 
convierta por completo a mayúsculas. Sin uso de métodos o librerías que 
realicen toUppercase().*/


import java.util.Scanner;

public class Ej7_Mayusculas {
    public static void main(String[] args) {
       Scanner sr = new Scanner(System.in);

       System.out.println("Introduce un palabra en minuscula: " );
       String palabra = sr.nextLine();
       mayusculas(palabra);
       sr.close();
    }

    public static void mayusculas(String a)
    {
        for (int i = 0; i< a.length(); i++)
        {
            char aChar = a.charAt(i);
            if (92 <= aChar && aChar<=122)
            {
                aChar = (char)( (aChar - 32) ); 
            }
            System.out.print(aChar);
            
                       
         }
         
     }


    
}
