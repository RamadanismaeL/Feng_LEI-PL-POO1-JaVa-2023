/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade2;
/**
 *
 * @author ramadan
 */
public class Peixe extends Animal {
    private String caract;
    public Peixe(String nome, String caract) {
        super (nome, "Castanha", "Aquático", 0);
        this.caract = caract;
    }
    
    public String getCaract() {
        return this.caract;
    }
    public void setCaract(String caract) {
        this.caract = caract;
    }
    public String toStringP(){
        return ( "====================================================="+"\n"
                +"- - - - - - D A D O S    D O    P E I X E - - - - - -"+"\n"
                +"-----------------------------------------------------"+"\n"
                +" Nome             : "+super.getNome()+"\n"
                +" Caracteristica   : "+this.getCaract());
    }
    
}