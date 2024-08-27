package com.mycompany.testeconta;


import com.mycompany.testeconta.ContaBanc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author 55199
 */
public interface InterfaceTransacoes {
    abstract boolean saque(ContaBanc conta, double valor);
    abstract boolean deposito(ContaBanc conta, double valor);
    abstract void extrato(ContaBanc conta);
}
