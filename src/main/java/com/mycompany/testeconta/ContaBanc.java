package com.mycompany.testeconta;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 55199
 */
public class ContaBanc {
    private int numeroConta;
    private double saldo;
    private List<String> transacoes;

    public ContaBanc(int numeroConta, double saldo, List<String> transacoes) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.transacoes = transacoes != null ? transacoes : new ArrayList<>();
    }

    public ContaBanc() {
        this.transacoes = new ArrayList<>();
    }
    

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<String> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(String transacao) {
        this.transacoes.add(transacao);
    }
}
