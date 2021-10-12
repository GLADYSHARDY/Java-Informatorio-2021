/*Ejercicio Nivel 1
Nº 6)   
    -Se desea una aplicación que solicite 2 números enteros y realice la operación
    de potencia (sin uso de librerías).*/

    import java.util.Scanner;


    public class Ej6_Potencia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un primer numero entero: ");
        int a = s.nextInt();

        System.out.println("Introduzca un segundo numero entero: ");
        int b = s.nextInt();

        int r = 1;
        for(int i = 0; i<b;i++){
            r *= a;            
        }

        System.out.println("El Resultado es: " + r);

        s.close();

        }
    

}
