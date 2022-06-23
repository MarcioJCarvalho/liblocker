package br.com.mjc.model;

import java.sql.Date;

public class Reserva {
    private Date dataHoraDevolucao;
    private Date dataHoraEmprestimo;
    private Pessoa pessoa;
    private Armario armario;


    public Reserva() {
    }

    public Reserva(Date dataHoraDevolucao, Date dataHoraEmprestimo, Pessoa pessoa, Armario armario) {
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
        this.pessoa = pessoa;
        this.armario = armario;
    }      

    public Date getDataHoraDevolucao() {
        return this.dataHoraDevolucao;
    }

    public void setDataHoraDevolucao(Date dataHoraDevolucao) {
        this.dataHoraDevolucao = dataHoraDevolucao;
    }

    public Date getDataHoraEmprestimo() {
        return this.dataHoraEmprestimo;
    }

    public void setDataHoraEmprestimo(Date dataHoraEmprestimo) {
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Armario getArmario() {
        return this.armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }
    
}
