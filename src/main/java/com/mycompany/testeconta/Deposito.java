/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testeconta;

/**
 *
 * @author 55199
 */
public class Deposito implements InterfaceTransacoes{
    @Override
    public boolean deposito(ContaBanc conta, double valor){
        if(valor >= 0){
            double novoValor = conta.getSaldo() + valor;
            conta.setSaldo(novoValor);
            conta.adicionarTransacao("Depósito: " + valor);
            System.out.println("\nDepósito realizado com Sucesso! ");
            return true;
        }else{
            System.out.println("\nDepósito não Realizadoo! ");
            return false;
        }
    }
    
    @Override
    public boolean saque(ContaBanc conta, double valor){
        return false;
    }
    
    @Override
    public void extrato(ContaBanc conta){
                
    }
}
