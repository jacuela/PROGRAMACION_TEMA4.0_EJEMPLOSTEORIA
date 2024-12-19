/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo1_persona_;

import ejemplo0_persona.*;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double peso;
    private double altura;
    
    
    
    //Constructor por defecto
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellidos){ //int edad, String DNI){
        this.nombre = nombre;
        this.apellidos = apellidos;
//        this.edad = edad;
//        this.dni = DNI;
    }
   
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

   
   
    
    
}
