 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author juan.antonio
 */
public class Persona {
    private String nombre;
    private int edad;
    private double altura;
    private String sexo;
    
    //Constructor por defecto
    public Persona(){
        
    }
    
    public Persona(String nombre, int edad, double altura, String sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
        this.sexo=sexo;
    }

    //Constructor copia
    public Persona(Persona p){
        this.nombre=p.getNombre();
        this.edad=p.getEdad();
        this.altura=p.getAltura();
        this.sexo=p.getSexo();
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
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        
        if (sexo.equals("M"))
            this.sexo=sexo;
        else if (sexo.equals("F"))
            this.sexo=sexo;
        else if (sexo.equals("otro"))
            this.sexo=sexo;
        else
            System.out.println("ERROR: sexo incorrecto");

    }
   
    
    
    
    
}
