/*  NIVEL 2 
EJERCICIOS : 6)

Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular
el sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego 
almacenar en un Map (o Diccionario) donde la clave (key) es el dni 
y el valor (value) es el sueldo calculado. 
*/
import java.util.HashMap;
import java.util.HashSet;


    public class Ej6_SueldoEmpleado {

    public static void main(String[] args) {
        //Utilizo la clase Empleado (Objetc)
        HashSet<Ej6_Empleado> empleado = new HashSet<Ej6_Empleado>();
        Ej6_Empleado emp1 = new Ej6_Empleado("Alicia Gonzales","18116780",30,300);
        Ej6_Empleado emp2 = new Ej6_Empleado("Jose Piedara","35445445",40,300);
        Ej6_Empleado emp3 = new Ej6_Empleado("Maria Perez","40562789",50,300);
        Ej6_Empleado emp4 = new Ej6_Empleado("Osvaldo Juarez","30456789",45,300);
        
        empleado.add(emp1);
        empleado.add(emp2);
        empleado.add(emp3);
        empleado.add(emp4);

        HashMap<String, Integer> total = new HashMap<String, Integer>();

        for(Ej6_Empleado i: empleado){
            int calculoSueldo = i.getHorasTrabajadas() * i.getValorPorHora();
            total.put(i.getDNI(), calculoSueldo);
        }
        System.out.println(total);
    }
}

