/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_gestiontamañoarray.opcion1;

import java.util.Scanner;

/**
 *
 * @author Juan Antonio Cuello Alarcon
 */
public class Opcion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        //Alumno alu;
        
        Grupo miClase=new Grupo("Grupo_TIA");
        
        miClase.addAlumno(new Alumno("Mortadelo",20));
        miClase.addAlumno(new Alumno("Filemon",18));
        miClase.addAlumno(new Alumno("Carpanta",30));
        
        miClase.listarGrupo();
        
        System.out.println("");
        System.out.print("Introduce ID:");
        int id=Integer.parseInt(teclado.nextLine());
        
        Alumno alu=miClase.buscarAlumno(id);
        
        if (alu!=null){
              alu.imprimirDetalles();
        }
        else{
            System.out.println("Alumno no encontrado");
        }
        
        
        
    }
    
}
