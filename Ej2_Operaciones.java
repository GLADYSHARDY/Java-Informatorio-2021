/*Ejercicio Nivel 1
Nº 2) 
      Realizar un programa que solicite por consola 2 números enteros,
      Para luego imprimir el resultado de la:
      suma, resta, multiplicación, división y módulo (resto de la división)
      de ambos números.


      Input (Entrada):
        5
        4 

        Output (Salida):
        5 + 4 = 9
        5 - 4 = 1
        5 * 4 = 20
        5 / 4 = 1
        5 % 4 = 1       
                 
      */
    import java.util.Scanner;

    public class Ej2_Operaciones {
    public static void main(String[] args) {
        int a, b , c;
        Scanner consola = new Scanner (System.in);
        System.out.println("Introduce dos números enteros: ");

        a = consola.nextInt();
        b = consola.nextInt();
        c = a + b;

        System.out.println( + a +"+"+ b + "="+ c);

        c = a - b;
        System.out.println( + a +"-"+ b + "="+ c);

        c = a * b;

        System.out.println( + a +"*"+ b + "="+ c);

        c = a / b;
        System.out.println( + a +"/"+ b + "="+ c);  

        c = a % b;

        System.out.println( + a +" % " + b + " = "+ c);

        consola.close();




    }
}
