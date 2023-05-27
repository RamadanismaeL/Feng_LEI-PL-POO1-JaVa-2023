/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividade_1;

/**
 *
 * @author ramadan
 */
public class Empregado extends Mcu {
    private String especialidade, cargo, outras_observacoes, grau_academico, instituicao;
    private double carga_horaria, salario_hora, hora_extra, valor_hora_extra, deducao, salario_total;
    private int nuit, inss;
    private boolean trabalho_extra;
    
    public Empregado(String data_ingresso, String nr_identificacao, String nome, String apelido, int ano_nascimento, String genero, String estado_civil, String nacionalidade, String endereco, String nr_bi, int telefone, String email, String grau_academico, String instituicao, String especialidade, String cargo, double carga_horaria, double salario_hora, boolean trabalho_extra, double hora_extra, double valor_hora_extra, double deducao, int nuit, int inss, String outras_observacoes) {
        super(data_ingresso, nr_identificacao, nome, apelido, ano_nascimento, genero, estado_civil, nacionalidade, endereco, nr_bi, telefone, email);
        this.grau_academico = grau_academico;
        this.instituicao = instituicao;
        this.especialidade = especialidade;
        this.cargo = cargo;
        this.outras_observacoes = outras_observacoes;
        this.carga_horaria = carga_horaria;
        this.hora_extra = hora_extra;
        this.valor_hora_extra = valor_hora_extra;
        this.deducao = deducao;
        this.nuit = nuit;
        this.inss = inss;
        this.trabalho_extra = trabalho_extra;
    }
    
public String getGrauAcademico() {
    return this.grau_academico;
}
    public String getInstituicao() {
        return this.instituicao;
    }
        public String getEspecialidade() {
            return this.especialidade;
        }
            public String getCargo() {
                return this.cargo;
            }
                public String getOutrasObservacoes() {
                    return this.outras_observacoes;
                }
                    public double getCargaHoraria() {
                        return this.carga_horaria;
                    }
                        public double getSalarioHora() {
                            return this.salario_hora;
                        }
                            public double getHoraExtra() {
                                return this.hora_extra;
                            }
                                public double getValorHoraExtra() {
                                    return this.valor_hora_extra;
                                }
                                    public double getDeducao() {
                                        return this.deducao;
                                    }
                                        public int getNuit() {
                                            return this.nuit;
                                        }
                                            public int getInss() {
                                                return this.inss;
                                            }
                                                public boolean getTrabalhoExtra() {
                                                    return this.trabalho_extra;
                                                }
                                                public void setTrabalhoExtra(boolean trabalho_extra) {
                                                    this.trabalho_extra = trabalho_extra;
                                                }
                                            public void setInss(int inss) {
                                                this.inss = inss;
                                            }
                                        public void setNuit(int nuit) {
                                            this.nuit = nuit;
                                        }
                                    public void setDeducao(double deducao) {
                                        this.deducao = deducao;
                                    }
                                public void setValorHoraExtra(double valor_hora_extra) {
                                    this.valor_hora_extra = valor_hora_extra;
                                }
                            public void setHoraExtra(double hora_extra) {
                                this.hora_extra = hora_extra;
                            }
                        public void setSalarioHora(double salario_hora) {
                            this.salario_hora = salario_hora;
                        }
                    public void serCargaHoraria(double carga_horaria) {
                        this.carga_horaria = carga_horaria;
                    }
                public void setOutrasObservacoes(String outras_observacoes) {
                    this.outras_observacoes = outras_observacoes;
                }
            public void setCargo(String cargo) {
                this.cargo = cargo;
            }
        public void setEspecialidade(String especialidade) {
            this.especialidade = especialidade;
        }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }
public void setGrauAcademico(String grau_academico) {
    this.grau_academico = grau_academico;
}
    
    public double CalcularSalario(double carga_horaria, double salario_hora, boolean trabalho_extra, double hora_extra, double valor_hora_extra, double deducao) {
        if (trabalho_extra == true) {
            salario_total = ((carga_horaria*salario_hora)+(hora_extra*valor_hora_extra) - deducao);
            return salario_total;
        } else {
            salario_total = (carga_horaria*salario_hora) - deducao;
            return salario_total;
        }
    }        
    public String toString() {
        return (super.toString()+"\n"
                + "Grau acadêmico           : "+this.getGrauAcademico()+"\n"
                + "Instituiçao              : "+this.getInstituicao()+"\n"
                + "Especialidade            : "+this.getEspecialidade()+"\n"
                + "Cargo                    : "+this.getCargo()+"\n"
                + "Carga horaria            : "+this.getCargaHoraria()+"\n"
                + "Salário por hora         : "+this.getSalarioHora()+"\n"
                + "Trabalho extra           : "+this.getTrabalhoExtra()+"\n"
                + "Hora extra               : "+this.getHoraExtra()+"\n"
                + "Valor da hora extra      : "+this.getValorHoraExtra()+"\n"
                + "Dedução                  : "+this.getDeducao()+"\n"
                + "Salário total            : "+this.CalcularSalario(this.getCargaHoraria(), this.getSalarioHora(), this.getTrabalhoExtra(), this.getHoraExtra(), this.getValorHoraExtra(), this.getDeducao())+"\n"
                + "NUIT                     : "+this.getNuit()+"\n"
                + "INSS                     : "+this.getInss()+"\n"
                + "Outras Observações       : "+this.getOutrasObservacoes());
    }
}
