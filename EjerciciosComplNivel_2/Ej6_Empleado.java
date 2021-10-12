//Crear clase Empleado para clase SueldoEmpleado (Ejercicio Nº6)
public class Ej6_Empleado {
    //Atributos
    private String nombre_y_apellido;
    private String DNI;
    private int horasTrabajadas;
    private int valorPorHora;
    //Costructor
    public Ej6_Empleado(String nombre, String dni, int horasTrabajadas, int ValorPorHora){
        this.nombre_y_apellido = nombre;
        this.DNI = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = ValorPorHora;
    }
    //Por ser datos privados, necesito:

    public String getNombre_y_apellido() {
        return nombre_y_apellido;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public int getValorPorHora() {
        return valorPorHora;
    }
    public String getDNI() {
        return DNI;
    }

    

}
