/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade3;

/**
 *
 * @author ramadan
 */
public class Ave extends Animal implements InterAve {
    private String corPenas;
    
    public Ave(String nome, int idade, String cor, double altura, double peso, int patas, String ambiente, String corPenas) {
        super(nome, idade, cor, altura, peso, patas, ambiente);
        this.corPenas = corPenas;
    }
        public String getCorPenas() {
            return this.corPenas;
        }
        public void setCorPenas(String corPenas) {
            this.corPenas = corPenas;
        }
        //Interface do Ave
    @Override
    public void AgitarPenas() {
    System.out.println("Agitando penas!");
    }
        @Override
        public void BalancarAsas() {
            System.out.println("Balançando asas!");
        }
            @Override
            public void SugarNectar() {
                System.out.println("O Beija-Flor está sugando nectar!");
            }
                @Override
                public void Voar() {
                System.out.println("O Beija-Flor está voando!");
                }
    public String toStringA() {
        return ( "==========================================="+"\n"
                +"* * *   * * * *   A V E   * * * *   * * *"+"\n"
                +"*******************************************"+"\n"
                +"+       - - -     T I P O     - - -       +"+"\n\n");
    }
}