/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo4_arraylist;

import java.util.ArrayList;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creamos un arraylist de cadenas
        ArrayList<String> nombres=new ArrayList<>();
        
        //Añado elementos
        nombres.add("Paco");
        nombres.add("Alicia");
        nombres.add("Simon");
        
        //Imprimo el array con for tradicional
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
       
        
        //Imprimo el array con un foreach
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        
        //Otra forma de imprimir (nuevo). Solo si JAVA sabe como imprimir el tipo
        System.out.println("ArraList:"+nombres);
        
        
        
        
        
        
        
        
        //Creamos un arraylist de enteros
        ArrayList<Integer> numeros=new ArrayList<>();
        
        //Añado elementos
        numeros.add(12);
        numeros.add(15);
        numeros.add(18);
        numeros.add(18);
        
        System.out.println("Numeros:"+numeros);
     
        //Eliminadmos el objeto con indice 3
        numeros.remove(3); 
        System.out.println("Numeros:"+numeros);
     
        
        
        
        
        
        
    }
    
}
