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
    private double altura;
    private double peso;

    

    //Constructor con todos los parámetros
    public Persona(String nombre, int edad, double altura, double peso){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;
        this.peso=peso;
    }
    
    //Constructor copia
    public Persona (Persona p){
        this.nombre = p.getNombre();
        this.edad = p.getEdad();
        this.peso = p.getPeso();
        this.altura = p.getAltura();
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

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    public void imprimir(){
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Edad:"+this.edad);
        System.out.println("Peso:"+this.peso);
        System.out.println("Altura:"+this.altura);   
        
    }
    
    public double devolverIMC(){
        
        double IMC;
        IMC = this.peso / (this.altura*this.altura);
        return IMC;
    }

    public String estadoSaludSegunIMC(){
        
        double IMC = this.devolverIMC();
        if (IMC <18.5){
            return "TE FALTA PESO. Vete ahora mismo al TOKYO BURGUER";
        }
        else if (IMC>=18.5 && IMC <24.9){
            return "NORMAL";
        }
        else if (IMC >=25 && IMC<=29.9){
            return "SOBREPESO";
        }
        else{
            return "OBESO. Deja de comer dulces!! y SMASH burguers";
        }
        
        
    }



    
//    @Override
//    public String toString(){
//        return String.format("Nombre:%s  Edad:%d",this.nombre,this.edad);
//        
//    }
    
   

        




}

//
//    //Constructor por defecto
//    public Persona(){
//        
//    }
//    //Constructor con todos los parámetros
//    public Persona(String nombre, int edad, String dni, double altura, double peso){
//        this.nombre=nombre;
//        this.edad=edad;
//        this.dni=dni;
//        this.altura=altura;
//        this.peso=peso;
//        
//        //Calculo el IMC llamando al metodo privado
//        this.IMC=this.calcularIMC();
//        
//        
//    }
//    
//    //Constructor copia
//    public Persona(Persona p){
//        this.nombre=p.getNombre();
//        this.edad=p.getEdad();
//        this.dni=p.getDni();
//        this.altura=p.getAltura();
//    }
//    
//    
//    
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public int getEdad() {
//        return edad;
//    }
//
//    public void setEdad(int edad) {
//        //Compruebo que la edad es correcta
//        if (edad <= 0){
//            System.out.println("Error, edad negativa");
//        }
//        else{
//           this.edad = edad; 
//        }
//        
//    }
//
//    public String getDni() {
//        return dni;
//    }
//
//    public void setDni(String dni) {
//        
//        //Comprobar que el dni es válido
//        this.dni = dni;
//    }
//
//    public double getAltura() {
//        return altura;
//    }
//
//    public void setAltura(double altura) {
//        this.altura = altura;
//         this.IMC=this.calcularIMC();
//    }
//
//    public double getPeso() {
//        return peso;
//    }
//
//    public void setPeso(double peso) {
//        this.peso = peso;
//        //this.IMC=this.calcularIMC();
//    }
//
//    public double getIMC() {
//        return IMC;
//    }
//
//   
//    
//    //************** metodos propio ************
//    
//    
//    //Metodo para imprimir la informacion de la clase
//    public void imprimirDatos(){
//        System.out.println("Nombre:"+this.nombre);
//        System.out.println("Edad:"+this.edad);
//        System.out.println("DNI:"+this.dni);
//        System.out.println("Altura:"+this.altura);
//        System.out.println("Peso:"+this.peso);
//        System.out.printf("IMC:%.2f\n",this.IMC);
//    }
//    
//    //Metodo privado para calcular el IMC
//    private double calcularIMC(){
//        //Calculo el IMC
//        double IMC=this.peso/(this.altura*this.altura);
//        return IMC;
//    }
//    
//    
//    
//   
//   
//    
//    
//    
//}
