/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade_1;

/**
 *
 * @author ramadan
 */
public class Graduado extends Estudante {
    private int ano_formacao;
    private boolean realizar_pesquisa, escrever_relatorio, apresentar_trabalho;
    
    public Graduado(String data_ingresso, String nr_identificacao, String nome, String apelido, int ano_nascimento, String genero, String estado_civil, String nacionalidade, String endereco, String nr_bi, int telefone, String email, String instituicao, String curso, int ano_formacao) {
        super(data_ingresso, nr_identificacao, nome, apelido, ano_nascimento, genero, estado_civil, nacionalidade, endereco, nr_bi, telefone, email, instituicao, curso);
        this.ano_formacao = ano_formacao;
        this.realizar_pesquisa = false;
        this.escrever_relatorio = false;
        this.apresentar_trabalho = false;
    }
    
        public int getAnoFormacao() {
            return this.ano_formacao;
        }
            public boolean getRealizarPesquisa() {
                return this.realizar_pesquisa;
            }
                public boolean getEscreverRelatorio() {
                    return this.escrever_relatorio;
                }
                    public boolean getApresentarTrabalho() {
                        return this.apresentar_trabalho;
                    }
                    public void setApresentarTrabalho(boolean apresentar_trabalho) {
                        this.apresentar_trabalho = apresentar_trabalho;
                    }
                public void setEscreverRelatorio(boolean escrever_relatorio) {
                    this.escrever_relatorio = escrever_relatorio;
                }
            public void setRealizarPesquisa(boolean realizar_pesquisa) {
                this.realizar_pesquisa = realizar_pesquisa;
            }                
        public void setAnoFormacao(int ano_formacao) {
            this.ano_formacao = ano_formacao;
        }
    
        
    public String toString() {
        return ( "=============================================================\n"
                +"- - - - - -  D A D O S    D O    G R A D U A D O  - - - - - -\n"
                +"-------------------------------------------------------------\n"
                +super.toString()+"\n"
                + "Ano de formação          : "+this.getAnoFormacao()+"\n"
                + "Realizando pesquisa      : "+this.getRealizarPesquisa()+"\n"
                + "Escrever relatório       : "+this.getEscreverRelatorio()+"\n"
                + "Apresentar trabalho      : "+this.getApresentarTrabalho());
    }
    
}
