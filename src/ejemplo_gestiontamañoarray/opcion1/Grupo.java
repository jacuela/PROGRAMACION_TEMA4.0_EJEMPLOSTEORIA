/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_gestiontamañoarray.opcion1;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Grupo {
    private String nombre;
    private Alumno[] lista;
    
    private int contador=0; //atributo para contar
                                 //los alumnos totales
    
    public Grupo(String nombre){
        this.nombre=nombre;
        lista=new Alumno[30];
        contador=0;
    }
   
    public void addAlumno(Alumno a){
       if (contador<30){
            lista[contador]=a;
            contador++;
       }     
       else{
            System.out.println("Total alumos completado");
       }     
    }
    
    
    public Alumno buscarAlumno(int id){
        Alumno alu=null;
        
        for (int i = 0; i < this.contador; i++) {
            if (lista[i].getId()==id){
               return lista[i]; 
            } 
        }
        return alu;
        
    }
    
    public void listarGrupo(){
        System.out.println("Grupo:  "+this.nombre);
        System.out.println("=========================");
        for (int i = 0; i < contador; i++) {
            System.out.println(lista[i].toCadena());
        }
    }
  
    
    
    
}
