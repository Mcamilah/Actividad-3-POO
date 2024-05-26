package ejercicio40;

public class Calculos {
    public static String Raiz(int num){
        String resultado;
        double raiz=Math.pow(num,0.5);
        resultado=String.valueOf(raiz);
        return resultado;
                }
    public static String Cuadrado (int num){
        String resultado;
        double cuadrado=Math.pow(num, 2);
        resultado=String.valueOf(cuadrado);
        return resultado;
    }
    public static String Cubo (int num){
        String resultado;
        double cubo=Math.pow(num, 3);
        resultado=String.valueOf(cubo);
        return resultado;
    }
    
}
