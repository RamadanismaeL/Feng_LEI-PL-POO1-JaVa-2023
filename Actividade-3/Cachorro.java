/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade3;

/**
 *
 * @author ramadan
 */
public class Cachorro extends Mamifero {
    Cachorro (String nome, int idade, String cor, double altura, double peso, int patas, String ambiente) {
        super(nome, idade, cor, altura, peso, patas, ambiente);
    }
    
    public String toStringC() {
        return ( super.toStringM()+"\n"
                +"* * * * * * * C A C H O R R O * * * * * * *"+"\n"
                +"*******************************************"+"\n"
                +super.toString());
    }
}
