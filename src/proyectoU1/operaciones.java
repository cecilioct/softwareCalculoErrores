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
        double E_A=Uno-Dos;
        return E_A;
    }
    public double redondeoER(double Uno, double Dos){
        double E_R=(Uno-Dos)/Uno;
        return E_R;
    }
}
