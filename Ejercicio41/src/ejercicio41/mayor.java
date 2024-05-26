
package ejercicio41;
import java.util.ArrayList;

public class mayor {
    
    public static String mayor (ArrayList<Double> lista){
    String resultado;
    double mayor=lista.get(0);
    for (int i=1; i < 10; i++){
        if(mayor < lista.get(i))
           mayor = lista.get(i);
    }
    resultado=String.valueOf(mayor);
    return resultado;
    }
    
    public static String positivo (double num){
        String resultado="Indefinido";
        if(num>=0){
            resultado=String.valueOf(num);
        }
        else if (num<0){
            resultado="El valor ingresado no es positivo";
        }
        return resultado;  
    }
    
}
