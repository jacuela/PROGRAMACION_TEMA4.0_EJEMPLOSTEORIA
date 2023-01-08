/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

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
        
 
        //Creo una persona
        Persona persona1=new Persona("Alicia",18,1.60,"F");
        
        System.out.println("Mostrando los valores de persona1");
        System.out.println("Nombre:"+persona1.getNombre());
        System.out.println("Edad:"+persona1.getEdad());
        System.out.println("Altura:"+persona1.getAltura());
        System.out.println("Sexo:"+persona1.getSexo());
        
        persona1.setSexo("animalllll");
        System.out.println("Sexo:"+persona1.getSexo());
        
        System.out.println("----------------------------");
        Persona persona2=new Persona();
        persona2.setNombre("Perico");
        persona2.setEdad(65);
        persona2.setAltura(1.70);
        persona2.setSexo("M");
        System.out.println("Mostrando los valores de persona2");
        System.out.println("Nombre:"+persona2.getNombre());
        System.out.println("Edad:"+persona2.getEdad());
        System.out.println("Altura:"+persona2.getAltura());
        System.out.println("Sexo:"+persona2.getSexo());
        
        System.out.println("----------------------------");
        Persona persona3=new Persona(persona1);
        System.out.println("Mostrando los valores de persona3");
        System.out.println("Nombre:"+persona3.getNombre());
        System.out.println("Edad:"+persona3.getEdad());
        System.out.println("Altura:"+persona3.getAltura());
        System.out.println("Sexo:"+persona3.getSexo());
        
        
        
        
        
        
    }
    
}
