
package ejercicio22;

public class Calculo {
    public static String Calculo (String nombre_empleado, double salario_hora, int horas_trabajadas){
        String resultado;
        double salario_mensual=horas_trabajadas*salario_hora;
        if (salario_mensual > 450000){
            resultado=("El nombre del empleado es: " + nombre_empleado + " y su salario es: " + salario_mensual);
                }
                else{
                 resultado=("El nombre del empleado es: " + nombre_empleado);
                }
        return resultado;
    }
    
}
