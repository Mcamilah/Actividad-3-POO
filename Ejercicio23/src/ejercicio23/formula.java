
package ejercicio23;

public class formula {
    public static String ecuacion (double a, double b,double c){
        String resultado;
        double determinante = Math.sqrt(Math.pow(b, 2)-(4*a*c));
        double valor1, valor2;
        valor1= (-b + determinante)/(2*a);
        valor2= (-b - determinante)/(2*a);
                                              
         if (determinante > 0) {
         resultado=("Valor 1:"+valor1+"Valor 2:"+valor2);
         } else{
           resultado=("La ecuacion de segundo grado no tiene soluciones reales");
         }
         return resultado;
   }
}

