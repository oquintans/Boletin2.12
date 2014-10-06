
package boletin2.pkg1;

import java.util.Scanner;


public class Boletin21 {

    public static void main(String[] args) {
        
        float sueldo,ventas,km,sueldobruto,sueldototal;
        int dias;
        
        System.out.print("Sueldo Fijo : ");
            Scanner dato=new Scanner(System.in);
            sueldo=dato.nextFloat();
            
        System.out.print("Importe de Ventas : ");
            ventas=dato.nextFloat();            
        
        System.out.print("Km realizados : ");
            km=dato.nextFloat();
                    
        System.out.print("Dias desplazandose : ");
            dias=dato.nextInt();
        
            sueldobruto=(float) ((ventas*0.05)+(km*2)+sueldo+(dias*30));
            sueldototal=(float) ((sueldobruto-36)*0.82);
            
        System.out.println("Sueldo bruto : "+sueldobruto);
        System.out.println("Sueldo neto : "+sueldototal);

        
        }
    
}
