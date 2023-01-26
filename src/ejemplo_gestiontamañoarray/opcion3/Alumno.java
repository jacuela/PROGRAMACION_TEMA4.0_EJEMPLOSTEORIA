/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_gestiontamañoarray.opcion3;


/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Alumno {
    private int id;
    private String nombre;
    private int edad;
    
    public Alumno(String nombre, int edad){
        this.id=(int)(Math.random()*1000);
        this.nombre=nombre;
        this.edad=edad;
        
    }

    public int getId() {
        return id;
    }
    
    public void imprimirDetalles(){
        System.out.println("");
        System.out.println("Detalles del alumno");
        System.out.println("-------------------");
        System.out.println("ID: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        
    }
    
    public String toCadena(){
        
        //return "ID:"+id+"  "+nombre+ .......
        String alumno= String.format("ID:%d  %10s",id,nombre);
        return alumno;
    } 
    
    
    
   
    
    
    
    
}
