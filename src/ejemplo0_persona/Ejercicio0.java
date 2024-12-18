/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo0_persona;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejercicio0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1=new Persona();
        
        persona1.setNombre("Alicia");
        persona1.setEdad(40);
        persona1.setDni("12345678A");
        
        System.out.println("Datos de persona1");
        System.out.println("-----------------");
        System.out.println("Nombre:"+persona1.getNombre());
        System.out.println("Edad:"+persona1.getEdad());
        System.out.println("DNI:"+persona1.getDni());
        
        
        System.out.println("------------");
        Persona perico = new Persona("Pedro Zamora",25,"12345678A");
        System.out.println("Los datos del objeto son:");
        System.out.println("  DNI: "+perico.getDni());
        System.out.println("  Nombre: "+perico.getNombre());
        System.out.println("  Edad: "+perico.getEdad());
        
        
        
    }
    
}
