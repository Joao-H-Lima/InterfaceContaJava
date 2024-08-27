/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeconta;

/**
 *
 * @author 55199
 */
public class Extrato implements InterfaceTransacoes{

    @Override
    public void extrato(ContaBanc conta){
                
        System.out.println("\n----EXTRATO----");
        System.out.println("Conta N° :"+conta.getNumeroConta());
        System.out.println("------------------------------- ");
        System.out.println("----TRANSACOES---- ");
        for(String transacao : conta.getTransacoes()){
            System.out.println(transacao);
        }
        System.out.println("Saldo Atual: "+ conta.getSaldo());
    }
    
    @Override
    public boolean deposito(ContaBanc conta, double valor){
       // System.out.println("Não houve deposito ");
        return false;
    }
    
    @Override
    public boolean saque(ContaBanc conta, double valor){
        return false;
    }
}
