/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2_gato;

/**
 *
 * @author juan.antonio
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gato tom=new Gato("marron",5,"macho");
        Gato melisa=new Gato("blanco",5,"hembra");
        Gato jerry=new Gato("negro",3,"macho");
        
        System.out.println("Maulla tom!!!");
        tom.maulla();
        System.out.println("Estas agusto?");
        tom.ronronea();
        System.out.println("Toma un chuletón!");
        tom.comer("chuleton");
        System.out.println("Toma una lubina");
        tom.comer("pescado");
        System.out.println("-----------------");
        System.out.println("Tom pelea con Melisa");
        tom.peleaCon(melisa);
        System.out.println("Tom pelea con Jerry");
        tom.peleaCon(jerry);
        System.out.println("Melisa pelea con Jerry");
        melisa.peleaCon(jerry);
    }
    
}
