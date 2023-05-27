/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade3;

/**
 *
 * @author ramadan
 */
public class Mamifero extends Animal{
    public Mamifero(String nome, int idade, String cor, double altura, double peso, int patas, String ambiente) {
        super(nome, idade, cor, altura, peso, patas, ambiente);
    }
    public String toStringM() {
        return ( "==========================================="+"\n"
                +"* * * * * * * M A M Í F E R O * * * * * * *"+"\n"
                +"*******************************************"+"\n"
                +"+       - - -     T I P O     - - -       +"+"\n\n");
    }
}
