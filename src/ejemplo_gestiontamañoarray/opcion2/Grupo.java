/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_gestiontamañoarray.opcion2;

import ejemplo_gestiontamañoarray.opcion1.*;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Grupo {
    private String nombre;
    private Alumno[] lista;
    
    public Grupo(String nombre){
        this.nombre=nombre;
        lista=new Alumno[30];
        
    }
   
    public void addAlumno(Alumno a){
        //Voy a buscar el primer hueco
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==null){
                lista[i]=a;
                break;  
            }
        }
       
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alu=null;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==null){
                break;
            }
            else if (lista[i].getId()==id){
               return lista[i]; 
            } 
        }
        return alu;
        
    }
    
    public void listarGrupo(){
        System.out.println("Grupo:  "+this.nombre);
        System.out.println("=========================");
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==null){
                break;
            }
            else{
                System.out.println(lista[i].toCadena());  
            } 
            
        }
    }
  
    
    
    //OPCION USANDO UN METODO QUE ME DEVUELVE EL TAM EFECTVO DEL ARRAY
    
    public void listarGrupo2(){
        System.out.println("Grupo:  "+this.nombre);
        System.out.println("=========================");
        
        for (int i = 0; i < this.totalAlumnos(); i++) {
                System.out.println(lista[i].toCadena());  
        }    
        
    }
    
    
    private int totalAlumnos(){
        int total=0;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]==null)
                break;
            else
                total++;
            
        }
        return total;
        
        
        
    }
    
    
    
}
