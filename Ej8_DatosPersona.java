/*
8-Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

import java.util.Scanner;

public class Ej8_DatosPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nombre y Apellido: ");
        String nombre = sc.nextLine();

        System.out.println("Edad :");
        String edad = sc.nextLine();        


        System.out.println("Calle :");
        String calle = sc.nextLine();
       
        System.out.println("Ciudad:");
        String ciudad = sc.nextLine();

        
        System.out.println(ciudad+"-"+ calle +"-"+ edad+"-"+ nombre);

        sc.close(); 
    }
    
}
