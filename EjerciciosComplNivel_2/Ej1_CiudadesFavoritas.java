/*  NIVEL 2 
EJERCICIOS : 1)
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
luego imprimir por pantalla el ranking

Input (Entrada):
Bariloche
Córdoba
Resistencia

Output (Salida):
#1 - Bariloche
#2 - Córdoba
#3 - Resistencia
*/
import java.util.ArrayList;

public class Ej1_CiudadesFavoritas {
 public static void main(String[] args) { 

    // Declaracion
    ArrayList<String>lista;

    // Crear instancia   
    lista = new ArrayList<String>();

    //Agrego elementos
    lista.add (" Bariloche ");
    lista.add (" Cordoba ");
    lista.add (" Resistencia ");

        System.out.println(" Mis ciudades favoritas son: " + lista);

        System.out.println("#1- Bariloche"); 
        System.out.println("#2- Cordoba");
        System.out.println("#3- Resistencia");  
       
    } 
    
}
    








