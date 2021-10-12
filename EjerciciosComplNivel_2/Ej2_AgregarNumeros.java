/*  NIVEL 2 
EJERCICIOS : 2)

Crear un ArrayList, agregar 5 números enteros. 
Luego, agregar un número entero al principio de la lista y otro al final. 
Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma 
(antes y después de agregar, a la primera y última posición).
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Ej2_AgregarNumeros {
    public static void main(String[] args) {
        //para ingresar números
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese N numeros enteros:\t");
        //crear variable:
        int numero = teclado.nextInt();

        //Creo la lista de números enteros.-
        ArrayList<Integer>lista;
        lista = new ArrayList<Integer>();

        //Cargamos la lista
        for (int i=0; i< numero; i++) {

                System.out.print("Ingrese un numero:");
                int num= teclado.nextInt();
                lista.add(num);                        
        }
            
        //Mostramos la lista
                System.out.println("La lista es:"+lista);
                System.out.println("El tamano de la lista es: "+ lista.size());

                for (Integer num:lista){           
                    System.out.println(num);
                   
        }
    
        //Ingresar nuevo valor a la lista.-
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Ingrese nuevo valor al inicio de la lista: ");

        int nuevoValor = teclado1.nextInt();
                
        lista.add(0,nuevoValor);

        System.out.println("Ingrese ultimo valor de la lista: ");

        nuevoValor = teclado1.nextInt();
        lista.add(nuevoValor);
        
        System.out.println(lista);

        System.out.println("El tamano de la lista es: "+ lista.size());
        
        teclado.close();   
        teclado1.close();
    }
 
          
}
