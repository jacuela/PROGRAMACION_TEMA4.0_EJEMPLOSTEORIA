/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_fechas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;




/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf_hora=DateTimeFormatter.ofPattern("HH:mm");
        
        
        //Obtenemos la fecha de hoy
        LocalDate fecha_hoy=LocalDate.now();
        System.out.println("Fecha hoy(formato por defecto): "+fecha_hoy);
        
        System.out.println("Fecha hoy(mi formato) "+fecha_hoy.format(dtf));
        
        String fecha_factura=fecha_hoy.format(dtf);
        System.out.println("Fecha factura: "+fecha_factura);
        
        
        //Hora actual
        LocalTime hora_actual=LocalTime.now(); //obtener la hora actual
        System.out.println("Hora actual(defecto): "+hora_actual);
        System.out.println("Hora actual(formateada): "+hora_actual.format(dtf_hora));
        
        
        //Leer por teclado una fecha
        LocalDate fecha=null;
        
        do{
                System.out.print("Dime una fecha(dd/mm/aaaa): ");
                String fecha_teclado=teclado.nextLine();
                
                
                try {
                    fecha = LocalDate.parse(fecha_teclado, dtf);
                    break;
                } catch (Exception ex) {
                    System.out.println("Datos de la excepcion:"+ex);
                    System.out.println("Error de fecha.");
                }
                
        }while(true);         
        
        
        System.out.println("Fecha introducida: "+fecha.format(dtf));
        
        
        
        //Leer dos fechas y decir los dias de diferencia
         
//         LocalDate fecha1=LocalDate.now();
//         LocalDate fecha2;
//         
//         System.out.print("Dime una fecha(dd/mm/aaaa): ");
//         String fecha_teclado=teclado.nextLine();
//         fecha2 = LocalDate.parse(fecha_teclado, dtf);
//                    
//         //Calculando dias entre fechas usando CHRONOUNIT
//         long dias = ChronoUnit.DAYS.between(fecha1, fecha2);
//         long meses = ChronoUnit.MONTHS.between(fecha1, fecha2);
//         
//         System.out.println("Entre las dos fechas hay "+dias+" dias.");
//         System.out.println("Entre las dos fechas hay "+meses+" meses.");

         
         
               
        
        
        
        
        
        
        
        
    }
    
}
