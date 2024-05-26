
package ejercicio7;

public class Comparacion {
    public static String comparador (double A, double B){
    String resultado;
    resultado="Indefinido";
    if (A > B) {
    resultado="A es mayor a B";  
        } 
    else if (A == B) {
    resultado="A es igual a B";            
        } 
    else if (A < B) {
    resultado="A es menor a B";       
        }
    return resultado;
        }
    }
    
