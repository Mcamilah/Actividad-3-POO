
package figurasgeometricas;

public class circulo {
    public static String area (int radio){
        String resultado;
        double area= Math.PI*Math.pow(radio, 2);
        resultado=String.valueOf(area);
        return resultado;
    }
    
    public static String perimetro (int radio){
        String resultado;
        double perimetro= 2*Math.PI*radio;
        resultado=String.valueOf(perimetro);
        return resultado;
    }
    
}
