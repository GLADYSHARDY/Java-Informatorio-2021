/*  NIVEL 2 
EJERCICIOS : 7)
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
Input (Entrada):
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)

Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
*/

import java.util.ArrayList;

public class Ej7_FizzBuzz {
    public static void main(String[] args) {
        



        ArrayList<String> fizz = fizzBuzz(10, 20);

        System.out.println(fizz);

    }


    public static ArrayList<String> fizzBuzz(int minimo, int limite){

        ArrayList<String> arrayFizzBuzz = new ArrayList<String>();

        for(int i = minimo; i < limite; i++){
            if(i % 3 == 0 && i % 2 == 0){
                arrayFizzBuzz.add("FizzBuzz");
            } else if(i % 3 == 0){
                arrayFizzBuzz.add("Buzz");
            } else if(i % 2 == 0){
                arrayFizzBuzz.add("Fizz");
            } else {
                arrayFizzBuzz.add(i+"");
            }
        }

        return arrayFizzBuzz;        

    }

}
