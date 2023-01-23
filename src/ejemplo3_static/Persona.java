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
public class Persona {
    private String nombre;
    private int edad;
    private static int contadorPersonas=0;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.contadorPersonas++;
    }
    
    public static int getContadorPersonas() {
            return contadorPersonas;
    }
    
}

