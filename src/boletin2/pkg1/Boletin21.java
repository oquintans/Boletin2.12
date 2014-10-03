/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg1;

import java.util.Scanner;


public class Boletin21 {

    public static void main(String[] args) {
        
        float sueldo,comision,ventas,km;
        int dias;
        
        System.out.println("Sueldo Fijo : ");
            Scanner dato=new Scanner(System.in);
            sueldo=dato.nextFloat();
            
        System.out.println("Importe de Ventas : ");
            ventas=dato.nextFloat();
            comision=(float) (ventas*0.05);
            
            
    
        }
    
}
