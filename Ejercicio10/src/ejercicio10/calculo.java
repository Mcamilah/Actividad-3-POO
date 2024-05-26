
package ejercicio10;

public class calculo {
    public static String Matricula (double PAT, double EST){
        String resultado;
        double PAGMAT=50000;
        if ((PAT > 2000000) && (EST > 3)) {
            PAGMAT = PAT + (0.03 * PAT);
    }
        resultado=String.valueOf(PAGMAT);
        return resultado;
    
    }
}   
