/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade2;

/**
 *
 * @author ramadan
 */
public class Animal {
    protected String nome, cor, ambiente;
    protected int patas;
    
    public Animal(String nome, String cor, String ambiente, int patas) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.patas = patas;
    }
    
        public String getNome() {
            return this.nome;
        }
            public String getCor() {
                return this.cor;
            }
                public String getAmbiente() {
                    return this.ambiente;
                }
                    public int getPatas() {
                        return this.patas;
                    }
                    public void setPatas(int patas) {
                        this.patas = patas;
                    }
                public void setAmbiente(String ambiente) {
                    this.ambiente = ambiente;
                }
            public void setCor(String cor) {
                this.cor = cor;
            }
        public void setNome(String nome) {
            this.nome = nome;
        }
    public String toString() {
        return ( " Nome             : "+this.nome+"\n"
                +" Cor              : "+this.cor+"\n"
                +" Ambiente         : "+this.ambiente+"\n"
                +" Patas            : "+this.patas);
    }
    
}
