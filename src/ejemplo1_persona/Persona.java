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
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private double altura;
    
    
    //Constructor por defecto
    public Persona(){
        
    }
    //Constructor con todos los parámetros
    public Persona(String nombre, int edad, String dni, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
        this.altura=altura;
    }
    
    //Constructor copia
    public Persona(Persona p){
        this.nombre=p.getNombre();
        this.edad=p.getEdad();
        this.dni=p.getDni();
        this.altura=p.getAltura();
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        //Compruebo que la edad es correcta
        if (edad <= 0){
            System.out.println("Error, edad negativa");
        }
        else{
           this.edad = edad; 
        }
        
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        
        //Comprobar que el dni es válido
        this.dni = dni;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    //Metodo para imprimir la informacion de la clase
    public void imprimirDatos(){
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Edad:"+this.edad);
        System.out.println("DNI:"+this.dni);
        System.out.println("Altura:"+this.altura);
        
        
       
    }
    
    
    
   
   
    
    
    
}
