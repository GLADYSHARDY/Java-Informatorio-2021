/*  NIVEL 2 
EJERCICIOS : 3)

Crear una lista que contenga como elementos la numeración de cartas de
una baraja francesa (solo los valores, no figuras). 
Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso
(reverse), desordenar (mezclar) el arrayList y volver a imprimir.

Ayuda: ArrayList implementa la interface Collection, existe algún método que me
permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso*/

import java.util.ArrayList;
import java.util.Collections;


public class Ej3_BarajaFrancesa {

    public static void main(String[] args) {
        ArrayList<String>lista;
        lista = new ArrayList<String>();

        //Agrego elementos
        lista.add ("As");
        lista.add ("2");
        lista.add ("3");
        lista.add ("4");
        lista.add ("5");
        lista.add ("6");
        lista.add ("7");
        lista.add ("8");
        lista.add ("9");
        lista.add ("10");
        lista.add ("Jota");
        lista.add ("Reina Q");
        lista.add ("Rey K");

        System.out.println(lista);

        Collections.reverse(lista);

        System.out.println(lista);

        Collections.shuffle(lista);

        System.out.println(lista);







        
    }
}
