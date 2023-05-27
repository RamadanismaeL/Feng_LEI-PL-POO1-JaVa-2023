/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade_1;

/**
 *
 * @author ramadan
 */
public class Estudante extends Mcu {
    private String instituicao, curso;
    
    public Estudante(String data_ingresso, String nr_identificacao, String nome, String apelido, int ano_nascimento, String genero, String estado_civil, String nacionalidade, String endereco, String nr_bi, int telefone, String email, String instituicao, String curso) {
        super(data_ingresso, nr_identificacao, nome, apelido, ano_nascimento, genero, estado_civil, nacionalidade, endereco, nr_bi, telefone, email);
        this.instituicao = instituicao;
        this.curso = curso;
    }
    
        public String getInstituicao() {
            return this.instituicao;
        }
            public String getCurso() {
                return this.curso;
            }
            public void setCurso(String curso) {
                this.curso = curso;
            }
        public void setInstituicao(String instituicao) {
            this.instituicao = instituicao;
        }
        
    public String toStringE() {
        return ( "============================================================\n"
                +"- - - - -  D A D O S    D O    E S T U D A N T E  - - - - -\n"
                +"-----------------------------------------------------------\n"
                +super.toString()+"\n"
                + "Instituição              : "+this.getInstituicao()+"\n"
                + "Curso                    : "+this.getCurso());
    }
    public String toString() {
        return (super.toString()+"\n"
                + "Instituição              : "+this.getInstituicao()+"\n"
                + "Curso                    : "+this.getCurso());
    }
    
}
