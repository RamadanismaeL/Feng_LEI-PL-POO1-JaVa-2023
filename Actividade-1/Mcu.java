/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade_1;

/**
 *
 * @author ramadan
 */
public class Mcu {
    
    private String data_ingresso, nr_identificacao, nome, apelido, genero, estado_civil, nacionalidade, endereco, nr_bi, email;
    private int ano_nascimento, telefone;
    
    public Mcu(String data_ingresso, String nr_identificacao, String nome, String apelido, int ano_nascimento, String genero, String estado_civil, String nacionalidade, String endereco, String nr_bi, int telefone, String email) {
        this.data_ingresso = data_ingresso;
        this.nr_identificacao = nr_identificacao;
        this.nome = nome;
        this.apelido = apelido;
        this.ano_nascimento = ano_nascimento;
        this.genero = genero;
        this.estado_civil = estado_civil;
        this.nacionalidade = nacionalidade;
        this.endereco = endereco;
        this.nr_bi = nr_bi;
        this.telefone = telefone;
        this.email = email;
    }
    
        public String getDataIngresso() {
            return this.data_ingresso;
        }
            public String getNrIdentificacao() {
                return this.nr_identificacao;
            }
                public String getNome() {
                    return this.nome;
                }
                    public String getApelido() {
                        return this.apelido;
                    }
                        public int getAnoNascimento() {
                            return this.ano_nascimento;
                        }
                            public String getGenero() {
                                return this.genero;
                            }
                                public String getEstadoCivil() {
                                    return this.estado_civil;
                                }
                                    public String getNacionalidade() {
                                        return this.nacionalidade;
                                    }
                                        public String getNrBi() {
                                            return this.nr_bi;
                                        }
                                            public int getTelefone() {
                                                return this.telefone;
                                            }
                                                public String getEndereco() {
                                                    return this.endereco;
                                                }
                                                    public String getEmail() {
                                                        return this.email;
                                                    }
                                                    public void setEmail(String email) {
                                                        this.email = email;
                                                    }
                                                public void setEndereco(String endereco) {
                                                    this.endereco = endereco;
                                                }
                                            public void setTelefone(int telefone) {
                                                this.telefone = telefone;
                                            }
                                        public void setNrBi(String nr_bi) {
                                            this.nr_bi = nr_bi;
                                        }
                                    public void setNacionalidade(String nacionalidade) {
                                        this.nacionalidade = nacionalidade;
                                    }
                                public void setEstadoCivil(String estado_civil) {
                                    this.estado_civil = estado_civil;
                                }
                            public void setGenero(String genero) {
                                this.genero = genero;
                            }
                        public void setAnoNascimento(int ano_nascimento) {
                            this.ano_nascimento = ano_nascimento;
                        }
                    public void setApelido(String apelido) {
                        this.apelido = apelido;
                    }
                public void setNome(String nome) {
                    this.nome = nome;
                }
            public void setNrIdentificacao(String nr_identificacao) {
                this.nr_identificacao = nr_identificacao;
            }
        public void setDataIngresso(String data_ingresso) {
            this.data_ingresso = data_ingresso;
        }
    
    public int CalcularIdade(int ano_nascimento) {
        int idade = 2023 - ano_nascimento;
        return idade;
    }
    
    public String toString() {
        return  ( "Data do ingresso         : "+this.getDataIngresso()+"\n"
                + "Número de Identificação  : "+this.getNrIdentificacao()+"\n"
                + "Nome                     : "+this.getNome()+"\n"
                + "Apelido                  : "+this.getApelido()+"\n"
                + "Idade                    : "+CalcularIdade(this.getAnoNascimento())+"\n"
                + "Gênero                   : "+this.getGenero()+"\n"
                + "Estado Civil             : "+this.getEstadoCivil()+"\n"
                + "Nacionalidade            : "+this.getNacionalidade()+"\n"
                + "Endereço                 : "+this.getEndereco()+"\n"
                + "Nr. do BI                : "+this.getNrBi()+"\n"
                + "Telefone                 : "+this.getTelefone()+"\n"
                + "E-mail                   : "+this.getEmail());
    }
    
}
