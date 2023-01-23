/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3_static;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Tomás Navarra", 22);
        Persona p2 = new Persona("Alicia",30);
        Persona p3 = new Persona("Jonás Estacio", 23);
        System.out.println("Se han creado: " +
                Persona.getContadorPersonas() + 
                " personas"); 
    }
    
}
