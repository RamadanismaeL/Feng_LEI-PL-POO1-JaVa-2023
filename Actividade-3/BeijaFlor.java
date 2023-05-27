/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade3;

/**
 *
 * @author ramadan
 */
public class BeijaFlor extends Ave {
    public BeijaFlor(String nome, int idade, String cor, double altura, double peso, int patas, String ambiente, String corPenas) {
        super(nome, idade, cor, altura, peso, patas, ambiente, corPenas);
    }
    
    public String toStringBF() {
        return ( super.toStringA()+"\n"
                +"* * * * * * B E I J A - F L O R * * * * * *"+"\n"
                +"*******************************************"+"\n"
                +super.toString()+"\n"
                +"Cor das penas  : "+super.getCorPenas());
    }
}
