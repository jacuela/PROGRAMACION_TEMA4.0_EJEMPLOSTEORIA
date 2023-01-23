/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2_gato;

/**
 *
 * @author juan.antonio
 */
public class Gato {
    private String color;
    private int edad;
    private String sexo;
    
    public Gato(String c, int e, String s){
        this.color=c;
        this.edad=e;
        this.sexo=s;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void maulla(){
        System.out.println("-Miauuuuuuu!");
    }
    
    public void ronronea(){
        System.out.println("-Grrrrrrr");
    }
    
    public void comer(String comida){
        if (comida.equals("pescado"))
            System.out.println("-Me encanta el pescado!");
        else
            System.out.println("-No me gusta el "+comida+". Solo como pescado");
    }
    
    public void peleaCon(Gato contrincante){
        if (this.sexo.equals("hembra"))
            System.out.println("no me gusta pelear.");
        else if (contrincante.getSexo().equals("hembra"))
            System.out.println("no me peleo con hembras");
        else
            System.out.println("Te vas a enterar @@#!!*#");
    }
    
}
