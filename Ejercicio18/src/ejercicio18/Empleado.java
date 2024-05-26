package ejercicio18;    

public class Empleado {
    
   public static String salariobruto (double salario_horar, double horas_trabajadasr) {
      String result;
      double salariobruto=salario_horar * horas_trabajadasr;
      result=String.valueOf(salariobruto);
      return result;      
 } 
      
   public static String salarioneto (double salario_horar, double horas_trabajadasr, double pctj_retencionr){
       String result;
       double salarioneto= (salario_horar * horas_trabajadasr)-(salario_horar * horas_trabajadasr* (pctj_retencionr / 100));
      result=String.valueOf(salarioneto);
       return result;
   }
 }
    

