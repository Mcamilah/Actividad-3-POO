
package figurasgeometricas;

public class triangulo {
    public static String area (int base, int altura){
        String resultado;
        double area=(base*altura/2);
        resultado=String.valueOf(area);
        return resultado;
    }
    public static String hipotenusa (int base, int altura){
        String resultado;
        double hipotenusa=Math.pow(base*base+altura*altura, 0.5);
        resultado=String.valueOf(hipotenusa);
        return resultado;
    }
    public static String perimetro (int base, int altura){
        String resultado;
        double hipotenusa=Math.pow(base*base+altura*altura, 0.5);
        double perimetro=(base + altura + hipotenusa); 
        resultado=String.valueOf(perimetro);
        return resultado;
    }
    public static String tipo (int base, int altura){
        String resultado;
        double hipotenusa=Math.pow(base*base+altura*altura, 0.5);
        if ((base == altura) && (base == hipotenusa) && (altura == hipotenusa))
            resultado="Es un triangulo equilatero"; /* Todos sus lados son iguales */
        else if ((base != altura) && (base != hipotenusa) && (altura != hipotenusa))
            resultado="Es un triangulo escaleno"; /* Todos sus lados son diferentes */
        else
            resultado="Es un triangulo isosceles"; /* De otra manera, es isósceles */
        return resultado;
    }
}
