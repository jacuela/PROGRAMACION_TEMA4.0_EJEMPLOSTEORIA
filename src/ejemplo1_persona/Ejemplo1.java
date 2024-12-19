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
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona p1=new Persona("Mateo",18,1.78,78);
        
        System.out.println("Datos de p1");
        System.out.println("-----------------");
//        System.out.println("Nombre:"+p1.getNombre());
//        System.out.println("Edad:"+p1.getEdad());
//        System.out.println("Peso:"+p1.getPeso());
//        System.out.println("Altura:"+p1.getAltura());
        p1.imprimir();
        
        System.out.printf("Tu IMC es:%.2f\n",p1.devolverIMC());
        System.out.println("Estado de salud "+p1.estadoSaludSegunIMC());
        
        
        Persona p2 = new Persona(p1); //Creo copia o clon
        p2.setPeso(110);
        
        System.out.println("-----------------------------------");
        p2.imprimir();
        System.out.printf("Tu IMC es:%.2f\n",p2.devolverIMC());
        System.out.println("Estado de salud "+p2.estadoSaludSegunIMC());
        
        
        
        
    }
    
}
