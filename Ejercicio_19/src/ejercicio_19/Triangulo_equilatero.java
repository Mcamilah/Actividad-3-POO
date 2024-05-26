
package ejercicio_19;

public class Triangulo_equilatero{
    
    public static String calculoarea (double ladot) {
        String resultado;
        double calculoarea=(Math.pow(ladot,2)*Math.sqrt(3))/4;
        resultado=String.valueOf(calculoarea);
        return resultado;  
    }
    
    public static String calculoperimetro (double ladot) {
        String resultado;
        double calculoperimetro=3*ladot;
        resultado=String.valueOf(calculoperimetro);
        return resultado;  
    }
    
    public static String calculoaltura (double ladot) {
        String resultado;
        double calculoaltura=(Math.sqrt(3)*(ladot/2));
        resultado=String.valueOf(calculoaltura);
        return resultado;  
    }           
}
