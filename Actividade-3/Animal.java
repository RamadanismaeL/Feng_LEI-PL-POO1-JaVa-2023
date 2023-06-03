/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade3;

/**
 *
 * @author ramadan
 */
public class Animal implements InterAnimal {
    private  String nome, cor, ambiente;
    private int idade, patas;
    private double altura, peso;
    
    public Animal(String nome, int idade, String cor, double altura, double peso, int patas, String ambiente) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.patas = patas;
        this.ambiente = ambiente;
    }
    
        public String getNome() {
            return this.nome;
        }
            public int getIdade() {
                return this.idade;
            }
                public String getCor() {
                    return this.cor;
                }
                    public double getAltura() {
                        return this.altura;
                    }
                        public double getPeso() {
                            return this.peso;
                        }
                            public int getPatas() {
                                return this.patas;
                            }
                                public String getAmbiente() {
                                    return this.ambiente;
                                }
                                public void setAmbiente(String ambiente) {
                                    this.ambiente = ambiente;
                                }
                            public void setPatas(int patas) {
                                this.patas = patas;
                            }
                        public void setPeso(double peso) {
                            this.peso = peso;
                        }
                    public void setAltura(double altura) {
                        this.altura = altura;
                    }
                public void setCor(String cor) {
                    this.cor = cor;
                }
            public void setIdade(int idade) {
                this.idade = idade;
            }
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        //Interface Animal
        @Override
                public void BalancarCauda() {
                System.out.println("Está balançando a cauda!");
                }
                    @Override
                    public void Brigar() {
                    System.out.println("Está brigando.....!");
                    }
                        @Override
                        public void Caminhar() {
                        System.out.println("Caminhando!");
                        }
                            @Override
                            public void Correr() {
                                System.out.println("Está correndo!");
                            }
                                @Override
                                public void Descansar() {
                                System.out.println("Está descansando!");
                                }
                                    @Override
                                    public void EmitirSom() {
                                    System.out.println("Está emitindo som...!");
                                    }
                                        @Override
                                        public void Escalada() {
                                        System.out.println("Está escalando....!");
                                        }
                                            @Override
                                            public void Escavacao() {
                                            System.out.println("Escavando.!");
                                            }
                                                @Override
                                                public void Mover() {
                                                System.out.println("Em movimento......!");
                                                }       
                                                    @Override
                                                    public void Natacao() {
                                                    System.out.println("Está surfando no mar...!");
                                                    }
                                                        @Override
                                                        public void Pular() {
                                                        System.out.println("Está pulando!");
                                                        }
                                                        @Override
                                                                public void Rastejar() {
                                                                System.out.println("Rastejando......!");
                                                                }
                                                                    @Override
                                                                    public void Sentar() {
                                                                    System.out.println("Sentado!");
                                                                    }
                                                                        @Override
                                                                        public void Trabalhar() {
                                                                        System.out.println("Trabalhando...!");
                                                                        }
    public String toString() {
        return ( "Nome           : "+this.nome+"\n"
                +"Idade          : "+this.idade+"\n"
                +"Cor            : "+this.cor+"\n"
                +"Altura         : "+this.altura+"\n"
                +"Peso           : "+this.peso+"\n"
                +"Patas          : "+this.patas+"\n"
                +"Ambiente       : "+this.ambiente);
    }
}
