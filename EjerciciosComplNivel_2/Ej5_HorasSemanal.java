/*  NIVEL 2 
EJERCICIOS : 5)

Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2)
del resumen de carga de horas semanal de un empleado. Se debe generar otra lista 
que contenga los totales y luego imprimir el total final a cobrar.
*/
import java.util.ArrayList;

public class Ej5_HorasSemanal {
    public static void main(String[] args) {
                
        ArrayList<Integer>horas_trabajadas = new ArrayList<Integer>();
        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);

        ArrayList<Integer>valor_por_hora = new ArrayList<Integer>();
        valor_por_hora.add(350);
        valor_por_hora.add(345);
        valor_por_hora.add(550);
        valor_por_hora.add(600);
        valor_por_hora.add(320);

        ArrayList<Integer>totales = new ArrayList<Integer>();

        for(int i = 0; i < horas_trabajadas.size(); i++){

            int subTotal = valor_por_hora.get(i) * horas_trabajadas.get(i);

            totales.add(subTotal);

        }

        System.out.println(totales);

        // OBTENER SALARIO TOTAL

        int total = 0;
        for(Integer i:totales){
            total += i;
        }

        System.out.println("Total a pagar: $" + total);

    }
    
}
