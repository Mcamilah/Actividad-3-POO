
package figurasgeometricas;


public class rectangulo {
    public static String area (int base, int altura){
        String resultado;
        double area=base*altura;
        resultado=String.valueOf(area);
        return resultado;
    }
    public static String perimetro (int base, int altura){
        String resultado;
        double perimetro=(2 * base) + (2 * altura);
        resultado=String.valueOf(perimetro);
        return resultado;
    }
}
