package com.mycompany.testeconta;


import com.mycompany.testeconta.InterfaceTransacoes;
import com.mycompany.testeconta.ContaBanc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 55199
 */
public class Saque implements InterfaceTransacoes{   
        
    @Override
    public boolean saque(ContaBanc conta, double valor){
        if(conta.getSaldo() >= valor){
            double novoValor = conta.getSaldo() - valor;
            conta.setSaldo(novoValor);
            conta.adicionarTransacao("Saque: " + valor);
            System.out.println("\nSaque efetuado!");
            return true;
            
        }else{
            System.out.println("Saque não realizado !");
            return false;
        }
        
    }
    
    
    @Override
    public boolean deposito(ContaBanc conta, double valor){
        return false;
    }
    
    @Override
    public void extrato(ContaBanc conta){
        
    }
}
