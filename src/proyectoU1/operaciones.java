/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoU1;

/**
 *
 * @author cecilio
 */
public class operaciones {
     //Métodos para redondeo
     public double redondeoEA(double Uno, double Dos){
        double E_A=(Uno-Dos)*-1;
        return E_A;
    }
    public double redondeoER(double Uno, double Dos){
        double E_R=((Uno-Dos)*-1)/Uno;
        return E_R;
    }            
    
    //Método para truncamiento
    public double  truncamientoEA(double Uno, int t){
        double Dos=Decimales(Uno,t);
        double E_A=Uno-Dos;   
        return E_A;
    }
    
    public double truncamientoER(double Uno, int t){
        double Dos=Decimales(Uno,t);
        double E_R=(Uno-Dos)/Uno;
        return E_R;
    }    
    
   public static  double Decimales(Double numero , int numeroDecimales ){
        return  Math.round(numero * Math.pow(10, numeroDecimales  ))/Math.pow(10, numeroDecimales);
    }

}
