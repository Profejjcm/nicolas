/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.calcularpi;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 *
 * @author nicol
 */
public class CalcularPI {

     public static void main(String[] args) {
        MathContext mc = new MathContext(10);     
        
        //meter en el método compute
        
        BigDecimal pi = new BigDecimal(0);
        BigDecimal limit = new BigDecimal(1).movePointLeft(10);
        boolean stop = false;
        for (int k = 0; !stop; k++) {

            //meter en el método piFunction 
            int k8 = 8 * k;
            BigDecimal val1 = new BigDecimal(4);
            val1 = val1.divide(new BigDecimal(k8 + 1), mc);
            BigDecimal val2 = new BigDecimal(-2);
            val2 = val2.divide(new BigDecimal(k8 + 4), mc);
            BigDecimal val3 = new BigDecimal(-1);
            val3 = val3.divide(new BigDecimal(k8 + 5), mc);
            BigDecimal val4 = new BigDecimal(-1);
            val4 = val4.divide(new BigDecimal(k8 + 6), mc);
            BigDecimal val = val1;
            val = val.add(val2);
            val = val.add(val3);
            val = val.add(val4);
            BigDecimal multiplier = new BigDecimal(16);
            multiplier = multiplier.pow(k);
            BigDecimal one = new BigDecimal(1);
            multiplier = one.divide(multiplier, mc);
            val = val.multiply(multiplier);
            BigDecimal piK = piFunction(k, mc);
            
            
            //Tenemos que seleccionar el codigo que vamos sacar, entramos en "refactor", "introduce", "method", le ponemos ek nombre y le damos a la opcion de publico.
            BigDecimal piK = ClasePadre.piFunction(k, mc);
            //Ahora lo metemos en la clase padre
            //Para poner el metodo a una clase, creamos la clase, seleccionamos el metodo le damos a mover y miramos a qué clase lo vamos a mover.
            
//meter en el método piFunction
                
            pi = pi.add(piK);
            if (piK.compareTo(limit) < 0) {
               @@ -27,29 +27,5 @@ public static void compute(final int NUM_DIG, MathContext mc)
            }
        }
        System.out.println(pi.round(mc));
        //meter en el método compute
    }

    private static BigDecimal piFunction(int k, MathContext mc) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
}