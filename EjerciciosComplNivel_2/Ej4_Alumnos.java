/*  NIVEL 2 
EJERCICIOS : 4)

Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos 
//en 3 cursos (3 arrayList) e imprimir dichos cursos.
// Ayuda: ArrayList posee un método para particionar en sub-listas?
*/
import java.util.ArrayList;
public class Ej4_Alumnos {

    public static void main(String[] args) {


        ArrayList<String>lista;
        lista = new ArrayList<String>();

        //Agrego elementos
        lista.add ("Juan");
        lista.add ("Maria");
        lista.add ("Alicia");
        lista.add ("Alejandro");
        lista.add ("Manuel");
        lista.add ("Tomas");
        lista.add ("Lucia");
        lista.add ("Julian");
        lista.add ("Susana");
        lista.add ("Carlos");
        lista.add ("Gustavo");
        lista.add ("Saulo");

        System.out.println(lista);
      
        ArrayList<String> curso1 = new ArrayList<String>(lista.subList(0, 4));
        ArrayList<String> curso2 = new ArrayList<String>(lista.subList(4, 8));
        ArrayList<String> curso3 = new ArrayList<String>(lista.subList(8, 12));

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
   
       
    }

    
}



