/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade2;

/**
 *
 * @author ramadan
 */
public class Mamifero extends Animal {
    public Mamifero(String nome, String cor, int patas) {
        super (nome, cor, "", patas);
    }
    public String toStringM(){
        return ( "==================================================="+"\n"
                +"- - - - D A D O S    D O    M A M Í F E R O - - - -"+"\n"
                +"---------------------------------------------------"+"\n"
                +super.getNome()+"\n"
                +super.getCor()+"\n"
                +super.getPatas());
    }
}
