/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade3;

/**
 *
 * @author ramadan
 */
public class Homem extends Mamifero implements InterHumano {
    public Homem(String nome, int idade, String cor, double altura, double peso, int patas, String ambiente) {
        super(nome, idade, cor, altura, peso, patas, ambiente);
    }
    //Interface Humano
    @Override
    public void Escrever() {
        System.out.println("Escrevendo....!");
    }
        @Override
        public void Ler() {
            System.out.println("Lendo!");
        }
    public String toStringH() {
        return ( super.toStringM()+"\n"
                +"* * *    * * * - H O M E M - * * *    * * *"+"\n"
                +"*******************************************"+"\n"
                +super.toString());
    }
}
