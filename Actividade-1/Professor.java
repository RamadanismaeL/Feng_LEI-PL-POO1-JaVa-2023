/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade_1;

/**
 *
 * @author ramadan
 */
public class Professor extends Funcionario {
    public Professor(String data_ingresso, String nr_identificacao, String nome, String apelido, int ano_nascimento, String genero, String estado_civil, String nacionalidade, String endereco, String nr_bi, int telefone, String email, String especialidade, String grau_academico, String instituicao, String cargo, double carga_horaria, double salario_hora, boolean trabalho_extra, double hora_extra, double valor_hora_extra, double deducao, int nuit, int inss, String outras_observacoes) {
        super(data_ingresso, nr_identificacao, nome, apelido, ano_nascimento, genero, estado_civil, nacionalidade, endereco, nr_bi, telefone, email, especialidade, grau_academico, instituicao, cargo, carga_horaria, salario_hora, trabalho_extra, hora_extra, valor_hora_extra, deducao, nuit, inss, outras_observacoes);
    }
    public boolean MinistrarAula() {
        return true;
    }
    public boolean CancelarAula() {
        return true;
    }
    public String AvaliarEstudante() {
        return "";
    }
    public String PresencaEstudante() {
        return "";
    }
    
    public String toStringP() {
        return ( "============================================================="+"\n"
                +"- - - - - - D A D O S    D O    P R O F E S S O R - - - - - -"+"\n"
                +"-------------------------------------------------------------"+"\n"
                +super.toString());
    }
    
}
