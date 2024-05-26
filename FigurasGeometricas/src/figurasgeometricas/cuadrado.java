package figurasgeometricas;

public class cuadrado {
    public static String area (int lado){
        String resultado;
        double area=lado*lado;
        resultado=String.valueOf(area);
        return resultado;
    }
    public static String perimetro (int lado){
        String resultado;
        double perimetro=4*lado;
        resultado=String.valueOf(perimetro);
        return resultado;
    }
    
}
