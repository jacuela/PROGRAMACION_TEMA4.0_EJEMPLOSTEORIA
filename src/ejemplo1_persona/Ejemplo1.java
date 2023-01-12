/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1_persona;

/**
 *
 * @author juan.antonio
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1=new Persona();
        
        persona1.setNombre("Alicia");
        persona1.setEdad(-40);
        persona1.setEdad(40);
        persona1.setDni("12345678A");
        persona1.setAltura(1.73);
        
        System.out.println("Datos de persona1");
        System.out.println("-----------------");
        System.out.println("Nombre:"+persona1.getNombre());
        System.out.println("Edad:"+persona1.getEdad());
        System.out.println("DNI:"+persona1.getDni());
        System.out.println("Altura:"+persona1.getAltura());
        
        Persona persona2=new Persona("Antonio",18,"22222222A",1.68,70.5);
        System.out.println("\nDatos de persona2");
        System.out.println("-----------------");
        persona2.imprimirDatos();
        
        //Despues de navidad......
        persona2.setPeso(73.5);
        System.out.println("datos de persona2 despues de navidad");
        System.out.println("-------------------------------------");
        persona2.imprimirDatos();

        
        
        
        
        
//        Persona persona3=new Persona(persona2); //constructor copia
//        System.out.println("\nDatos de persona3");
//        System.out.println("-----------------");
//        persona3.imprimirDatos();
        
        
        
        
    }
    
}
