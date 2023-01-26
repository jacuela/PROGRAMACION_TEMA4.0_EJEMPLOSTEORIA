/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_gestiontamañoarray.opcion3;

import java.util.ArrayList;


/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Grupo {
    private String nombre;
    private ArrayList<Alumno>lista;
    
    private final int MAX_ALUMNOS;
    
    public Grupo(String nombre){
        this.nombre=nombre;
        lista=new ArrayList<>();
        MAX_ALUMNOS=30;
        
    }
   
    
    public void addAlumno(Alumno a){
       
        if (lista.size()<MAX_ALUMNOS){
            lista.add(a);
        }
        else{
            System.out.println("No puedo añadir más alumnos.");
        }    
        
    }
    
    
    public Alumno buscarAlumno(int id){
        Alumno unalumno; //=null;
        
        
        for (int i = 0; i < lista.size(); i++) {
            
            unalumno=lista.get(i); //alumno en la posicion i
            
            //Compruebo el ID del alumno i
            if (unalumno.getId()==id){
               return unalumno; 
            } 
        }
        
        //Si llego aquí, es porque no he contrado al alumno
        return null;
        
    }
    
    public void listarGrupo(){
        Alumno alu;
        
        System.out.println("Grupo:  "+this.nombre);
        System.out.println("=========================");
        
        //Recorro el arraylist con un for normal
        for (int i = 0; i < lista.size(); i++) {
            alu=lista.get(i); //obtengo cada alumno
            System.out.println(alu.toCadena());
        }
        
//        //Recorro el arraylist con un foreach
//        for (Alumno alumno : lista) {
//            System.out.println(alumno.toCadena());
//        }
       
    }
  
    
    
    
}
